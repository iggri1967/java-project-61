package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String user;
    public static void runGame() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        Cli.user = scanner.nextLine();
        System.out.println("Hello, " + Cli.user + "!");
    }
}
