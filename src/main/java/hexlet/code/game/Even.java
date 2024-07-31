package hexlet.code.game;

import java.util.Scanner;
import hexlet.code.App;
import hexlet.code.Engine;

public class Even {
    final static String rulesGame ="Answer 'yes' if the number is even, otherwise answer 'no'.";
    final  static int quantityAttempts = 3;
    private static String[][] data = new String[3][2];

    public  static void game() {
        Engine.start(rulesGame);
        for (int i = 0; i < quantityAttempts; i++) {
            int randomNum = (int) (Math.random() * 20);
            data[i][0] = question(randomNum);
            data[i][1] = isEven(randomNum);
        }
        Engine.resultGame(data);

    }

    private static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static String question(int number) {
       return "Question: " + number;
    }
}
