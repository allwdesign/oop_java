package game.Unit;

import java.util.Random;

public class Bandit extends Footman {
    /*
     * Сlass Bandit - Разбойник дочерний класс класса Пехотинец
     * 
     * private int smartness - ловкость.
     * 
     */

    private int smartness;

    public Bandit(String name, int x, int y) {
        super(name, x, y, 10, 10, 8, 3, 2, 4, 6);
        this.smartness = 9;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public void rob(Bowman injured) {
        Random rnd = new Random();
        int diff = this.getMaxDamage() - this.getMinDamage();
        int i = rnd.nextInt(diff + 1);
        i += this.getMinDamage();
        injured.setShots(injured.getShots() - i);
    }

    @Override
    public String getInfo() {
        String str = "Разбойник" + super.getInfo();
        return str;
    }    
}
