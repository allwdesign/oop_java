package game;

import game.Unit.Person;
import game.Unit.Vector2D;
import game.Main;

import java.util.Collections;

public class View {
    private static int step = 1;
    private static final int[] l = {0};
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String midl10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");
    private static void tabSetter(int cnt, int max){
        int dif = max - cnt + 2;
        if (dif>0) System.out.printf("%" + dif + "s", ":\t"); else System.out.print(":\t");
    }
    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }
    private static String getChar(int x, int y){
        String out = "| ";
        for (Person player: Main.allPlayers) {
            if (player.getCoords()[0] == x && player.getCoords()[1] == y){
                if (player.getCurrentHealth() <= 0) {
                    out = "|" + (AnsiColors.ANSI_RED + player.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                    break;
                }
                if (Main.team2.contains(player)) out = "|" + (AnsiColors.ANSI_GREEN + player.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                if (Main.team1.contains(player)) out = "|" + (AnsiColors.ANSI_BLUE + player.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                break;
            }
        }
        return out;
    }
    public static void view() {
        if (step == 1 ){
            System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
        }
        step++;
        Main.allPlayers.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        for (int i = 0; i < l[0]*2; i++) System.out.print("_");
        System.out.println("");
        System.out.print(top10 + "    ");
        System.out.print("Blue side");
        for (int i = 0; i < l[0]-9; i++) System.out.print(" ");
        System.out.println(":\tGreen side");
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i)); // 
        }
        System.out.print("|    ");
        System.out.print(Main.team1.get(0));
        tabSetter(Main.team1.get(0).toString().length(), l[0]);
        System.out.println(Main.team2.get(0));
        System.out.println(midl10);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|    ");
            System.out.print(Main.team1.get(i-1)); 
            tabSetter(Main.team1.get(i-1).toString().length(), l[0]);
            System.out.println(Main.team2.get(i-1)); 
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j)); // last string in table 
        }
        System.out.print("|    ");
        System.out.print(Main.team1.get(9));
        tabSetter(Main.team1.get(9).toString().length(), l[0]);
        System.out.println(Main.team2.get(9));
        System.out.println(bottom10);
    }
}
