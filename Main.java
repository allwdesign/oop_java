package game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import game.Unit.Arbalester;
import game.Unit.Bandit;
import game.Unit.Countryman;
import game.Unit.Monk;
import game.Unit.Person;
import game.Unit.Sniper;
import game.Unit.Spearman;
import game.Unit.SpeedComparator;
import game.Unit.Wizard;

public class Main {

    /*
     * Персонажи:
     * monk монах
     * countryman крестьянин
     * bandit разбойник
     * sniper снайпер
     * wizard колдун
     * spearman копейщик пехота
     * arbalester арбалетчик
     * 
     * 
     */
    public static void main(String[] args) {

        ArrayList<Person> team1 = new ArrayList<>();
        ArrayList<Integer> indexes1 = new ArrayList<>();
        indexes1.add(3);
        indexes1.add(6);
        indexes1.add(2);
        indexes1.add(1);

        System.out.println("Команда 1");
        System.out.println("Разрешены:  - Крестьянин, Разбойник, Снайпер или Колдун.");
        createTeam(team1, indexes1);

        ArrayList<Person> team2 = new ArrayList<>();
        ArrayList<Integer> indexes2 = new ArrayList<>();
        indexes2.add(3);
        indexes2.add(5);
        indexes2.add(4);
        indexes2.add(0);

        printPlayers("", team1);

        System.out.println("Команда 2");
        System.out.println("Разрешены:  - Крестьянин, Копейщик, Арбалетчик, Монах.");
        createTeam(team2, indexes2);

        printPlayers("", team2);

        ArrayList<Person> allPlayers = new ArrayList<>(team1);

        allPlayers.addAll(team2);

        // First variant with  Comparator<Person>() from largest to smallest
        printPlayers("Before sorting", allPlayers);

        allPlayers.sort(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o2.getSpeed()- o1.getSpeed();
            }

        });  

        // Second variant with with SpeedComparator() from smallest to largest
        // allPlayers.sort(new SpeedComparator());

        printPlayers("After sorting", allPlayers);
    }

    public static void printPlayers(String msg, ArrayList<Person> players) {
        System.out.println(msg);
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).getInfo());
        }
    }

    private static void createTeam(ArrayList<Person> team, ArrayList<Integer> indexes) {
        // team1[3, 6, 2, 1]
        // team2[3, 5, 4, 0]

        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {

            switch (indexes.get(rnd.nextInt(indexes.size()))) {
                case 0:
                    team.add(new Monk(getName()));
                    break;
                case 1:
                    team.add(new Wizard(getName()));
                    break;
                case 2:
                    team.add(new Sniper(getName()));
                    break;
                case 3:
                    team.add(new Countryman(getName()));
                    break;
                case 4:
                    team.add(new Arbalester(getName()));
                    break;
                case 5:
                    team.add(new Spearman(getName()));
                    break;
                default:
                    team.add(new Bandit(getName()));
                    break;
            }
        }
    }

    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }

}
