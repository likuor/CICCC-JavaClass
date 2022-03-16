package collection;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int nextYear = year+1;
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println(nextYear);


//        for (int i = 0; i < 10000; i++ ) {
//            int res = year + i;
//            System.out.println();
//        }

        System.out.println(hashSet);


    }
}
