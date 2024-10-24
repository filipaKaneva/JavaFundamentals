package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] neighborhood = scanner.nextLine().split("@");
        int [] houses = Arrays
                .stream(neighborhood)
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentPosition = 0;
        String command = "";

        while (!(command = scanner.nextLine()).equals("Love!")){
            String [] parts = command.split(" ");
            int jumpLength = Integer.parseInt(parts[1]);

            currentPosition += jumpLength;
            if (currentPosition >= houses.length){
                currentPosition = 0;
            }
            if (houses[currentPosition] == 0){
                System.out.printf("Place %d already had Valentine's day.%n", currentPosition);
            }else {
                houses[currentPosition] -= 2;
                if (houses[currentPosition] == 0){
                    System.out.printf("Place %d has Valentine's day.%n", currentPosition);
                }
            }
        }
        System.out.printf("Cupid's last position was %d.%n", currentPosition);

        int failedHouses = 0;

        for (int hearts : houses){
            if (hearts > 0){
                failedHouses++;
            }
        }
        if (failedHouses == 0){
            System.out.println("Mission was successful.");
        }else {
            System.out.printf("Cupid has failed %d places.", failedHouses);
        }
    }
}