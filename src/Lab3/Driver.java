package Lab3;

import java.util.ArrayList;

public class Driver {
    public static void main(String args[]){
        Queen queen = new Queen(true);
        Knight knight = new Knight(true);

        Pawn p1 = new Pawn(true);
        p1.promote(queen);
        Pawn p2 = new Pawn(true);
        Pawn p3 = new Pawn(false);
        Pawn p4 = new Pawn(false);
        p4.promote(queen);
        Pawn p5 = new Pawn(true);
        p5.promote(knight);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }

}
