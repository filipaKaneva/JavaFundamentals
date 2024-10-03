package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

          String input = scanner.nextLine();
            String[] stringArr = input.split("");
            int sum = 0;

            for (int j = 0; j < stringArr.length - 1; j++) {

               String letter = stringArr[j];


                switch (letter.charAt(0)) {
                    case 65, 97, 69, 101, 73, 105, 79, 111, 85, 117 -> {

                        int currentNumber = letter.charAt(0) * stringArr.length;
                        sum += currentNumber;

                        break;
                    }default -> {
                        int currentNumber = letter.charAt(0) / stringArr.length;
                        sum += currentNumber;
                    }

                }



            }
            System.out.println(sum);
            }
        }
    }

