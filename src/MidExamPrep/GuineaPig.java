package MidExamPrep;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQuantityKg = Double.parseDouble(scanner.nextLine());
        double hayQuantityKg = Double.parseDouble(scanner.nextLine());
        double coverQuantityKg = Double.parseDouble(scanner.nextLine());
        double pigWeightKg = Double.parseDouble(scanner.nextLine());
        boolean isNotEnough = false;

        for (int day = 1; day <= 30; day++) {

            foodQuantityKg -= 0.300;

            if (day % 2 == 0){
                hayQuantityKg -= foodQuantityKg * 0.05;
            }
            if (day % 3 == 0){
                coverQuantityKg -= (pigWeightKg / 3) ;
            }

            if (foodQuantityKg <= 0 || hayQuantityKg <= 0 || coverQuantityKg <= 0){
                isNotEnough = true;
                break;
            }

        }
        if (isNotEnough){
            System.out.println("Merry must go to the pet store!");
        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodQuantityKg, hayQuantityKg, coverQuantityKg);
        }
    }
}
