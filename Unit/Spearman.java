package game.Unit;

public class Spearman extends Person {
    /*
     * Сlass Countryman - Крестьянин дочерний класс класса Персонаж
     * 
     * private int spearProficiency - уровень владения копьем.
     * 
     */
    private int spearProficiency;

    public Spearman(String name, int x, int y, int currentHealth, int maxHealth, int attack, int defence, int minDamage,
            int maxDamage, int speed, int spearProficiency) {
        super(name, x, y, currentHealth, maxHealth, attack, defence, minDamage, maxDamage, speed);
        this.spearProficiency = spearProficiency;
    }

    public Spearman(String name) {
        super(name, 0, 9, 10, 10, 4, 5, 1, 3, 4);
        this.spearProficiency = 7;
    }

    public int getSpearProficiency() {
        return spearProficiency;
    }

    public void setSpearProficiency(int spearProficiency) {
        this.spearProficiency = spearProficiency;
    }

    @Override
    public String getInfo() {
        String str = "Копейщик" + super.getInfo();
        return str;
    }

    @Override
    public void step() {
        super.step();
    }

}
