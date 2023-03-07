package game;

import java.util.ArrayList;
import java.util.Random;

import game.Unit.Arbalester;
import game.Unit.Bandit;
import game.Unit.Countryman;
import game.Unit.Monk;
import game.Unit.Person;
import game.Unit.Sniper;
import game.Unit.Spearman;
import game.Unit.Wizard;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> characters = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {

            switch (rnd.nextInt(9)) {
                case 0:
                    characters.add(new Monk(getName()));
                    break;
                case 1:
                    characters.add(new Wizard(getName()));
                    break;
                case 2:
                    characters.add(new Sniper(getName()));
                    break;
                case 3:
                    characters.add(new Countryman(getName()));
                    break;
                case 4:
                    characters.add(new Arbalester(getName()));
                    break;
                case 5:
                    characters.add(new Spearman(getName()));
                    break;
                default:
                    characters.add(new Bandit(getName()));
                    break;
            }

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(characters.get(i).getInfo());

        }
    }

    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }

}
