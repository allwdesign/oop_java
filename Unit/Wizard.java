package game.Unit;

public class Wizard extends Healer {
    /*
     * Сlass Healer - Колдун дочерний класс класса Лекари
     * 
     */

    public Wizard(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed);
    }

    public Wizard(String name) {
        super(name, 3, 5, 30, 30, 17, 12, -5, -5, 9);
    }

    public void wiz() {
        System.out.println("Wiz.....");

    }

    @Override
    public String getInfo() {
        String str = "Колдун" + super.getInfo();
        return str;
    }

    @Override
    public void step() {
        super.step();
    }
}
