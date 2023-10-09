package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;


public class Calc {

    public static String requirement = "What is the result of the expression?";
    public static String[] questions = new String[3];
    public static String[] correctAnswers = new String[3];
    public static int[] correctAnswersInt = new int[3];
    public static void generateQuestionsAndAnswers() {
        for (int i = 0; i < 3; i++) {
            int a = new Random().nextInt(20);
            int b = new Random().nextInt(20);
            char sign = new Random().nextInt(20) % 2 == 0 ? '*' : '+';
            questions[i] = String.format("%d%c%d%n", a, sign, b);
            correctAnswersInt[i] = sign == '+' ? a + b : a * b;
            correctAnswers[i] = Integer.toString(correctAnswersInt[i]);
        }
    }
    public static void startGame() {
        generateQuestionsAndAnswers();
        Engine.flow(requirement, questions, correctAnswers);
    }
}
