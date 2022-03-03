package week2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min = 1;
        int max = 50;
        String result = "";


        for (int i = 0; i < array.length ; i++){
            int number = (int)((Math.random()*(max-min)) + min);
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));

        Scanner myObj = new Scanner(System.in);
        System.out.print("Value to find: ");
        String userInput = myObj.nextLine();
        int userInputNum = Integer.parseInt(userInput);


        int count = 0;
        for (int i = 0; i < array.length ; i++){
            if(array[i] == userInputNum) {
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
