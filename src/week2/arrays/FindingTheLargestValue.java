package week2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min = 1;
        int max = 100;

        for (int i = 0; i < array.length ; i++){
            int number = (int)((Math.random()*(max-min)) + min);
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));

        int largestNum = 0;
        for (int i = 0; i < array.length ; i ++){
            if (largestNum <= array[i]){
                largestNum = array[i];
            }
        }
        System.out.println("The largest value is "+ largestNum);
    }
}
