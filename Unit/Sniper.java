package game.Unit;

public class Sniper extends Bowman {
    int secrecy;

    public Sniper(String name, int damage, Double health, int hardiness, int defense, int cartridges, int sharpshooting,
            int speed, int secrecy) {
        super(name, damage, health, hardiness, defense, cartridges, sharpshooting, speed);
        this.secrecy = secrecy;
    }

    public void changeMagazine() {
        if (getCartridges() == 0) {
            setCartridges(10);
        }
    }

}
