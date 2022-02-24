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
            String replacedPickedCity = pickedCity.replace(" ", "");
            String[] cityLetters = replacedPickedCity.split("");
            System.out.println(replacedPickedCity);

            //making underscores of the chosen city
            String underScores = "";
            String[] underScoresArray = new String[cityLetters.length];
            int cal = 0;
            for (String s : cityLetters){
                underScores +=  "_";
                underScoresArray[cal] = "_";
                cal++;
            }


            //the main logic
            Scanner scanner = new Scanner(System.in);
            System.out.println("Here's a question");
            System.out.println("The city name has " + replacedPickedCity.length() + " letters");
            System.out.println(underScores);
            int guessCount = 0;
            int loopCount = 0;
            int gotLetters = 0;
            int restLetters = 0;
            String wrongLetters = "";
            restLetters = underScoresArray.length;

            while(loopCount < HP){
                boolean unMatch = true;
                System.out.print("Guess a letter : ");
                String letter = scanner.next();
                for (int k = 0; k < replacedPickedCity.length(); k++){
                    if (cityLetters[k].equals(letter)) {
                        underScoresArray[k] = letter;
                        gotLetters = letter.length();
                        restLetters = restLetters - gotLetters;
                        unMatch = false;
                    }
                }

                //Replacing letters
                String beforeReplace = Arrays.toString(underScoresArray);
                String after1Replace = beforeReplace.replace(",", "");
                String after2Replace = after1Replace.replace("]", "");
                String resultReplace = after2Replace.replace("[", "");
                System.out.println(resultReplace);


                //game count control
                if (unMatch){
                    guessCount++;
                    wrongLetters += letter + ",";
                } else {
                    loopCount = loopCount - 1;
                }

                //judge win or lose
                System.out.println("You've guessed " + guessCount + " times. Here's the wrong letters: " + wrongLetters);
                if(guessCount == HP){
                    System.out.println("You lose. The answer is: " + replacedPickedCity);
                }
                if (restLetters == 0){
                    System.out.println("You win");
                    break;
                }

                loopCount++;
                System.out.println();
            }








        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
