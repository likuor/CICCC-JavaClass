package week2.arrays;

import java.lang.Math;
import java.lang.reflect.Array;
import java.util.Arrays;


public class BasicArrays2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min = 1;
        int max = 100;

        for (int i = 0; i < array.length ; i++){
            int number = (int)((Math.random()*(max-min)) + min);
            array[i] = number;
            System.out.println("Slot 0 contains a " + array[i]);
        }
    }
}
