package Lab3;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> Piece = new ArrayList<String>();
        Piece king = new King(1000, false);
        Piece queen = new Queen(9, false);
        Piece rook = new Rook(5, false);
        Piece bishop = new Bishop(3, false);
        Piece knight = new Knight(2, false);
        Piece pawn = new Pawn(1, false);

        System.out.println(king);
        System.out.println(queen);
        System.out.println(rook);
        System.out.println(bishop);
        System.out.println(knight);
        System.out.println(pawn);

        king.move();
        queen.move();
        rook.move();
        bishop.move();
        knight.move();
        pawn.move();
    }

}
