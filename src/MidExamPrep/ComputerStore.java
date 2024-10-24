package MidExamPrep;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeCustomer = scanner.nextLine();
        double totalSum = 0;
        double totalSumWithoutTaxes = 0;

        while (!typeCustomer.equals("special") && !typeCustomer.equals("regular")){

            double pricesWithoutTax = Double.parseDouble(typeCustomer);

            if (pricesWithoutTax <= 0){
                System.out.println("Invalid price!");
            }else {
                totalSum += pricesWithoutTax + pricesWithoutTax * 0.2;
                totalSumWithoutTaxes += pricesWithoutTax;
            }
            typeCustomer = scanner.nextLine();
        }
        double taxes = totalSum - totalSumWithoutTaxes;

        if (typeCustomer.equals("special")){
            totalSum = totalSum * 0.9;
        }

        if (totalSum <= 0){
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalSumWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",totalSum);
        }
    }
}
