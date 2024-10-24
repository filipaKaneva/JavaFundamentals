package MoreExerciseLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSetStarted = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(drumSetStarted);
        String command = scanner.nextLine();

        while (!command.equals("Hit it again, Gabsy!")){

            int hitPower = Integer.parseInt(command);

            for (int i = 0; i < numbers.size(); i++) {

                if (numbers.get(i) - hitPower > 0) {
                    numbers.set(i, numbers.get(i) - hitPower);
                }else {
                    int priceForDrum = drumSetStarted.get(i) * 3;

                    if (savings >= priceForDrum) {
                        savings -= priceForDrum;
                        numbers.set(i, drumSetStarted.get(i));
                    }else {
                        numbers.remove(i);
                        drumSetStarted.remove(i);
                        i = i -1;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int nums : numbers){
            System.out.print(nums + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
