package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static String requirement = "Find the greatest common divisor of given numbers.";
    public static String[] questions = new String[3];
    public static String[] correctAnswers = new String[3];
    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
    public static void generateQuestionsAndAnswers() {

        for (int i = 0; i < 3; i++) {
            int n1 = new Random().nextInt(50);
            int n2 = new Random().nextInt(50);
            questions[i] = String.format("%d %d%n", n1, n2);
            correctAnswers[i] = Integer.toString(gcdByEuclidsAlgorithm(n1, n2));
        }
    }
    public static void startGame() {
        generateQuestionsAndAnswers();
        Engine.flow(requirement, questions, correctAnswers);
    }
}
