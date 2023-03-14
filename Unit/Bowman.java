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

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {

        super.step(friends, enemies);
        if ((getCurrentHealth() == 0) || (getShots() == 0))
            return;

        // 3.2 Поиск среди противников наиболее приближённого.
        int index = super.findNearest(enemies);
        // 3.3 Нанести среднее повреждение найденному противнику.
        enemies.get(index).setCurrentHealth(getCurrentHealth() - (getMaxDamage() + getMinDamage()) / 2);

        // 3.4 Найти среди своих крестьянина. 
        // 3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
        for (Person friend: friends) {
            if (friend instanceof Countryman) {
                return;
            } else {
                this.goBang();
            }
        }
    }

}