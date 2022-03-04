package Lab3;

public abstract class Piece {
    private int value;
    private boolean isWhite;

    public Piece(int value, boolean isWhite){
        this.value = value;
        this.isWhite = isWhite;
    }

    public abstract void move();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setWhite(boolean white) {
        isWhite = false;
    }

    @Override
    public String toString(){
        return "{value='" + value + '\'' + '}';
    }

}
