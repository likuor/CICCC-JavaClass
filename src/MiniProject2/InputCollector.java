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

//        if (inputValidation(userInput)){
//            System.out.println();
//            System.out.println("Invalid input. Try again");
//            System.out.println();
//
//        }
    }

//    public static int getUserInputNum (int prompt){
//        int userInputNum = 0;
//        Scanner sc= new Scanner(System.in);
//
//        try {
//            userInputNum = sc.nextInt();
//        } catch (IllegalArgumentException e) {
//            System.out.println("You must enter one letter!");
//        }
//        return userInputNum;
//    }


//    private static boolean inputValidation(String userInput) {
//        return !userInput.matches("[1-5]+");
//    }
}
