package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        if (choice == 1) {
            Cli.greeting();
        } else if (choice != 0) {
            System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
            String userName = scanner.next();
            Engine.setUSER(userName);
            switch (choice) {
                case 2:
                    Even.startGame();
                    break;
                case 3:
                    Calc.startGame();
                    break;
                case 4:
                    GCD.startGame();
                    break;
                case 5:
                    Progression.startGame();
                    break;
                case 6:
                    Prime.startGame();
                    break;
                default:
                    break;
            }
        }
    }
}

