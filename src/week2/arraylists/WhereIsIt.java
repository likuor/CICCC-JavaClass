package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int min = 1;
        int max = 50;

        for (int i = 0; i < 10 ; i++){
            int number = (int)((Math.random()*(max-min)) + min);
            list.add(number);
        }
        System.out.println("ArrayList: " + list);

        Scanner myObj = new Scanner(System.in);
        System.out.print("Value to find: ");
        String userInput = myObj.nextLine();
        int userInputNum = Integer.parseInt(userInput);

        int count = 0;
        for (int i = 0; i < 10 ; i++){
            if (userInputNum == list.get(i)){
                count = i;
            }
        }
        if (1 <= count){
            System.out.println(userInput + " is in slot "+ count);
        } else {
            System.out.println(userInput + " is not in slot ");
        }
    }
}
