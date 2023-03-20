package game.Unit;

public class Arbalester extends Bowman {
    /*
     * Сlass Arbalester - Арбалетчик дочерний класс класса Лучников
     * 
     */

    public Arbalester(String name, int x, int y) {
        super(name, x, y, 10, 10, 6, 3, 2, 3, 4, 16, 8, 10);
    }

    public void pullTheString() {
        System.out.println("Bowstring stretched!");
    }

    // The step method will be inherited from the Bowman class

    @Override
    public String getInfo() {
        String str = "Арбалетчик" + super.getInfo();
        return str;
    }

}
