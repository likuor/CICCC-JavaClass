package MiniProject2;

import java.util.ArrayList;

public class ContactList {
    //ここにCRUD

    //fields
    private String userName;
    private String userNumber;


    public ContactList(){}

    public ContactList(ArrayList<String> userInfo){
        this.userName = userInfo.get(0);
        this.userNumber = userInfo.get(1);
    }

    public ContactList(String userName, String userNumber){
        this.userName = userName;
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

}
