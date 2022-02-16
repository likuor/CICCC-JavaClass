package week1.classes;

public class Driver {
    public static void main(String[] args) {

        Rectangle r1= new Rectangle(7,5,"Blue");
        Rectangle r2= new Rectangle(2,10,"Green");
        Rectangle r3= new Rectangle(12,15,"Red");

        System.out.println(r1.draw());
        System.out.println(r2.draw());
        System.out.println(r3.draw());
    }
}
