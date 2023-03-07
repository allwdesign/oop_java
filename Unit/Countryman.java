package game.Unit;

public class Countryman extends Person {
    String name;
    int smartness;

    public Countryman(String name) {
        super(75.0, 85, 90, 5, 5);
        this.name = name;
        this.smartness = 8;
    }

    public void feedCartridges(Bowman whom) {
        if (whom.changeMagazine()) {
            System.out.println("The cartridges has been feed!");
        }

    }

    @Override
    public String getInfo() {
        return "Я крестьянин!";
    }

    @Override
    public void step() {
        super.step();
    }

}
