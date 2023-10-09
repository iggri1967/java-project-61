package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Engine.listOfGames();
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

        switch (choice) {
            case 1:
                Cli.runGame();
                break;
            case 2:
                Cli.runGame();
                Even.startGame();
                break;
            case 3:
                Cli.runGame();
                Calc.startGame();
                break;
            case 4:
                Cli.runGame();
                GCD.startGame();
                break;
            case 5:
                Cli.runGame();
                Progression.startGame();
                break;
            case 6:
                Cli.runGame();
                Prime.startGame();
                break;
            default:
                break;
        }
    }
}

