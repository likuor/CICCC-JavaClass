package week1.classes;

public class Rectangle {
    private int width = 1;
    private int height = 1;
    private String color = "Blue";

    public Rectangle(int height, int width, String color){
        this.height = height;
        this.width  = width;
        this.color  = color;
    }

    private int getHeight() {
        return height;
    }

    private int getWidth() {
        return width;
    }

    private String getColor() {
        return color;
    }

    public String draw(){
        String result = getColor().substring(0,1);
        String firstLetter = result.toUpperCase();
        String temp = firstLetter;
        for (int k = 1; k < getWidth(); k++) {
            temp = temp + firstLetter;
        }
        for  (int i = 1; i < getHeight() ; i++) {
            System.out.println(temp);
        }

        return temp;
    }


}
