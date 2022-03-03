package week2.arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int min = 1;
        int max = 100;

        for (int i = 0; i < 10 ; i++){
            int number = (int)((Math.random()*(max-min)) + min);
            list.add(number);
        }
        System.out.println(list);

        int largestNum = 0;
        for (int i = 0; i < 10 ; i ++){
            if (largestNum <= list.get(i)){
                largestNum = list.get(i);
            }
        }
        System.out.println("The largest value is " + largestNum);

    }
}
