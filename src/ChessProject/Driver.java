package ChessProject;

public class Driver {
    @Override
    public String toString() {
        return "Driver{}";
    }

    public static void main(String args[]){
//        Queen queen = new Queen(true);
//        Knight knight = new Knight(true);
//
//        Pawn p1 = new Pawn(true);
//        p1.promote(queen);
//        Pawn p2 = new Pawn(true);
//        Pawn p3 = new Pawn(false);
//        Pawn p4 = new Pawn(false);
//        p4.promote(queen);
//        Pawn p5 = new Pawn(true);
//        p5.promote(knight);

//        Position position = new Position();
//        System.out.println(position);
//        position.position();

        Game game = new Game();

        // Print a board
        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if(game.getBoard()[i][j] == null){
                    System.out.print(" .");
                }else{
                    System.out.print(" "+game.getBoard()[i][j].getIcon());
                }
            }
            System.out.println(" " + i);
        }
        System.out.println();
        System.out.print(" a b c d e f g h");

    }

}
