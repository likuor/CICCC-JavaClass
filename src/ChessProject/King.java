package ChessProject;

public class King extends Piece {
    private static final int VALUE = 1000;

    King(int value, boolean isWhite) {
        super(1000, isWhite);
    }

    @Override
    public void move() {
        System.out.println("One square");
    }

    @Override
    public String getIcon() {
        if (this.isWhite) {
            return "♚";
        }else{
            return "♔";
        }
    }

    @Override
    public String toString() {
        return "King{value='" + getValue() + "'}";
    }

}
