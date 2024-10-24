package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream (scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){

            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName){
                case "Add" -> {
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);

                }

                case "Remove" ->{
                    int numberToRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                }

                case "RemoveAt"->{
                    int positionForRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(positionForRemove);
                }

                case "Insert"->{
                    int numberForInsert = Integer.parseInt(commandParts[1]);
                            int positionForInsert = Integer.parseInt(commandParts[2]);
                            numbers.add(positionForInsert, numberForInsert);
                }

            }
            command = scanner.nextLine();
        }

        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}
