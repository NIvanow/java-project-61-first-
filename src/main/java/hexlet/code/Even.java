package hexlet.code;

import java.util.Scanner;

public class Even {

    public  static void game() {
        var user = new Greet();
        Greet.greeting();
        String userName = user.getName();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int randomNum = (int) (Math.random() * 100);
            String parity;
            System.out.println("Question: " + randomNum);
            System.out.println("Your answer: ");
            Scanner choiceEven = new Scanner(System.in);
            String choiceEvenStr = choiceEven.next();

            parity = randomNum % 2 == 0 ? "yes" : "no";
            if (parity.equals(choiceEvenStr)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + choiceEvenStr + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + parity + "'\n" + "Let's try again, " + userName);
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
