package game.Unit;

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
    public int x, y;
    private int currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed;

    public Person(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed) {
        this.name = name;
        this.x = x;
        this.y = y;
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

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String getInfo() {
        return String.format(" : %s Здоровье: %s Атака: %s Защита: %s Скорость: %s", name, 
            getCurrentHealth(), getAttack(), getDefence(), getSpeed());
    }

    @Override
    public void step() {

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