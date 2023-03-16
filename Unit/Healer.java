package game.Unit;

import java.util.ArrayList;

public abstract class Healer extends Person {
    /*
     * Сlass Healer - Лекари базовый абстрактный класс
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

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void toTreat(Person whom) {
        // int maxH = whom.getMaxHealth();
        // System.out.println("Your hero is cured :)");
        // int tmpHealth = whom.getCurrentHealth() * this.getMagic();
        // whom.setCurrentHealth(tmpHealth >= maxH ? maxH : tmpHealth);
        whom.getDamage(this.getMinDamage());
        System.out.println(this.getInfo() + " вылечил " + whom.getInfo());
    }

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {
        super.step(friends, enemies);
    }

}
