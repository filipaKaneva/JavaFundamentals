package MoreExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startedMoney = Double.parseDouble(scanner.nextLine());
        double leftMoney = startedMoney;
        double price = 0;
        String gameName = scanner.nextLine();
        boolean isValid = false;

        while (!gameName.equals("Game Time")){

            if (gameName.equals("OutFall 4")){
                isValid = true;
            price = 39.99;
            }else if (gameName.equals("CS: OG")){
                isValid = true;
                price = 15.99;
            }else if (gameName.equals("Zplinter Zell")){
                isValid = true;
                price = 19.99;
            }else if (gameName.equals("Honored 2")){
                isValid = true;
                price = 59.99;
            }else if (gameName.equals("RoverWatch")){
                isValid = true;
                price = 29.99;
            }else if (gameName.equals("RoverWatch Origins Edition")){
                isValid = true;
                price = 39.99;
            }else {
                System.out.println("Not Found");
            }

            if (leftMoney - price < 0){
                System.out.println("Too Expensive");
            }

            if (leftMoney >= price){
                leftMoney -= price;
                if (isValid){
                System.out.printf("Bought %s%n", gameName);
            }
            }


            gameName = scanner.nextLine();
        }

        if (leftMoney > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", startedMoney - leftMoney, leftMoney);
        }else if (leftMoney == 0){
        System.out.println("Out of money!");

        }


    }
}
