package game.Unit;

public class Sniper extends Bowman {
    int secrecy;

    public Sniper(String name) {
        super(90.0, 100, 95, 90, 10, 10, 10, 97, 5);
        super.name = name;
        this.secrecy = 70;
    }

    @Override
    public String getInfo() {
        return "Я снайпер!";
    }

    @Override
    public void step() {
        super.step();
    }

}
