package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static String requirement = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String[] questions = new String[Engine.COUNT_ROUNDS];
    public static int[] questionsInt = new int[Engine.COUNT_ROUNDS];
    public static String[] correctAnswers = new String[Engine.COUNT_ROUNDS];
    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void generateQuestionsAndAnswers() {
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            questionsInt[i] = new Random().nextInt(2, 100);
            questions[i] = Integer.toString(questionsInt[i]);
            correctAnswers[i] = isPrime(questionsInt[i]) ? "yes" : "no";
        }
    }
    public static void startGame() {
        generateQuestionsAndAnswers();
        Engine.runGame(requirement, questions, correctAnswers);
    }
}
