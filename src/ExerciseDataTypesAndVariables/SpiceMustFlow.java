package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sourceAvailability = Integer.parseInt(scanner.nextLine());
        int totalSpices = 0;
        int daysCounter = 0;


        while (sourceAvailability >= 100){

            daysCounter++;
            int spicePerDay = sourceAvailability - 26;
            totalSpices += spicePerDay;
            sourceAvailability -= 10;

       }

        totalSpices -= 26;

        if (totalSpices < 0){
            totalSpices = 0;
        }

        System.out.println(daysCounter);
        System.out.println(totalSpices);

    }
}
