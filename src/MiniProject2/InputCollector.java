package MiniProject2;

import java.util.ArrayList;
import java.util.Scanner;

public class InputCollector {
    //fields
//    private String userInput;

    //constructor
//    public InputCollector(){
//        this.userInput = "";
//    }


    public static String getUserInput(String prompt){
        String userInput = "";

        System.out.println(prompt);

        //get user input
        Scanner in = new Scanner(System.in);
        userInput = in.nextLine();
        if (inputValidation(userInput)){
            System.out.println();
            System.out.println("Invalid input. Try again");
            System.out.println();

        }
        return userInput;
    }

    public static String createInfo(String prompt){
        String userInput = "";
        String name ;
        String number ;

        //get user input
        Scanner in = new Scanner(System.in);

        System.out.println("Type your name");
        name = in.nextLine();

        System.out.println("Type your number");
        number = in.nextLine();


        return userInput;
    }

    private static boolean inputValidation(String userInput) {
        return !userInput.matches("[1-5]+");
    }
}
