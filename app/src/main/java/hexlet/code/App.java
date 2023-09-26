package hexlet.code;

import hexlet.code.games.TaskTwo;

public class App {
    public static void main(String[] args) {
        Engine.listOfGames();
        switch (Engine.userChoice) {
            case 1:
                Engine.greeting();
                break;
            case 2:
                Engine.greeting();
                TaskTwo.secondTask();
                break;
            case 3:
                Engine.greeting();

            default:
                break;
        }
    }
}

