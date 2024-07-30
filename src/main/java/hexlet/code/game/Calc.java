package hexlet.code.game;

import java.util.Scanner;
import hexlet.code.App;
import hexlet.code.Engine;

public class Calc {
    final static String rulesGame = "What is the result of the expression?";
    final  static int quantityAttempts = 3;
    final static char[] operations = {'+', '*', '-'};

    private static int randomNum1, randomNum2;
    private static char randomOperation;
    static String[][] data = new String[3][2];

    public static void game() {
        Engine.start(rulesGame);
        for (int i = 0; i < quantityAttempts; i++) {
            int randomNum1 = (int) (Math.random() * 20);
            int randomNum2 = (int) (Math.random() * 20);
            int randomOperation = (int) (Math.random() * 3);
            char operation = operations[randomOperation];

            data[i][0] = question(randomNum1, randomNum2, operation);
            data[i][1] = calculate(randomNum1, randomNum2, operation);
        }
        Engine.resultGame(data);
    }

    public static String question(int num1, int num2, char operation) {
        return "Question: " + num1 + " " + operation + " " + num2;
    }

    public static String calculate(int num1, int num2, char operation) {
        switch (operation) {
            case '+' :
                return Integer.toString(num1 + num2);
            case '*' :
                return Integer.toString(num1 * num2);
            case '-' :
                return Integer.toString(num1 - num2);
            default:  return "Error data";
        }
    }
}

