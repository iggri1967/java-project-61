package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String user;
    public static final int COUNT_ROUNDS = 3;

    public static void setUSER(String userName) {
        user = userName;
    }
    public static void runGame(String requirement, String[] questions, String[] correctAnswers) {
        System.out.println("Hello, " + user + "!");
        System.out.println(requirement);
        int attempt = 0;
        while (attempt < COUNT_ROUNDS) {
            System.out.println("Question: " + questions[attempt]);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals(correctAnswers[attempt])) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
                attempt++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswers[attempt] + "'.");
                System.out.println("Let's try again, " + user + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + user + "!");
    }
}