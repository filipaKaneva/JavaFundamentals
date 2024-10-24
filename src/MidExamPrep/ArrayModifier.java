package MidExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] values = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String[] inputData = input.split(" ");
            String command = inputData[0];

            switch (command) {

                case "swap" -> {
                    int index1 = Integer.parseInt(inputData[1]);
                    int index2 = Integer.parseInt(inputData[2]);
                    int temp = values[index1];
                    values[index1] = values[index2];
                    values[index2] = temp;
                }

                case "multiply" -> {
                    int index1 = Integer.parseInt(inputData[1]);
                    int index2 = Integer.parseInt(inputData[2]);
                    values[index1] = values[index1] * values[index2];
                }
                case "decrease" -> {
                    for (int i = 0; i < values.length; i++) {
                        values[i]--;

                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(Arrays.toString(values)
                .replace("[", "")
                .replace("]", ""));
    }
}
