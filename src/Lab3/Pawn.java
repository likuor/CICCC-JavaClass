package Lab3;

public class Pawn extends Piece{
    private boolean promoted;
    Piece newPiece;

    public void promote(Piece newPiece){

    }

    public Pawn(int value, boolean isWhite){
        super(value,isWhite);
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public void setNewPiece(Piece newPiece) {
        this.newPiece = newPiece;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString(){
        return "Pawn{value='" + this.getValue() + '\'' + '}';
    }

}
