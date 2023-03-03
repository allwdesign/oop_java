package game;

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
        Person person = new Person("Kate", 70, 100.0, 85, 80);
        System.out.println(person.getDamage()); // 70
        person.greetingPerson(); // Hello! My name is Kate.

        Arbalester arbalester = new Arbalester("Arbalester1", 74, 100.0, 90, 95, 20, 80, 80);
        arbalester.pullTheString(); // Bowstring stretched!
        arbalester.greetingPerson(); // Hello! My name is Arbalester1.

        Bandit bandit = new Bandit("Bandit1", 10, 85.0, 60, 70, 80);
        bandit.greetingPerson();
        bandit.rob(arbalester);

        System.out.println("Before rob: " + arbalester.getCartridges()); // 20
        System.out.println("After rob: " + arbalester.getCartridges()); // 15

        Sniper sniper = new Sniper("Sniper1", 90, 100.0, 90, 90, 10, 95, 25, 80);
        sniper.greetingPerson(); // Hello! My name is Sniper1.
        System.out.println("Before bang: " + sniper.getCartridges()); // Before bang: 10
        sniper.goBang(); // Bang!
        System.out.println("After bang: " + sniper.getCartridges()); // After bang: 9

        // Check changeMagazine()
        for (int i = 0; i < 9; i++) {
            sniper.goBang();
        }
        System.out.println("After bang: " + sniper.getCartridges()); // After bang: 0
        sniper.changeMagazine();
        System.out.println("After change magazine: " + sniper.getCartridges()); // After: 10

        Monk monk = new Monk("Monk1", 0, 70.0, 50, 60, 8, 70);
        monk.greetingPerson();
        monk.toPray();
        monk.toTreat(bandit); // 85.0*8
        System.out.println("Bandit health after treat: " + bandit.getHealth());

        Wizard wizard = new Wizard("Wizard1", 50, 93.0, 60, 50, 1, 1);
        wizard.greetingPerson();
        wizard.wiz();
        wizard.toTreat(monk); // 70.0*1
        System.out.println("Monk health after treat: " + monk.getHealth());

        Countryman countryman = new Countryman("Countryman1", 40, 75.0, 90, 65, 40);
        countryman.greetingPerson();
        countryman.getInfo(); // Name: Countryman1 Health: 75.0 Smartness: 40
        countryman.feedCartridges(); // The cartridges has been feed!

        Spearman spearman = new Spearman("Spearman1", 40, 88.0, 80, 90, 2);
        spearman.greetingPerson();
        System.out.println("Wizard health before spearAttack: " + wizard.getHealth()); // 93.0
        spearman.spearAttack(wizard);
        System.out.println("Wizard health after spearAttack: " + wizard.getHealth()); // 53.0
    }

}
