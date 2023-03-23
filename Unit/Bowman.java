package game.Unit;

import java.util.ArrayList;

public abstract class Bowman extends Person {
    /*
     * Сlass Bowman - Лучники базовый абстрактный класс
     * 
     * private int shots - выстрелы;
     * private int sharpshooting - меткость;
     * private int distance - дистанция.
     * 
     */

    private int shots, sharpshooting, distance;

    public Bowman(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed, int shots, int sharpshooting, int distance) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed);
        this.shots = shots;
        this.sharpshooting = sharpshooting;
        this.distance = distance;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getSharpshooting() {
        return sharpshooting;
    }

    public void setSharpshooting(int sharpshooting) {
        this.sharpshooting = sharpshooting;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void goBang() {
        // 0 - if shots have ended
        this.setShots(this.getShots() > 0 ? this.getShots() - 1 : 0);
    }

    public boolean changeMagazine() {
        boolean changed = false;
        if (this.getShots() == 0) {
            this.setShots(1);
            changed = true;
        }
        return changed;

    }

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {      
        if (state.equals("Die") || getShots() <= 0) return;

        // Search among enemies for the closest. Enemy must be alive
        int target = super.findNearest(enemies);
        // Deal moderate damage to found enemy.
        Person enemy = enemies.get(target);
        float damage = (enemy.getDefence() - this.getAttack() > 0) ? 
            this.getMinDamage() : (enemy.getDefence() - this.getAttack() < 0) ?
            this.getMaxDamage() : (this.getMaxDamage() + this.getMinDamage()) / 2;

        enemy.getDamage(damage);

        // Find among your countryman.
        // If found, complete the method otherwise reduce the stock of arrows by one.
        for (int i = 0; i < friends.size(); i++) {
            Person friend = friends.get(i);            
            // if (friend instanceof Countryman) - slow!
            if (friend.getInfo().contains("Крестьянин") && friend.state.equals("Stand")) { 
                friend.state = "Busy";
                return;
            }
        }
        // Countryman not found. Reduce the stock of arrows by one.
        this.goBang();
        
    }

    @Override
    public String toString() {
        return super.toString() + " Shots:" + this.getShots();
    }
    
}