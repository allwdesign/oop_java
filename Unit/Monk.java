package game.Unit;

public class Monk extends Healer {
    /*
     * Сlass Monk - Монах дочерний класс класса Лекари. 
     * 
     * Лечит только союзников: +4 к здоровью.
     * 
     * private int godliness - набожность.
     * 
     */
    private int godliness;

    public Monk(String name, int x, int y) {
        super(name, x, y, 30, 30, 12, 7, -4, -4, 5);
        this.godliness = 9;
    }

    public int getGodliness() {
        return godliness;
    }

    protected void setGodliness(int godliness) {
        this.godliness = godliness;
    }

    public void toPray() {
        System.out.println("We are pray ...");
    }

    // The step method will be inherited from the Healer class

    @Override
    public String getInfo() {
        String str = "Монах" + super.getInfo();
        return str;
    }
    
}
