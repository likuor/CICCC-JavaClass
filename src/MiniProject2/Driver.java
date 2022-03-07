package MiniProject2;

import java.util.ArrayList;

public class Driver {

    public static void showDisplayMenu(){
        // display Menu
        System.out.println("===== Contact  App =====");
        System.out.println("| 1, List all Contacts |");
        System.out.println("| 2, Add new Contacts  |");
        System.out.println("| 3, Remove Contacts   |");
        System.out.println("| 4, Update Contacts   |");
        System.out.println("| 5, Quit              |");
        System.out.println("========================");
    }

    private static boolean quit(String userInput) {
        boolean gameQuitFlag = false;

        if(userInput.equals("5")) {
            gameQuitFlag = true;
            System.out.println();
            System.out.println("Thank you for playing with me, Adios!");
            System.out.println();
        }
        return gameQuitFlag;
    }

    public static Contact createNewUser (){
        String name ;
        String number ;

        name = InputCollector.getUserInput("Enter your name: ");
        number = InputCollector.getUserInput("Enter your number: ");
        Contact userContact = new Contact(name,number);

        System.out.println("Successfully added a new contact!");

        return userContact;
    }

    public static void main(String[] args) {
        while(true){
            showDisplayMenu();
            String userInput = InputCollector.getUserInput("Enter your option: ");
            if (userInput.equals("2") ){
                createNewUser();

//                ArrayList<String> userInfo = new ArrayList<String>();
//                userInfo.add(createNewUser().getUserName());
//                userInfo.add(createNewUser().getUserNumber());

//                ContactList contactList = new ContactList(createNewUser().getUserName(), createNewUser().getUserNumber());
//                System.out.println(contactList.getUserName());

            } else if (quit(userInput)){
                break;
            }
        }
    }


}
