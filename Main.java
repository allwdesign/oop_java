package game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

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

    static final int TEAMSIZE = 10;
    public static ArrayList<Person> team1 = new ArrayList<>();
    public static ArrayList<Person> team2 = new ArrayList<>();
    public static ArrayList<Person> allPlayers = new ArrayList<>();
    private static boolean notEnd = true;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Нажмите Enter чтобы начать.");
        userInput.nextLine();
        // Players: Countryman, Bandit, Sniper, Wizard.
        createTeam(team1, 0, 1);
        // Players: Countryman, Spearman, Arbalester, Monk.
        createTeam(team2, 3, 10);

        allPlayers.addAll(team1);
        allPlayers.addAll(team2);

        sortTeam(allPlayers);

        // !(team1.isEmpty() || team2.isEmpty())
        while (notEnd) {
            View.view();
            userInput.nextLine();
            // Define friend or foe
            for (int i = 0; i < allPlayers.size(); i++) {
                Person player = allPlayers.get(i);
                // Выигрыш: Если все персонажи противника имеют состояние Die
                if (player.state.equals("Stand")) {
                    if (team1.contains(player)) {
                        checkEnemyTeam(team2, 1);
                        player.step(team1, team2);
                    } else {
                        checkEnemyTeam(team1, 2);
                        player.step(team2, team1);
                    }
                } else {
                    // player died
                    allPlayers.remove(player);
                }
            }

        }
    }

    private static void checkEnemyTeam(ArrayList<Person> enemyTeam, int winTeamNum) {
        for (Person enemy : enemyTeam) {
            if (enemy.state.equals("Stand"))
                return;
        }
        congratulate(winTeamNum);
        notEnd = false;
    }

    public static void congratulate(int num) {
        String side = "";
        if (num == 1)
            side = " Blue";
        else
            side = " Green";

        System.out.println("Team " + num + side + " side" + " are Win!!!");

    }

    public static void printPlayers(String msg, ArrayList<Person> players) {
        System.out.println(msg);
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).getInfo());
        }
    }

    private static void sortTeam(ArrayList<Person> team) {
        /*
         * Sort players by speed if speeds are not equal.
         * And sort by health if the speeds are equal.
         * 
         * From fast to slow.
         */

        team.sort(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                if (o2.getSpeed() == o1.getSpeed()) {
                    return (int) (o2.getCurrentHealth() - o1.getCurrentHealth());
                } else {
                    return (int) (o2.getSpeed() - o1.getSpeed());
                }
            }

        });
    }

    private static void createTeam(ArrayList<Person> team, int offset, int y) {

        for (int i = 1; i < TEAMSIZE + 1; i++) {

            int rnd = new Random().nextInt(4) + offset;
            switch (rnd) {
                case 0:
                    team.add(new Sniper(getName(), i + 1, y));
                    break;
                case 1:
                    team.add(new Bandit(getName(), i + 1, y));
                    break;
                case 2:
                    team.add(new Wizard(getName(), i + 1, y));
                    break;
                case 3:
                    team.add(new Countryman(getName(), i + 1, y));
                    break;
                case 4:
                    team.add(new Arbalester(getName(), i + 1, y));
                    break;
                case 5:
                    team.add(new Monk(getName(), i + 1, y));
                    break;
                case 6:
                    team.add(new Spearman(getName(), i + 1, y));
                    break;
            }

        }
    }

    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }

}
