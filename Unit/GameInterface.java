package game.Unit;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Person> friends, ArrayList<Person> enemies);
    String getInfo();
}
