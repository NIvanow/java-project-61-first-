package hexlet.code;


import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.Greet;

import java.util.Scanner;

public class App {
    public static int choice;
    public static void main(String[] args) {
            System.out.println("Please enter the game number and press Enter. \n1 - Greet\n2 - Even"
                    + "\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
            System.out.print("You choice: ");
            Scanner choiceStr = new Scanner(System.in);
             choice = choiceStr.nextInt();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    Greet.greeting();
                    break;
                case 2:
                    Even.game();
                    break;
                case 3:
                    Calc.game();
                    break;
                default:
                    System.out.println("You entered an incorrect number");
            }
    }

    public static class Engine {
    }
}


