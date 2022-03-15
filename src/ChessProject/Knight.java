package ChessProject;

public class Knight extends Piece {

    Knight(int value, boolean isWhite) {
        super(2, isWhite);
    }
    @Override
    public void move() {
        System.out.println("Like an L");
    }

    public String getIcon() {
        if (this.isWhite) {
            return "♝";
        }else{
            return "♗";
        }
    }

    @Override
    public String toString() {
        return "Knight{value='" + getValue() + "'}";
    }

}
