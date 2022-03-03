package week2.arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class LocatingTheLargestValue {
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
        int count = 0;

        for (int i = 0; i < 10 ; i ++){
            if (largestNum <= list.get(i)){
                largestNum = list.get(i);
                count = i;
            }
        }
        System.out.print("The largest value is " + largestNum);
        System.out.println(", which is in slot "+ count);
    }
}
