package Lab3;

public class King extends Piece{
    public King(int value, boolean isWhite){
        super(value,isWhite);
    }

    @Override
    public void move() {
        System.out.println("One Square");
    }

    @Override
    public String toString(){
        return "King{value='" + this.getValue() + '\'' + '}';
    }

}
