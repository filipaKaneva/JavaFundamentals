package ExerciseLists;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("end")){


            if (command.get(0).equals("Delete")) {

                int currentNumber = Integer.parseInt(command.get(1));

                for (int i = 0; i < numbers.size() - 1; i++) {

                    numbers.remove(Integer.valueOf(currentNumber));
                }

            } else if (command.get(0).equals("Insert")) {

                int currentNumber = Integer.parseInt(command.get(1));
                int position = Integer.parseInt(command.get(2));

                numbers.add(position , currentNumber);
            }

            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

            for (int number : numbers){

                System.out.print(number + " ");
            }

        }
    }

