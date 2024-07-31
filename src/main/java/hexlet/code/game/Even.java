package hexlet.code.game;

import hexlet.code.Engine;

public class Even {
    static final String RULES_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static final int QUANTITY_ATTEMPTS = 3;
    private static String[][] data = new String[3][2];

    public  static void game() {
        Engine.start(RULES_GAME);
        for (int i = 0; i < QUANTITY_ATTEMPTS; i++) {
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
