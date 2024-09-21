package LabDataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int currentNumber = i;
            int sumNumber = 0;
            while (i > 0) {
                sumNumber += i % 10;
                i = i / 10;
            }
            if (sumNumber == 5 || sumNumber == 7 || sumNumber == 11) {
                System.out.printf("%d -> True%n", currentNumber);
            }else {
                System.out.printf("%d -> False%n", currentNumber);
            }

            sumNumber = 0;
            i = currentNumber;
        }

    }
}
