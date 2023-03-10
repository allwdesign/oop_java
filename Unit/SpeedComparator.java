package game.Unit;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getSpeed(), o2.getSpeed());
    }
    
}
