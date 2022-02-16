package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Count to: ");
        int num = input.nextInt();
        for  (int i = 1; i <= num ; i++){
            System.out.println(i);
        }
    }
}
