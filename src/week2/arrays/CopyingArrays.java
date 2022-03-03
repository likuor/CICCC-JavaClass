package week2.arrays;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min = 1;
        int max = 100;
        int[] anotherArray = new int[10];

        for (int i = 0; i < array.length ; i++){
            int number = (int)((Math.random()*(max-min)) + min);
            array[i] = number;
        }

        for (int i = 0; i < anotherArray.length ; i++){
            anotherArray[i] = array[i];
            if (i == 9){
                int tmp = 0;
                tmp = array[i];
                array[i] = -7;
                anotherArray[i] = tmp;
            }
        }
        System.out.println("Slot 0 contains a " + Arrays.toString(array));
        System.out.println("Slot 0 contains a " + Arrays.toString(anotherArray));



    }
}
