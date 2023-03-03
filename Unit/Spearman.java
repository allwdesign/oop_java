package game.Unit;

public class Spearman extends Person {
    int spearProficiency;

    public Spearman(String name, int damage, Double health, int hardiness, int defense, int spearProficiency) {
        super(name, damage, health, hardiness, defense);
        this.spearProficiency = spearProficiency;
    }

    public void spearAttack(Person whom) {
        Double wHealth = whom.getHealth();
        whom.setHealth(wHealth < this.damage ? 0 : wHealth - this.damage);
    }
    

}
