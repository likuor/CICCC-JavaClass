package MiniProject2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Contact {

    //fields
    private String userName;
    private String userNumber;

    //constructor
    public Contact(){}

    public Contact(ArrayList<String> userInfo){
        this.userName = userInfo.get(0);
        this.userNumber = userInfo.get(1);
    }

    public Contact(String userName, String userNumber){
        setUserName(userName);
        setUserNumber(userNumber);
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
