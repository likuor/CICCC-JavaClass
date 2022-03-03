package week2.arraylists;

import java.util.ArrayList;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int min = 1;
        int max = 100;

        for (int i = 0; i < 10 ; i++){
            int number = (int)((Math.random()*(max-min)) + min);
            list.add(number);
        }
        System.out.println("ArrayList: " + list);
    }
}
