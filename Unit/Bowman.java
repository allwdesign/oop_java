package game.Unit;

public class Bowman extends Person {
    protected int cartridges;
    int sharpshooting;
    int speed;


    public Bowman(String name, int damage, Double health, int hardiness, int defense, int cartridges, int sharpshooting,
            int speed) {
        super(name, damage, health, hardiness, defense);
        this.cartridges = cartridges;
        this.sharpshooting = sharpshooting;
        this.speed = speed;
    }

    public void goBang() {
        System.out.println("Bang!");
        setCartridges(getCartridges() - 1);
    }

    public int getCartridges() {
        return cartridges;
    }

    public void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }

}