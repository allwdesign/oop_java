package game.Unit;

public abstract class Bowman extends Person {

    protected int cartridges;
    protected int maxCartriges;
    int sharpshooting;
    int speed;
    String name;

    public Bowman(Double health, int maxHealth, int hardiness, int damage, int defense, int cartridges,
            int maxCartriges, int sharpshooting, int speed) {
        super(health, maxHealth, hardiness, damage, defense);
        this.cartridges = cartridges;
        this.maxCartriges = maxCartriges;
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

    public int getMaxCartriges() {
        return maxCartriges;
    }

    public void setMaxCartriges(int maxCartriges) {
        this.maxCartriges = maxCartriges;
    }

    public void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }

    public boolean changeMagazine() {
        int crts = getCartridges();
        boolean changed = false;
        if (crts == 0) {
            setCartridges(10);
            changed = true;
        }
        return changed;

    }


}