package game.Unit;

public class Bandit extends Person {

    int smartness;

    public Bandit(String name, int damage, Double health, int hardiness, int defense, int smartness) {
        super(name, damage, health, hardiness, defense);
        this.smartness = smartness;
    }

    public void rob(Arbalester injured) {
        injured.setCartridges(injured.getCartridges() - 5);
    }

}
