package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightsabersPricePerOne = Double.parseDouble(scanner.nextLine());
        double robesPricePerOne = Double.parseDouble(scanner.nextLine());
        double beltsPricePerOne = Double.parseDouble(scanner.nextLine());

        double priceForLightsabers = lightsabersPricePerOne * Math.ceil(countStudents + countStudents * 0.1);
        double priceForRobes = robesPricePerOne * countStudents;
        double priceForBelts = beltsPricePerOne * (countStudents - (countStudents / 6));
        double totalPrice = priceForLightsabers + priceForRobes + priceForBelts;

        if (budget >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }
    }
}
