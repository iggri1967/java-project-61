package hexlet.code;
import hexlet.code.games.Calc;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int userChoice;
    public static String user;

    Engine(int userChoice) {
        this.userChoice = userChoice;
        this.user = user;
    }
    public static void listOfGames() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.println("Your choice: " + choice());
    }
    public static int choice() {
        Scanner scanner = new Scanner(System.in);
       userChoice = scanner.nextInt();
        return userChoice;
    }
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = userName();
        System.out.println("Hello, " + name + "!");
    }
    public static String userName(){
        Scanner scanneruser = new Scanner(System.in);
        user = scanneruser.next();
        return user;
    }
    public static void flow() {
        System.out.println(Calc.requirement);
        int attempt = 1;
        boolean result = true;
        while (attempt <= 3 && result) {
            //int anyRandom = new Random().nextInt(1000); // count any of random number
            System.out.println("Question: " + Calc.question);
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == Calc.correctAnswer) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
                attempt++;
            } else {
                result = true;
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + Calc.correctAnswer + "'.");
                System.out.println("Let's try again, " + Engine.user + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.user + "!");
        return;
    }

}