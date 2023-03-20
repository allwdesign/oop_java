package game.Unit;

public class Sniper extends Bowman {
    /*
     * Сlass Sniper - Снайпер дочерний класс класса Лучников
     * 
     * private int secrecy - маскировка.
     * 
     */
    private int secrecy;

    public Sniper(String name, int x, int y) {
        super(name, x, y, 15, 15, 12, 10, 8, 10, 9, 32, 9, 15);
        this.secrecy = 10;
    }

    public int getSecrecy() {
        return secrecy;
    }

    protected void setSecrecy(int secrecy) {
        this.secrecy = secrecy;
    }

    // The step method will be inherited from the Bowman class

    @Override
    public String getInfo() {
        String str = "Снайпер" + super.getInfo();
        return str;
    }

}
