package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int userChoice;
    public static String user;

    Engine(int userChoice) {
       this.userChoice = userChoice;
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
        Scanner scanner = new Scanner(System.in);
        Engine.user = scanner.nextLine();
        System.out.println("Hello, " + Engine.user + "!");
    }

    public static void flow(String requirement, String[] questions, int[] correctAnswers) {

        System.out.println(requirement);
        int attempt = 0;
        while (attempt <= 2) {
            System.out.println("Question: " + questions[attempt]);
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == correctAnswers[attempt]) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
                attempt++;
            } else {
                //result = false;
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswers[attempt] + "'.");
                System.out.println("Let's try again, " + Engine.user + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.user + "!");
    }
    public static void flow(String requirement, int[] questions, String[] correctAnswers) {

        System.out.println(requirement);
        int attempt = 0;
        while (attempt <= 2) {
            System.out.println("Question: " + questions[attempt]);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals(correctAnswers[attempt])) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
                attempt++;
            } else {
                //result = false;
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswers[attempt] + "'.");
                System.out.println("Let's try again, " + Engine.user + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.user + "!");
    }
}