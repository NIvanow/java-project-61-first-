package hexlet.code.game;

import hexlet.code.Engine;

public class Prime {
    static final String RULES_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    static final int QUANTITY_ATTEMPTS = 3;
    private static String[][] data = new String[3][2];

    public static void game() {
        Engine.start(RULES_GAME);
        for (int i = 0; i < QUANTITY_ATTEMPTS; i++) {
            int randomNum = (int) (Math.random() * 100);
            data[i][0] = question(7);
            data[i][1] = isPrime(7);
        }
        Engine.resultGame(data);
    }

    public static String question(int number) {
        return "Question: " + number;
    }

    public static String isPrime(int number) {
        int countDevider = 1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                countDevider++;
            }
        }
        return countDevider == 2 ? "yes" : "no";

    }
}
