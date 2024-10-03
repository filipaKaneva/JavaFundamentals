package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberWagons = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int [] wagons = new int[numberWagons];

        for (int i = 0; i < wagons.length; i++) {

            wagons[i] = Integer.parseInt(scanner.nextLine());

            System.out.print(wagons[i] + " ");

            sum = sum + wagons[i];

        }

        System.out.println();
        System.out.println(sum);

        }
    }

