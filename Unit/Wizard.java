package game.Unit;

public class Wizard extends Healer {
    /*
     * Сlass Healer - Колдун дочерний класс класса Лекари
     * 
     * Лечит только союзников: +5 к здоровью.
     * 
     */

    public Wizard(String name, int x, int y) {
        super(name, x, y, 30, 30, 17, 12, -5, -5, 9);
    }

    public void wiz() {
        System.out.println("Wiz.....");

    }

    // The step method will be inherited from the Healer class

    @Override
    public String getInfo() {
        String str = "Колдун" + super.getInfo();
        return str;
    }

}
