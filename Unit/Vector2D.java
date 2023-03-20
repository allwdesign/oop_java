package game.Unit;

public class Vector2D {
    protected int x;
    protected int y;
    
    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected Double calcDistance(Vector2D enemy) {
        return Math.sqrt(Math.pow(enemy.x - x, 2) + Math.pow(enemy.y - y, 2)); 
    }
}


