package MiniProject2;

import java.util.Scanner;

public class InputCollector {
    public static String getUserInput(String prompt){
        String userInput = "";
        System.out.println(prompt);
        Scanner in = new Scanner(System.in);

        try {
            userInput = in.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("You must enter one letter!");
        }
        return userInput;
    }
}
