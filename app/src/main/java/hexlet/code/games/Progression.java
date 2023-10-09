package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static String requirement = "What number is missing in the progression?";
    public static String[] questions = new String[3];
    public static int[] correctAnswers = new int[3];
    public static void generateQuestionsAndAnswers() {
        for (int i = 0; i < 3; i++) {
            int n = 10; // number of progressing member
            int a = new Random().nextInt(10); // initinal member
            int b = new Random().nextInt(10); // step of progression
            int r = new Random().nextInt(2, 9); // index of removing member
            String progressionString = "";
            int removedElement = 0;
            for (int j = 0; j < n; j++) {
                if (j == r) {
                    removedElement = a + j * b;
                    progressionString += "..";
                } else {
                    progressionString += a + j * b;
                }
                if (j < n - 1) {
                    progressionString += " ";
                }
                questions[i] = progressionString;
                correctAnswers[i] = removedElement;
            }
        }
    }
    public static void startGame() {
        generateQuestionsAndAnswers();
        Engine.flow(requirement, questions, correctAnswers);
    }
}
