package hexlet.code.game;

import hexlet.code.Engine;

public class Progression {
    static final String RULES_GAME = "What number is missing in the progression?";
    static final int QUANTITY_ATTEMPTS = 3;
    private static String[][] data = new String[3][2];

    public static void game() {
        Engine.start(RULES_GAME);
        for (int i = 0; i < QUANTITY_ATTEMPTS; i++) {
            String[] numbers;
            numbers = randomProgression();
            int position = (int) (Math.random() * numbers.length);
            String requiredNumber = numbers[position];
            numbers[position] = "..";

            data[i][0] = question(numbers);
            data[i][1] = requiredNumber;
        }
        Engine.resultGame(data);
    }

    public static String question(String[] numbers) {
        return "Question: " + String.join(" ", numbers);
    }

    public static String[] randomProgression() {
        String[] numbers = new String[(int) (Math.random() * 5 + 5)];
        int randomFirsNumber = (int) (Math.random() * 20);
        int randomStep = (int) (Math.random() * 20);
        numbers[0] = Integer.toString(randomFirsNumber);
        for (int j = 1; j < numbers.length; j++) {
            numbers[j] = Integer.toString(Integer.parseInt(numbers[j - 1]) + randomStep);
        }
        return numbers;
    }
}


