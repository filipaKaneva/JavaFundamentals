package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfLines = Byte.parseByte(scanner.nextLine());
        short waterTankCapacity = 255;
        short littersInTheTank = 0;

        for (int i = 0; i < numberOfLines; i++) {

            short quantitiesOfWater = Short.parseShort(scanner.nextLine());

            if (waterTankCapacity - quantitiesOfWater >= 0){
                waterTankCapacity -= (short) quantitiesOfWater;
                littersInTheTank += quantitiesOfWater;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(littersInTheTank);
    }
}
