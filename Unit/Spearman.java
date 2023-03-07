package game.Unit;

public class Spearman extends Person {
    String name;
    int spearProficiency;

    public Spearman(String name) {
        super(88.0, 100, 87, 73, 6);
        this.name = name;
        this.spearProficiency = 2;
    }

    @Override
    public String getInfo() {
        return "Я копейщик!";
    }

    @Override
    public void step() {
        super.step();
    }

    

}
