package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
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

        for (int num : list){
            if (userInputNum == num){
                System.out.println(num + " is in the ArrayList.");
            }
        }
    }
}
