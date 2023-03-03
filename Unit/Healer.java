package game.Unit;

public class Healer extends Person {

    int treatSkills;

    public Healer(String name, int damage, Double health, int hardiness, int defense, int treatSkills) {
        super(name, damage, health, hardiness, defense);
        this.treatSkills = treatSkills;
    }

    public void toTreat(Person whom) {
        System.out.println("Your hero is cured :)");
        Double tmpHealth = whom.getHealth() * this.treatSkills;
        whom.setHealth( tmpHealth >= 100.0 ? 100 : tmpHealth);
    }
}
