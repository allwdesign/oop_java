package game.Unit;

public class Bandit extends Person {
    String name;
    int smartness;

    public Bandit(String name) {
        super(85.0, 100, 90, 5, 3);
        this.name = name;
        this.smartness = 10;
    }

    public void rob(Bowman injured) {
        injured.setCartridges(injured.getCartridges() - this.damage);
    }

    @Override
    public String getInfo() {
        return "Я бандит!";
    }

    @Override
    public void step() {
        super.step();
    }

}
