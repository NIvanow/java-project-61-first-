package hexlet.code;

import java.util.Scanner;

public class Greet {

    private static String userName;

    public String getName() {
        return userName;
    }
    public void setName(String user) {
        userName = user;
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner name = new Scanner(System.in);
        userName = name.next();
        System.out.println("Hello, " + userName + "!");
    }
}
