package game.Unit;

public class Spearman extends Footman {
    /*
     * Сlass Spearman - Копейщик дочерний класс класса Пехотинец
     * 
     * private int spearProficiency - уровень владения копьем.
     * 
     */
    private int spearProficiency;

    public Spearman(String name, int x, int y) {
        super(name, x, y, 10, 10, 4, 5, 1, 3, 4);
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
        String str = "Пикинёр" + super.getInfo();
        return str;
    }

}
