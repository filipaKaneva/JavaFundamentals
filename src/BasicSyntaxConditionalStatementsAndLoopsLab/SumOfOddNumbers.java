package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOddNumbers = Integer.parseInt(scanner.nextLine());

        int currentNumber = 1;
        int sum = 0;

        for (int i = 1; i <= numberOddNumbers; i++) {
            System.out.println(currentNumber);
            sum += currentNumber;
            currentNumber += 2;

        }

        System.out.println("Sum: " + sum);
    }
}
