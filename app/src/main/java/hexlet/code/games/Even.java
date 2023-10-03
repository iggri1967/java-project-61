package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;



public class Even {
    public static String requirement = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static int[] questions = new int[3];
    public static String[] correctAnswers = new String[3];
    public static void generateQuestionsAndAnswers() {
        for (int i = 0; i < 3; i++) {
            questions[i] = new Random().nextInt(1000);
            correctAnswers[i] = questions[i] % 2 == 0 ? "yes" : "no";
        }
    }
    public static void firstTest() {
        generateQuestionsAndAnswers();
        Engine.flow(requirement, questions, correctAnswers);
    }
}
