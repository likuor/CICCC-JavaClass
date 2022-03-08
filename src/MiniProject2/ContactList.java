package MiniProject2;

import java.util.ArrayList;

public class ContactList {

    //fields
    private ArrayList<Contact> contactArrayList;

    public ContactList(){
        contactArrayList = new ArrayList<Contact>();
    }

    public void addContact(Contact newContact){
        getContactArrayList().add(newContact);
    }

    public void showContact(){
        for(int i = 0; i < getContactArrayList().size() ; i++) {
            String name = getContactArrayList().get(i).getUserName();
            String number = getContactArrayList().get(i).getUserNumber();
            String result = String.format("%d. <%s> (Mobile= %s, )", i ,name, number);
            System.out.println(result);
        }
    }

    public void removeContact(){
        String message = "";
        showContact();

        String strInput = InputCollector.getUserInput("Enter the index of the contact to remove: ");
        int removeIndex = Integer.parseInt(strInput);

        for(int i = 0; i < getContactArrayList().size() ; i++) {
            if (removeIndex == i){
                message = String.format("Successfully removed %s", getContactArrayList().get(i).getUserName());
                getContactArrayList().remove(removeIndex);
            } else {
                message = "Not found";
            }
        }
        System.out.println(message);
    }

    public void updateContact(){
        String message = "";
        String name = "";
        String number = "";

        showContact();

        String strInput = InputCollector.getUserInput("Enter the index of the contact to update: ");
        int updateIndex = Integer.parseInt(strInput);

        for(int i = 0; i < getContactArrayList().size() ; i++) {
            if (updateIndex == i){
                name = InputCollector.getUserInput("Enter your new name: ");
                number = InputCollector.getUserInput("Enter your new number: ");
                Contact userContact = new Contact(name,number);
                getContactArrayList().set(i,userContact);
                message = "Successfully updated";

            } else {
                message = "Not found";
            }
        }
        System.out.println(message);
    }

    public ArrayList<Contact> getContactArrayList() {
        return contactArrayList;
    }
}
