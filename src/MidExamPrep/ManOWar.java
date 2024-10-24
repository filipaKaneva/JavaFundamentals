package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> statusOfPirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> statusOfWarShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maximumHealth = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean isLost = false;

        while (!input.equals("Retire")){

            String [] inputData = input.split(" ");
            String command = inputData[0];

            switch (command){

                case "Fire" -> {
                    int index = Integer.parseInt(inputData[1]);
                    int damage = Integer.parseInt(inputData[2]);

                    if (index >= 0 && index <= statusOfWarShip.size()){

                        int newIndex = statusOfWarShip.get(index) - damage;

                        if (newIndex > 0) {

                            statusOfWarShip.set(index, newIndex);
                        }else {
                            System.out.println("You won! The enemy ship has sunken.");
                        }
                    }
                }
                case "Defend" -> {

                    int startIndex = Integer.parseInt(inputData[1]);
                    int endIndex = Integer.parseInt(inputData[2]);
                    int damage = Integer.parseInt(inputData[3]);

                    if (startIndex >= 0 && startIndex < statusOfPirateShip.size() && endIndex > 0 && endIndex <= statusOfPirateShip.size()){

                        for (int i = startIndex; i <= endIndex; i++) {

                            int newSize = statusOfPirateShip.get(i) - damage;

                            if (newSize > 0) {

                                statusOfPirateShip.set(i, newSize);
                            }else {
                                isLost = true;
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                }
                case "Repair" -> {

                    int index = Integer.parseInt(inputData[1]);
                    int health = Integer.parseInt(inputData[2]);

                    if (index >= 0 && index <= statusOfPirateShip.size()){

                        int newHealth = statusOfPirateShip.get(index) + health;

                        if (newHealth <= maximumHealth){

                            statusOfPirateShip.set(index, newHealth);

                        }else {

                            statusOfPirateShip.set(index, maximumHealth);
                        }
                    }
                }
                case "Status" -> {

                    int counterSections = 0;

                    for (int sections : statusOfPirateShip){

                        if (sections < maximumHealth * 0.2){
                            counterSections++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", counterSections);
                }
            }
            input = scanner.nextLine();
        }

        if (!isLost){

            int pirateShipSum = 0;
            int warShipSum = 0;

            for (int sum : statusOfPirateShip){
                pirateShipSum += sum;
            }

            for (int sum : statusOfWarShip){
                warShipSum += sum;
            }

            System.out.printf("Pirate ship status: %d%n", pirateShipSum);
            System.out.printf("Warship status: %d",warShipSum);
        }
    }
}
