package game.Unit;

public class Arbalester extends Bowman {
    
    public Arbalester(Double health, int maxHealth, int hardiness, int damage, int defense, int cartridges,
            int maxCartriges, int sharpshooting, int speed, String name) {
        super(health, maxHealth, hardiness, damage, defense, cartridges, maxCartriges, sharpshooting, speed);
        super.name = name;
    }

    public Arbalester(String name) {
        super(100.0, 100, 100, 12, 8, 20, 20, 85, 78);
        super.name = name;
    }

    public void pullTheString() {
        System.out.println("Bowstring stretched!");
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик!";
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        super.step();
    }

    
}
