package hexlet.code;

import java.util.Scanner;

public class Engine {
    final  static int quantityAttempts = 3;

    public static String userName;

    public static void start(String str) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner name = new Scanner(System.in);
        userName = name.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(str);
    }

    public static void resultGame(String[][] dataGame) {
        int count = 0;
        for (var i = 0; i < quantityAttempts; i++) {
            System.out.println(dataGame[i][0]);
            Scanner choiceEven = new Scanner(System.in);
            String choiceEvenStr = choiceEven.next();
            if (dataGame[i][1].equals(choiceEvenStr)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + choiceEvenStr + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + dataGame[i][1] + "'\n" + "Let's try again, " + userName);
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + Engine.userName + "!");
        }
    }

    public static void questionForUser(String[][]dataGame) {

    }
}
