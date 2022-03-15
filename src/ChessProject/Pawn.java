package ChessProject;

public class Pawn extends Piece {
    private boolean promoted;  // false
    private Piece newPiece;    // null

    Pawn (int value, boolean isWhite){
        super(1, isWhite);
    }


    Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece){
        super(1, isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    public String getIcon(){
        if(this.isWhite) {
            return "♟";
        }else{
            return "♙";
        }
    }

    @Override
    public String toString() {
        return "Pawn{value='" + getValue() + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pawn pawn = (Pawn) o;
        return isWhite == pawn.isWhite && promoted == pawn.promoted
                && (!promoted || newPiece.getValue() == pawn.newPiece.getValue());
    }

}
