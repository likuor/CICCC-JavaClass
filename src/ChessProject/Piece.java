package ChessProject;

public abstract class Piece {
    private int value;
    protected boolean isWhite;
    protected Position position;


    public Piece(int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    public final int getValue() {
        return value;
    }

    public final void setValue(int value) {
        this.value = value;
    }

    public abstract void move();

    public abstract String getIcon();

//    public boolean isValidMove(Position newPosition){
//        return newPosition.getCol() > 0 && newPosition.getCol() < 8 &&
//                newPosition.getRow() > 0 && newPosition.getRow() < 8;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return value == piece.value &&
                isWhite == piece.isWhite;
    }

}
