

package week1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandlingExceptions {
    public static void main(String[] args) {
        try {
            openFile("Hello.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }
    }

    public static void openFile(String filename) throws FileNotFoundException {
//        try {
        File file = new File(filename);
        Scanner in = new Scanner(file);
        in.close();
//        } catch (FileNotFoundException e) {
//            throw e;
//        }
    }
}