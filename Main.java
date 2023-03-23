package game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
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
    private static boolean finish = false;

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

        while (true){
            View.view();
            userInput.nextLine();
            for (Person player: allPlayers) {
                if (team1.contains(player)) {
                    if (enemiesAreAlive(team2) == true) {
                        player.step(team1, team2);    
                    } else {
                        congratulate(1); 
                        break;
                    }
                } else {
                    if (enemiesAreAlive(team1) == true) {
                        player.step(team2, team1);
                    } else {
                        congratulate(2);  
                        break;
                    }
                }
            }
            if (finish == true) break;
        }    
    }

    private static boolean enemiesAreAlive(ArrayList<Person> enemyTeam) {
        int allDied = 0;
        for (int i = 0; i < enemyTeam.size(); i++) {         
            Person enemy = enemyTeam.get(i);
            if (enemy.state.equals("Stand")) {
                return true;
            } else  {
            allDied++;
            }
        }
        if (allDied == TEAMSIZE) {          
            return false;
        }
        return finish;
    }

    public static void congratulate(int num) {
        String side = "";
        if (num == 1) side = " Blue";
        else side = " Green";

        System.out.println("Team " + num + side + " side" + " are Win!!!");
        finish = true;
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

    private static void createTeam(ArrayList<Person> team, int offset, int x) {

        for (int i = 1; i < TEAMSIZE + 1; i++) {

            int rnd = new Random().nextInt(4) + offset;
            
            switch (rnd) {
                case 0:
                    team.add(new Sniper(getName(), x, i));
                    break;
                case 1:
                    team.add(new Bandit(getName(), x, i));
                    break;
                case 2:
                    team.add(new Wizard(getName(), x, i));
                    break;
                case 3:
                    team.add(new Countryman(getName(), x, i));
                    break;
                case 4:
                    team.add(new Arbalester(getName(), x, i));
                    break;
                case 5:
                    team.add(new Monk(getName(), x, i));
                    break;
                case 6:
                    team.add(new Spearman(getName(), x, i));
                    break;
            }

        }
    }

    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }

}
