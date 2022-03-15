package ChessProject;


public class Queen extends Piece {

    Queen(int value, boolean isWhite) {
        super(9, isWhite);
    }
    @Override
    public void move() {
        System.out.println("Like bishop and rook");
    }

    public String getIcon() {
        if (this.isWhite) {
            return "♛";
        }else{
            return "♕";
        }
    }

    @Override
    public String toString() {
        return "Queen{value='" + getValue() + "'}";
    }

}
