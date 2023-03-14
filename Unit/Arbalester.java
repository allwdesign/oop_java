package game.Unit;

import java.util.ArrayList;

public class Arbalester extends Bowman {
    /*
     * Сlass Arbalester - Арбалетчик дочерний класс класса Лучников
     * 
     */

    public Arbalester(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence,
            int minDamage, int maxDamage, int speed, int shots, int sharpshooting, int distance) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed, shots, sharpshooting,
                distance);
    }

    public Arbalester(String name, int x, int y) {
        super(name, x, y, 10, 10, 6, 3, 2, 3, 4, 16, 8, 10);
    }

    public void pullTheString() {
        System.out.println("Bowstring stretched!");
    }

    @Override
    public String getInfo() {
        String str = "Арбалетчик" + super.getInfo();
        return str;
    }

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {

        super.step(friends, enemies);
    }

}
