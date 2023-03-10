package game.Unit;

import java.util.Random;

public class Bandit extends Person {
    /*
     * Сlass Bandit - Разбойник дочерний класс класса Персонаж
     * 
     * private int smartness - ловкость.
     * 
     */

    private int smartness;

    public Bandit(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed, int smartness) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed);
        this.smartness = smartness;
    }

    public Bandit(String name) {
        super(name, 3, 5, 10, 10, 8, 3, 2, 4, 6);
        this.smartness = 9;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public void rob(Bowman injured) {
        Random rnd = new Random();
        int diff = this.getMaxDamage() - this.getMinDamage();
        int i = rnd.nextInt(diff + 1);
        i += this.getMinDamage();
        injured.setShots(injured.getShots() - i);
    }

    @Override
    public String getInfo() {
        String str = "Разбойник" + super.getInfo();
        return str;
    }

    @Override
    public void step() {
        super.step();
    }

}
