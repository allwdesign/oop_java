package game.Unit;

import java.util.ArrayList;

public class Wizard extends Healer {
    /*
     * Сlass Healer - Колдун дочерний класс класса Лекари
     * 
     * Лечит только союзников: +5 к здоровью.
     * 
     */

    public Wizard(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed);
    }

    public Wizard(String name, int x, int y) {
        super(name, x, y, 30, 30, 17, 12, -5, -5, 9);
    }

    public void wiz() {
        System.out.println("Wiz.....");

    }

    @Override
    public String getInfo() {
        String str = "Колдун" + super.getInfo();
        return str;
    }

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {
        // Treats only allies(friends) +5 to health.
        System.out.println("Wizard step " + this.name);
        super.step(friends, enemies);
        

        
    }

    
}
