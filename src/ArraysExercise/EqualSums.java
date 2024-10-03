package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        for (int position = 0; position <= numbers.length - 1; position++) {

            int leftSideSum = 0;
            int rightSideSum = 0;


            for (int leftPosition = 0; leftPosition < position; leftPosition++) {

                leftSideSum += numbers[leftPosition];
            }
            for (int rightPosition = position + 1; rightPosition <= numbers.length - 1; rightPosition++) {

                rightSideSum += numbers[rightPosition];
            }

            if (leftSideSum == rightSideSum){
                System.out.println(position);
                return;
            }
        }

            System.out.println("no");

    }
}
