package MiniProject2;

import java.util.ArrayList;
import java.util.Scanner;

public class InputCollector {
    public static String getUserInput(String prompt){
        String userInput = "";

        System.out.println(prompt);

        //get user input
        Scanner in = new Scanner(System.in);
        userInput = in.nextLine();

//        if (inputValidation(userInput)){
//            System.out.println();
//            System.out.println("Invalid input. Try again");
//            System.out.println();
//
//        }
        return userInput;
    }

//    private static boolean inputValidation(String userInput) {
//        return !userInput.matches("[1-5]+");
//    }
}
