package week1.keyboardinput;
import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = input.nextLine();
        String resultName = String.format("Hi, %s!  How old are you?", name);
        System.out.println(resultName);
        int resultOld = input.nextInt();
        int futureAge = resultOld + 5;
        int pastAge = resultOld - 5;
        String resultAge = String.format("Did you know that in five years you will be %s years old?\n And five years ago you were %s! Imagine that!\n", futureAge, pastAge);
        System.out.println(resultAge);
    }
}
