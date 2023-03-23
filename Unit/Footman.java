package game.Unit;

import java.util.ArrayList;

public abstract class Footman extends Person {
    /*
     * Сlass Footman - Пехотинцы базовый абстрактный класс
     * 
     */

    public Footman(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed);
    }

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {
        // The distance to the enemy must be checked immediately

        // Search among enemies for the closest. Enemy must be alive
        int target = super.findNearest(enemies);
        // Deal moderate damage to found enemy.
        Person enemy = enemies.get(target);

        // We calculate what level of damage
        float damage = (enemy.getDefence() - this.getAttack() > 0) ?
                this.getMinDamage() : (enemy.getDefence() - this.getAttack() < 0) ?
                this.getMaxDamage() : (this.getMaxDamage() + this.getMinDamage()) / 2;

        // If the distance to the enemy is less than two cells
        if (this.coords.calcDistance(enemy.coords) < 2) {
            enemy.getDamage(damage);
            return;
        } else {
            // We determine in which direction we should go to the enemy
            coords.getDirection(enemy.coords);

            // Bypass your allies
            Person friend = friends.get(super.findNearest(friends));
            // To change a direction
            coords.getDirection(friend.coords);
        }

    }

}
