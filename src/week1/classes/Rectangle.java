package week1.classes;

public class Rectangle {
    int width = 1;
    int height = 1;
    String color = "Blue";

    Rectangle(int height, int width, String color){
        this.height = height;
        this.width  = width;
        this.color  = color;
    }

    String draw(){
        String result = color.substring(0,1);
        String firstLetter = result.toUpperCase();
        String temp = firstLetter;
        for (int k = 1; k < width; k++) {
            temp = temp + firstLetter;
        }
        for  (int i = 1; i < height ; i++) {
            System.out.println(temp);
        }

        return temp;
    }


}
