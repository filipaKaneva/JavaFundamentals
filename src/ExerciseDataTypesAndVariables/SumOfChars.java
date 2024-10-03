package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfChars = Byte.parseByte(scanner.nextLine());
        int sumChar = 0;

        for (int i = 0; i < numberOfChars; i++) {

            char currentLetter = scanner.next().charAt(0);
            sumChar += currentLetter;
        }
        System.out.printf("The sum equals: %d", sumChar);
    }
}
