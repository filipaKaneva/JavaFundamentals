package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        while (number % 2 == 1){

            System.out.println("Please write an even number.");
            number = Math.abs(Integer.parseInt(scanner.nextLine()));
        }

        System.out.printf("The number is: %d", Math.abs(number));
    }
}
