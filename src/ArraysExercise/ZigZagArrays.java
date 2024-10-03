package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countRows = Integer.parseInt(scanner.nextLine());

        int[]firstArray = new int [countRows];
        int[] secondArray = new int [countRows];

        for (int i = 1; i <= countRows; i++) {

            String input = scanner.nextLine();
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            if (i % 2 == 0){

                secondArray[i - 1] = firstNumber;
                firstArray [i - 1] = secondNumber;

            }else {

                firstArray [i - 1] = firstNumber;
                secondArray [i - 1] = secondNumber;

            }
            }

        for (int number : firstArray){
            System.out.print(number + " ");
        }
        System.out.println();

        for (int num : secondArray){
            System.out.print(num + " ");
        }
        }

        }

