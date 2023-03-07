package game.Unit;

public class Monk extends Healer {
    int godliness;

    public Monk(String name) {
        super(70.0, 100, 60, 0, 8, 3);
        super.name = name;
        this.godliness = 90;
    }

    public void toPray() {
        System.out.println("We are pray ...");
    }

    @Override
    public String getInfo() {
        return "Я монах!";
    }

    @Override
    public void step() {
        super.step();
    }
}
