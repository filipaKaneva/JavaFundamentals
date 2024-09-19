package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double priceForOne = 0;


        switch (typePeople){
            case "Students" -> {
                if (dayOfWeek.equals("Friday")){
                priceForOne = 8.45;
                }else if (dayOfWeek.equals("Saturday")){
                    priceForOne = 9.80;
                }else if (dayOfWeek.equals("Sunday")){
                    priceForOne = 10.46;
                }

            }case "Business" -> {
                if (dayOfWeek.equals("Friday")){
                    priceForOne = 10.90;
                }else if (dayOfWeek.equals("Saturday")){
                    priceForOne = 15.60;
                }else if (dayOfWeek.equals("Sunday")){
                    priceForOne = 16;
                }

            }case "Regular" -> {
            if (dayOfWeek.equals("Friday")){
                priceForOne = 15;
            }else if (dayOfWeek.equals("Saturday")){
                priceForOne = 20;
            }else if (dayOfWeek.equals("Sunday")){
                priceForOne = 22.50;
            }
        }
        }
        double totalSum = priceForOne * numberOfPeople;

        if (typePeople.equals("Students") && numberOfPeople >= 30){
            totalSum = totalSum * 0.85;
        }else if (typePeople.equals("Business") && numberOfPeople >= 100){
            totalSum = priceForOne * (numberOfPeople - 10);
        }else if (typePeople.equals("Regular") && numberOfPeople >= 10 && numberOfPeople <= 20 ){
            totalSum = totalSum * 0.95;
        }

        System.out.printf("Total price: %.2f", totalSum);


    }
}
