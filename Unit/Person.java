package game.Unit;

import java.util.ArrayList;

public abstract class Person implements GameInterface, Comparable<Person> {
    /**
     * Class Person - Персонаж базовый абстрактный класс для всех персонажей
     * 
     * String name - имя персонажа.
     * public int x, y;
     * 
     * private int currentHealth - текущий уровень здоровья;
     * private int maxHealth - максимальный уровень здоровья;
     * private int attack - аттака;
     * private int defence - защита;
     * private int minDamage - минимальный урон;
     * private int maxDamage - максимальный урон;
     * private int speed - скорость(определяет очередность хода персонажа).
     * 
     */
    public String name;
    public String state;
    private int currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed;
    protected Vector2D coords;

    public Person(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed) {
        state = "Stand";
        coords = new Vector2D(x, y);
        this.name = name;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defence = defence;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.speed = speed;        
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    protected int getMaxHealth() {
        return maxHealth;
    }

    protected void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    protected int getAttack() {
        return attack;
    }

    protected void setAttack(int attack) {
        this.attack = attack;
    }

    protected int getDefence() {
        return defence;
    }

    protected void setDefence(int defence) {
        this.defence = defence;
    }

    public int getMinDamage() {
        return minDamage;
    }

    protected void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    protected void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    protected int findNearest(ArrayList<Person> enemies) {
        int index = 0;
        double min = 100;
        for (int i = 0; i < enemies.size(); i++) {
            // enemy must be alive
            if (min > coords.calcDistance(enemies.get(i).coords) & !enemies.get(i).state.equals("Die")) {
                index = i;
                min = coords.calcDistance(enemies.get(i).coords);
            }
        }
        return index;
    }

    protected void getDamage(float damage) {
        currentHealth -= damage;
        if (currentHealth > maxHealth) currentHealth = maxHealth;
        if (currentHealth < 0) state = "Die";
    }

    @Override
    public String getInfo() {
        return String.format(" : %s. Здоровье: %s. Состояние: %s", name,
                getCurrentHealth(), this.state);
    }

    @Override
    public void step(ArrayList<Person> friends, ArrayList<Person> enemies) {

    }

    @Override
    public int compareTo(Person o) {
        if (this.getSpeed() > o.getSpeed())
            return 1;
        else if (this.getSpeed() < o.getSpeed())
            return -1;
        else
            return 0;
    }

}