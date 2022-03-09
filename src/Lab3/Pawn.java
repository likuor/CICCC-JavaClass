package Lab3;

public class Pawn extends Piece {
    private boolean promoted;  // false
    private Piece newPiece;    // null

    public Pawn(boolean isWhite) {
        super(1, isWhite);
        promoted = false;
        newPiece = null;
    }

    public void promote(Piece newPiece) {
        this.promoted = true;
        this.newPiece = newPiece;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
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
