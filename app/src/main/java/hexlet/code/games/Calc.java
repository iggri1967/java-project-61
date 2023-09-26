package hexlet.code.games;

import java.util.Random;
import java.util.Formatter;

public class Calc {
    public static String requirement;
    public static String question;
    public static int volume;
    public static int correctAnswer;
    public static boolean correctBoolean;
    Calc (String requirement, String question, int volume, int correctAnswer, boolean correctBoolean) {
        this.requirement = "What is the result of the expression?";
        this.question = question;
        this.volume = volume;
        this.correctAnswer = correctAnswer;
        this.correctBoolean = correctBoolean;

        int a = new Random().nextInt(20);
        int b = new Random().nextInt(20);
        char sign = new Random().nextInt(20) % 2 == 0 ? '*' : '+';
        //Formatter formatter = new Formatter();
        question = String.format("%d%c%d%n", a, sign, b);
        correctAnswer = sign == '+' ? a + b : a * b;
    }

}
