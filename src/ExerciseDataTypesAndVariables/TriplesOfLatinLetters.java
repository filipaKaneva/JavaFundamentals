package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numLetters = Byte.parseByte(scanner.nextLine());

        for (int i = 0; i < numLetters; i++) {
            char firstChar = (char) ('a' + i);
            for (int j = 0; j < numLetters; j++) {
                char secondChar = (char) ('a' + j);
                for (int k = 0; k < numLetters; k++) {
                    char thirdChar = (char) ('a' + k);

                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
                
            }
            
        }
    }
}
