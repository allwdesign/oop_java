package game.Unit;

public class Person {
    /**
     * monk монах
     * countryman крестьянин
     * bandit разбойник
     * sniper снайпер
     * wizard колдун
     * spearman копейщик пехота
     * arbalester арбалетчик
     */
    String name;
    protected int damage;
    Double health;
    int hardiness;
    protected int defense;

    public Person(String name, int damage, Double health, int hardiness, int defense) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.hardiness = hardiness;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public Double getHealth() {
        return health;
    }

    public int getHardiness() {
        return hardiness;
    }

    public void greetingPerson() {
        System.out.println("Hello! My name is " + this.getName() + ".");
    }

    public void setHealth(Double health) {
        this.health = health;
    }

}