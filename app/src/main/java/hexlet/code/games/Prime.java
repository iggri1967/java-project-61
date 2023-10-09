package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static String requirement = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static int[] questions = new int[3];
    public static String[] correctAnswers = new String[3];
    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void generateQuestionsAndAnswers() {
        for (int i = 0; i < 3; i++) {
            questions[i] = new Random().nextInt(2, 100);
            correctAnswers[i] = isPrime(questions[i]) ? "yes" : "no";
        }
    }
    public static void startGame() {
        generateQuestionsAndAnswers();
        Engine.flow(requirement, questions, correctAnswers);
    }
}
