package hexlet.code;

import hexlet.code.games.*;

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
                break;
            case 4:
                Engine.greeting();
                GCD.thirdTest();
                break;
            case 5:
                Engine.greeting();
                Progression.forthTest();
                break;
            case 6:
                Engine.greeting();
                Prime.fifthTest();
                break;
            default:
                break;
        }
    }
}

