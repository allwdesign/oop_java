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

    protected boolean isLeft(Vector2D enemy) {
        // If the enemy more to the left it х the coordinate will be less, than at us
        if (enemy.x < this.x)
            return true;
        else
            return false;
    }

    protected boolean isAbove(Vector2D enemy) {
        if (enemy.y > this.y)
            return true;
        else
            return false;
    }

    protected boolean isSameCoord(Vector2D enemy) {
        if ((enemy.x == this.x) || (enemy.y == this.y))
            return true;
        else
            return false;
    }

    protected void getDirection(Vector2D enemy) {

        if (isLeft(enemy)) {
            // We move to the left = reduce x--
            this.x--;

        } else {
            // We move to the right = increase x++
            this.x++;
        }

        if (isAbove(enemy)) {
            // We moving up
            this.y++;
        } else {
            // We moving down
            this.y--;
        }

    }
}
