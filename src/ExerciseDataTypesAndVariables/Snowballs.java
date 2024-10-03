package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       byte numberOfSnowballs = Byte.parseByte(scanner.nextLine());
       double bestSnowballValue = 0;
       int bestSnow = 0;
       int bestTime = 0;
       int bestQuality = 0;

        for (int i = 0; i < numberOfSnowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > bestSnowballValue){
                bestSnowballValue = snowballValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }

        }

        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestSnowballValue, bestQuality );


    }
}
