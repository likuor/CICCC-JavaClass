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

    public static Contact createNewUser (ContactList list){
        String name ;
        String number ;

        while (true){
            name = InputCollector.getUserInput("Enter your name: ");
            if (name.length() <= 1){
                continue;
            }

            while(true){
                number = InputCollector.getUserInput("Enter your number: ");
                if (number.length() <= 9){
                    continue;
                }
                break;
            }
            break;
        }

        Contact userContact = new Contact(name,number);
        list.addContact(userContact);

        System.out.println("Successfully added a new contact!");

        return userContact;
    }

    public static void showAllUsers (ContactList list){
        list.showContact();
        System.out.println();
    }

    public static void removeUser (ContactList list){
        list.removeContact();
    }

    public static void updateUser (ContactList list){
        list.updateContact();
    }

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        while(true){
            showDisplayMenu();
            String userInput = InputCollector.getUserInput("Enter your option: ");

            if (userInput.equals("1") ){
                showAllUsers(contactList);
            } else if (userInput.equals("2") ){
                createNewUser(contactList);
            } else if (userInput.equals("3") ) {
                removeUser(contactList);
            } else if (userInput.equals("4") ) {
                updateUser(contactList);
            } else if (quit(userInput)){
                break;
            }
        }
    }
}
