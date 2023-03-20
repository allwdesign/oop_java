package game.Unit;

import java.util.ArrayList;

public abstract class Healer extends Person {
    /*
     * Сlass Healer - Лекари базовый абстрактный класс.
     * 
     * Лечат только союзников.
     * 
     * private int magic - магия.
     * 
     */
    private int magic;

    public Healer(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed);
        this.magic = 1;
    }

    public int getMagic() {
        return magic;
    }

    protected void setMagic(int magic) {
        this.magic = magic;
    }

    private void toTreat(Person whom) {
        // Treats only friends
        whom.getDamage(this.getMinDamage());
        System.out.println(this.getInfo() + " вылечил " + whom.getInfo());
    }

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {
        if (!this.state.equals("Die")) {

            // Find among your character with health less than the maximum and cure him!
            for (int i = 0; i < friends.size(); i++) {
                Person friend = friends.get(i);
                
                if ((friend.getCurrentHealth() < friend.getMaxHealth()) && friend.state.equals("Stand")) {
                    this.toTreat(friend);
                    break;
                }
            }

        }
    }

}
