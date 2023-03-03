package game.Unit;

public class Arbalester extends Bowman {

    public Arbalester(String name, int damage, Double health, int hardiness, int defense, int cartridges,
            int sharpshooting, int speed) {
        super(name, damage, health, hardiness, defense, cartridges, sharpshooting, speed);
    }

    public void pullTheString() {
        System.out.println("Bowstring stretched!");
    }
}
