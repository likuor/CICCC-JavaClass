package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");
        while (true){
            int num = input.nextInt();
            if (num == 0){
                break;
            } else{
                System.out.println("Number:" + num );
            }
            total = total + num;
            System.out.println("The total so far is" + total);
        }
    }
}
