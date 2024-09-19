package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double money = 0;
        double availableMoney = 0;

        while (!input.equals("Start")){

            money = Double.parseDouble(input);

            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2){
                availableMoney += money;
            }else {
                System.out.printf("Cannot accept %.2f%n", money);
            }

            input = scanner.nextLine();
        }

        String products = scanner.nextLine();

        while (!products.equals("End")){

            if (products.equals("Nuts")){
                availableMoney -= 2;
                if (availableMoney < 0){
                    availableMoney += 2;
                    System.out.println("Sorry, not enough money");

                }else {
                    System.out.printf(" Purchased %s%n",products);
                }

            }else if (products.equals("Water")){
                availableMoney -= 0.7;
                if (availableMoney < 0){
                    availableMoney += 0.7;
                    System.out.println("Sorry, not enough money");

                }else {
                    System.out.printf("Purchased %s%n", products);
                }

            }else if (products.equals("Crisps")){
                availableMoney -= 1.5;
                if (availableMoney < 0){
                    availableMoney += 1.5;
                    System.out.println("Sorry, not enough money");

                }else {
                    System.out.printf("Purchased %s%n", products);
                }

            }else if (products.equals("Soda")){
                availableMoney -= 0.8;
                if (availableMoney < 0){
                    availableMoney += 0.8;
                    System.out.println("Sorry, not enough money");

                }else {
                    System.out.printf("Purchased %s%n", products);
                }

            }else if (products.equals("Coke")){
                availableMoney -= 1;
                if (availableMoney < 0){
                    availableMoney += 1;
                    System.out.println("Sorry, not enough money");

                }else {
                    System.out.printf("Purchased %s%n", products);
                }

            }else {
                System.out.println("Invalid product");
            }

  /*          if (availableMoney <= 0){
                System.out.println("Sorry, not enough money");
            }else {
                System.out.printf("Purchased %s%n", products);
            }*/

            products = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", Math.abs(availableMoney));
    }
}
