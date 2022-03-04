package MiniProject2;

import java.util.Scanner;

public class InputCollector {
    //fields
//    private boolean gameQuitFlag;

    //constructor
//    public InputCollector(){
//        this.gameQuitFlag = false;
//    }

    public static String getUserInput(String prompt){

        // display Menu
        System.out.println("===== Contact  App =====");
        System.out.println("| 1, List all Contacts |");
        System.out.println("| 2, Add new Contacts  |");
        System.out.println("| 3, Remove Contacts   |");
        System.out.println("| 4, Update Contacts   |");
        System.out.println("| 5, Quit              |");
        System.out.println("========================");

        //get user input
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();

        //user input validation
        if (!userInput.matches("[1-5]+")) {
            System.out.println("Invalid number");
        }

        //call exit method
        if (exit(userInput)){
            System.out.println("Thank you for playing with me, Adios!");
        }
        return userInput;
    }

    public static boolean exit(String userInput) {
        boolean gameQuitFlag = false;

        if(userInput.equals("5")) {
            gameQuitFlag = true;
        }
        return gameQuitFlag;
    }
}
