package game.Unit;

public class Monk extends Healer {
    int godliness;

    public Monk(String name, int damage, Double health, int hardiness, int defense, int treatSkills, int godliness) {
        super(name, damage, health, hardiness, defense, treatSkills);
        this.godliness = godliness;
    }

    public void toPray() {
        System.out.println("We are pray ...");
    }
}
