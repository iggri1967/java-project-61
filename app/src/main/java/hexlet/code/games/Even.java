package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;



public class Even {
    public static String requirement = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[] questions = new String[Engine.COUNT_ROUNDS];
    public static int[] questionsInt = new int[Engine.COUNT_ROUNDS];
    public static String[] correctAnswers = new String[Engine.COUNT_ROUNDS];
    public static void generateQuestionsAndAnswers() {
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            questionsInt[i] = random.nextInt(1000);
            questions[i] = Integer.toString(questionsInt[i]);
            correctAnswers[i] = isEven(questionsInt[i]) ? "yes" : "no";
        }
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void startGame() {
        generateQuestionsAndAnswers();
        Engine.runGame(requirement, questions, correctAnswers);
    }
}
