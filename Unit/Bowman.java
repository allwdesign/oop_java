package game.Unit;

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
        System.out.println("Bang!");
        setShots(getShots() - 1);
    }

    public boolean changeMagazine() {
        boolean changed = false;
        if (getShots() == 0) {
            setShots(1);
            changed = true;
        }
        return changed;

    }

}