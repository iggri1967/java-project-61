package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static String requirement = "What number is missing in the progression?";
    public static String[] questions = new String[Engine.COUNT_ROUNDS];
    public static int[] correctAnswersInt = new int[Engine.COUNT_ROUNDS];
    public static String[] correctAnswers = new String[Engine.COUNT_ROUNDS];

    public static void generateQuestionsAndAnswers() {
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int n = 10; // number of progressing members
            int a = random.nextInt(10); // initial member
            int b = random.nextInt(10); // step of progression
            int r = random.nextInt(n); // index of removing member
            int[] progression = generateArithmeticProgression(a, b, n);
            progression[r] = 0; // Remove the element at index 'r'
            questions[i] = formatProgression(progression);
            correctAnswersInt[i] = a + r * b;
            correctAnswers[i] = Integer.toString(correctAnswersInt[i]);
        }
    }

    private static int[] generateArithmeticProgression(int a, int b, int n) {
        int[] progression = new int[n];
        for (int j = 0; j < n; j++) {
            progression[j] = a + j * b;
        }
        return progression;
    }

    private static String formatProgression(int[] progression) {
        StringBuilder progressionString = new StringBuilder();
        for (int j = 0; j < progression.length; j++) {
            if (j > 0) {
                progressionString.append(" ");
            }
            progressionString.append(progression[j] == 0 ? ".." : progression[j]);
        }
        return progressionString.toString();
    }

    public static void startGame() {
        generateQuestionsAndAnswers();
        Engine.runGame(requirement, questions, correctAnswers);
    }
}
