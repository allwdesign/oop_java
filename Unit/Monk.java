package game.Unit;

import java.util.ArrayList;

public class Monk extends Healer {
    /*
     * Сlass Monk - Монах дочерний класс класса Лекари
     * 
     * private int godliness - набожность.
     * 
     */
    private int godliness;

    public Monk(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed, int godliness) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed);
        this.godliness = godliness;
    }

    public Monk(String name, int x, int y) {
        super(name, x, y, 30, 30, 12, 7, -4, -4, 5);
        this.godliness = 9;
    }

    public int getGodliness() {
        return godliness;
    }

    public void setGodliness(int godliness) {
        this.godliness = godliness;
    }

    public void toPray() {
        System.out.println("We are pray ...");
    }

    @Override
    public String getInfo() {
        String str = "Монах" + super.getInfo();
        return str;
    }

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {
        super.step(friends, enemies);
    }

    
}
