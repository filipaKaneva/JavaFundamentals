package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingNumber = Integer.parseInt(scanner.nextLine());
        int endingNumber = Integer.parseInt(scanner.nextLine());

        for (int code = startingNumber; code <= endingNumber; code++) {

            System.out.print((char) code + " ");

        }
    }
}
