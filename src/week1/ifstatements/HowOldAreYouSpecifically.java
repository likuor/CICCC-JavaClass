package week1.ifstatements;
import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        String name = input.nextLine();
        String resultName = String.format("Ok, %s, how old are you?", name);
        System.out.println(resultName);
        int age = input.nextInt();

        if(age < 16){
            System.out.println(	"You can't drive.");
        } else if ( age == 16 || age == 17 ){
            System.out.println(	"You can drive but not vote.");
        } else if ( 18 < age || age < 24 ){
            System.out.println(	"You can vote but not rent a car.");
        } else if ( 25 <= age ){
            System.out.println(	"You can do pretty much anything.");
        }
    }
}
