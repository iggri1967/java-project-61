package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;


public class TaskTwo {
    public static void secondTask() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int attempt = 1;
        boolean result = true;
        while (attempt <= 3 && result) {
            int anyRandom = new Random().nextInt(1000); // count any of random number
            System.out.println("Question: " + anyRandom);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (anyRandom % 2 == 0 && answer.equals("yes") || (anyRandom % 2 != 0 && answer.equals("no"))) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
                attempt++;
            } else {
                result = true;
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + (anyRandom % 2 == 0 ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + Engine.user + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.user + "!");
        return;
    }
}
