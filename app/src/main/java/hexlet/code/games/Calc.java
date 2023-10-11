package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;


public class Calc {

    public static String requirement = "What is the result of the expression?";
    public static String[] questions = new String[Engine.COUNT_ROUNDS];
    public static String[] correctAnswers = new String[Engine.COUNT_ROUNDS];
    public static int[] correctAnswersInt = new int[Engine.COUNT_ROUNDS];
    public static void generateQuestionsAndAnswers() {
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int a = random.nextInt(20);
            int b = random.nextInt(20);
            char sign = random.nextInt(20) % 2 == 0 ? '*' : '+';
            questions[i] = String.format("%d%c%d%n", a, sign, b);
            correctAnswersInt[i] = calculate(a, b, sign);
            correctAnswers[i] = Integer.toString(correctAnswersInt[i]);
        }
    }
    private static int calculate(int a, int b, char sign) {
        return (sign == '+') ? a + b : a * b;
    }
    public static void startGame() {
        generateQuestionsAndAnswers();
        Engine.runGame(requirement, questions, correctAnswers);
    }
}
