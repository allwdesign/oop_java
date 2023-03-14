package game.Unit;

import java.util.ArrayList;

public class Sniper extends Bowman {
    /*
     * Сlass Sniper - Снайпер дочерний класс класса Лучников
     * 
     * private int secrecy - маскировка.
     * 
     */
    private int secrecy;

    public Sniper(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed, int shots, int sharpshooting, int secrecy, int distance) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed, shots, sharpshooting, distance);
        this.secrecy = secrecy;
    }

    public Sniper(String name, int x, int y) {
        super(name, x, y, 15, 15, 12, 10, 8, 10, 9, 32, 9, 15);
        this.secrecy = 10;
    }

    public int getSecrecy() {
        return secrecy;
    }

    public void setSecrecy(int secrecy) {
        this.secrecy = secrecy;
    }

    @Override
    public String getInfo() {
        String str = "Снайпер" + super.getInfo();
        return str;
    }

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {
        super.step(friends, enemies);
    }

    

}
