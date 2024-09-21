package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumDigits = 0;

        for (int i = 1; i <= number; i++) {

            int digits = number;

            while (digits > 0){

                sumDigits += digits % 10;
                digits = digits / 10;
            }
            System.out.println( sumDigits);
            break;
        }


    }
}
