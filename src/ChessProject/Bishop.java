package ChessProject;

class Bishop extends Piece {

    Bishop(int value, boolean isWhite){
        super(3, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }

    public String getIcon() {
        if (this.isWhite) {
            return "♜";
        }else{
            return "♖";
        }
    }

    @Override
    public String toString() {
        return "Bishop{value='" + getValue() + "'}";
    }

}
