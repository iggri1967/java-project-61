package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        Engine.listOfGames();
        switch (Engine.userChoice) {
            case 1:
                Engine.greeting();
                break;
            case 2:
                Engine.greeting();
                Even.firstTest();
                break;
            case 3:
                Engine.greeting();
                Calc.secondTest();
            default:
                break;
        }
    }
}

