package game.Unit;

public class Wizard extends Healer {

    int magicLevel;

    public Wizard(String name, int damage, Double health, int hardiness, int defense, int treatSkills, int magicLevel) {
        super(name, damage, health, hardiness, defense, treatSkills);
        this.magicLevel = magicLevel;
    }

    public void wiz() {
        System.out.println("Wiz.....");

    }
}
