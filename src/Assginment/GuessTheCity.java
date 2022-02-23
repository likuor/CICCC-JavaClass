package Assginment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class GuessTheCity {
    public static void main(String[] args) {
        int CITY_COUNTER = 100;
        int MAXIMUM_ARRAY = 99;
        int HP = 10;

        String cityList [] = new String [CITY_COUNTER];
        try {
            File file = new File("cities.txt");
            Scanner in = new Scanner(file);

            //making city array
            int count = 0;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                cityList[count] = line;
                count++;
            }

            //picking a city
            Random rand = new Random();
            int pickedNum = rand.nextInt(MAXIMUM_ARRAY);
            String pickedCity = cityList[pickedNum];
            System.out.println(pickedCity);
            String[] cityLetters = pickedCity.split("");

            String underScores = "";
            String[] underScoresArray = new String[cityLetters.length];
            int cal = 0;
            for (String s : cityLetters){
                underScores +=  "_";
                underScoresArray[cal] = "_";
                cal++;
            }
//            System.out.println(Arrays.toString(underScoresArray));
//            System.out.println(Arrays.toString(cityLetters));


            Scanner scanner = new Scanner(System.in);
            System.out.println("Here's a question");
            System.out.println("Letters of the chosen city are " + pickedCity.length() + " words");
            System.out.println(underScores);

            for (int i = 0; i < HP; i++){
                String letter = scanner.next();
                for (int k = 0; k < pickedCity.length(); k++){
                    if (cityLetters[k].equals(letter)) {
                        underScoresArray[k] = letter;
                    }
                }
//                System.out.println(Arrays.toString(underScoresArray));
                String beforeReplace = Arrays.toString(underScoresArray);
                String after1Replace = beforeReplace.replace(",", "");
                String after2Replace = after1Replace.replace("]", "");
                String resultReplace = after2Replace.replace("[", "");
                System.out.println(resultReplace);
            }








        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
