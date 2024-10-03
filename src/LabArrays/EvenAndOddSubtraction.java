package LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;

        for (int number : arr) {
            if (number % 2 == 0){
                evenSum += number;

            }else {
                oddSum += number;
            }
        }

        int diff = evenSum - oddSum;

        System.out.println(diff);
    }
}
