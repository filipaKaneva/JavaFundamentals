package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasures = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")){

            String [] inputData = input.split(" ");
            String activity = inputData[0];

            switch (activity){

                case "Loot" -> {

                    for (int i = 1; i < inputData.length; i++) {

                        if (!treasures.contains(inputData[i])){
                            treasures.add(0, inputData[i]);
                        }

                    }
                }
                case "Drop" -> {
                    int index = Integer.parseInt(inputData[1]);

                    if (index >= 0 && index <= treasures.size()){

                        String name = treasures.get(index);

                        treasures.remove(index);
                        treasures.add(name);

                    }
                }
                case "Steal" -> {

                    int count = Integer.parseInt(inputData[1]);

                    if (count <= treasures.size()){

                        for (int i = count; i > 0; i--) {

                            String removedElementName = treasures.get(treasures.size() - i);
                            treasures.remove(treasures.size() - i);

                            if (i > 1) {
                                System.out.print(removedElementName + ", ");

                            }else {
                                System.out.print(removedElementName);
                            }
                        }
                    }else {

                        treasures.clear();
                    }
                }
            }
            input = scanner.nextLine();
        }

        System.out.println();

        if (!treasures.isEmpty()) {
            double treasureGain = 0;

            for (int i = 0; i < treasures.size(); i++) {

                treasureGain += treasures.get(i).length();

            }

            System.out.printf("Average treasure gain: %.2f pirate credits.", treasureGain / treasures.size());

        }else {

            System.out.println("Failed treasure hunt.");
        }

    }
}
