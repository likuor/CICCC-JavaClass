package week1.keyboardinput;
import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = input.nextLine();
        System.out.println("Username is: " + name);
        String resultName = String.format("Hi, %s!  How old are you" , name);

        System.out.println(resultName);
        String old = input.nextLine();
        String resultOld = String.format("So you're %s, eh?  That's not old at all!\nHow much do you make, %s ?" , old , name);
        System.out.println(resultOld);

        String money = input.nextLine();
        String resultMoney = String.format("%s!  I hope that's per hour and not per year! LOL!" , money);
        System.out.println(resultMoney);
    }
}
