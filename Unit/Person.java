package game.Unit;


public abstract class Person implements GameInterface{
    /**
     * monk монах
     * countryman крестьянин
     * bandit разбойник
     * sniper снайпер
     * wizard колдун
     * spearman копейщик пехота
     * arbalester арбалетчик
     */
    private Double health;
    private int maxHealth; 
    private int hardiness;
    protected int damage;
    protected int defense;

    public Person(Double health, int maxHealth, int hardiness, int damage, int defense) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.hardiness = hardiness;
        this.damage = damage;
        this.defense = defense;
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

    // public void greetingPerson() {
    // System.out.println("Hello! My name is " + this.getName() + ".");
    // }

    public void setHealth(Double health) {if (health >= 0) this.health = health;}


    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void attack(Person whom) {
        Double wHealth = whom.getHealth();
        whom.setHealth(wHealth < this.damage ? 0 : wHealth - this.damage);
    }

    @Override
    public String getInfo() {
        return "Я человек!";
    }

    @Override
    public void step() {
        
    }

    

}