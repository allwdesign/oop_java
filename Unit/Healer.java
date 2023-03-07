package game.Unit;

public abstract class Healer extends Person {
    int treatSkills;
    String name;

    public Healer(Double health, int maxHealth, int hardiness, int damage, int defense, int treatSkills) {
        super(health, maxHealth, hardiness, damage, defense);
        this.treatSkills = treatSkills;
    }

    public void toTreat(Person whom) {
        int maxH = whom.getMaxHealth();
        System.out.println("Your hero is cured :)");
        Double tmpHealth = whom.getHealth() * this.treatSkills;
        whom.setHealth(tmpHealth >=  maxH ? maxH : tmpHealth);
    }
}
