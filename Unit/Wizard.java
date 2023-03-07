package game.Unit;

public class Wizard extends Healer {
    int magicLevel;

    public Wizard(String name) {
        super(93.0, 100, 75, 8, 3, 2);
        super.name = name;
        this.magicLevel = 4;
    }

    public void wiz() {
        System.out.println("Wiz.....");

    }

    @Override
    public String getInfo() {
        return "Я колдун!";
    }

    @Override
    public void step() {
        super.step();
    }
}
