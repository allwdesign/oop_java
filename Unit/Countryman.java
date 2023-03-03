package game.Unit;

public class Countryman extends Person {

    int smartness;

    public Countryman(String name, int damage, Double health, int hardiness, int defense, int smartness) {
        super(name, damage, health, hardiness, defense);
        this.smartness = smartness;
    }

    public void feedCartridges() {
        System.out.println("The cartridges has been feed!");
    }

    public void getInfo() {
        System.out.printf(
                "Name: %s Health: %s Smartness: %d \n", super.getName(), super.getHealth().toString(), this.smartness);
    }

}
