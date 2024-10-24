package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")){

            String [] inputData = input.split(" ");
            String command = inputData[0];
            int position = Integer.parseInt(inputData[1]);
            int power = Integer.parseInt(inputData[2]);

            switch (command){

                case "Shoot" -> {

                    if (position >= 0 && position <= numbers.size()){

                        int currentNumber = numbers.get(position) - power;

                        if (currentNumber <= 0){
                            numbers.remove(position);
                        }else {
                            numbers.set(position, currentNumber);
                        }
                    }
                }
                case "Add" -> {

                    if (position >= 0 && position < numbers.size()){

                        numbers.add(position, power);
                    }else {
                        System.out.println("Invalid placement!");
                    }
                }
                case  "Strike" -> {
                    if (position >= power && position <= numbers.size() - power){

                        for (int i = position + power ; i >= position - power; i--) {

                            numbers.remove(i);
                        }

                    }else {
                        System.out.println("Strike missed!");
                    }

                }
            } input = scanner.nextLine();
        }

        for (int i = 0; i < numbers.size() - 1; i++) {

            System.out.print(numbers.get(i) + "|");
        }

        System.out.println(numbers.getLast());

    }
}
