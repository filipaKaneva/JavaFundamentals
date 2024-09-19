package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfOrders = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 0; i < numberOfOrders; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());

            double totalPricePerDAay = (days * countCapsules) * pricePerCapsule;
            total += totalPricePerDAay;

            System.out.printf("The price for the coffee is: $%.2f%n", totalPricePerDAay);
        }

        System.out.printf("Total: $%.2f", total);


    }
}
