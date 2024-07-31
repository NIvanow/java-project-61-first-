package hexlet.code.game;

import hexlet.code.Engine;
public class GCD {
    final static String rulesGame = "Find the greatest common divisor of given numbers.";
    final static int quantityAttempts = 3;
    private static String[][] data = new String[3][2];

    public static void game() {
        Engine.start(rulesGame);
        for (int i = 0; i < quantityAttempts; i++) {
            int randomNum1 = (int) (Math.random() * 20);
            int randomNum2 = (int) (Math.random() * 20);
            data[i][0] = question(randomNum1, randomNum2);
            data[i][1] = logicGCD(randomNum1, randomNum2);
        }
        Engine.resultGame(data);
    }

    public static String question(int num1, int num2) {
        return "Question: " + num1 + " " + num2;
    }

    public static String logicGCD(int num1, int num2) {
        String result = "1";
       int maxNum = Math.max(num1, num2);
       int maxResult= 1;

        for (int i = maxNum; i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {

                if(maxResult < i) {
                    result = Integer.toString(i);
                    maxResult = i;
                }
            }
        }
        return result;
    }
}
