package game.Unit;

import java.util.ArrayList;

public class Countryman extends Person {
    /*
     * Сlass Countryman - Крестьянин дочерний класс класса Персонаж
     * 
     * private int delivery - доставка.
     * 
     */
    private int delivery;

    public Countryman(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence,
            int minDamage, int maxDamage, int speed, int delivery) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed);
        this.delivery = delivery;
    }

    public Countryman(String name, int x, int y) {
        super(name, x, y, 1, 1, 1, 1, 1, 1, 3);
        this.delivery = 1;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public void feedCartridges(Bowman whom) {
        if (whom.changeMagazine()) {
            System.out.println("The cartridges has been feed!");
        }

    }

    @Override
    public String getInfo() {
        String str = "Крестьянин" + super.getInfo();
        return str;
    }

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {
        super.step(friends, enemies);
    }

    

}
