package LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int [] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isIdenticial = true;

        for (int i = 0; i < firstArr.length; i++) {
            sum += firstArr[i];

            if (firstArr[i] != secondArr[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isIdenticial = false;
                break;
            }

        }
    if (isIdenticial){
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }



    }
}
