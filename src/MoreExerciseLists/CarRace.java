package MoreExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

       int middlePosition = numbers.size() / 2;
       double leftRacerSum = 0;
       double rightRacerSum = 0;

        for (int i = 0; i < middlePosition; i++) {

            if (numbers.get(i) == 0){
                leftRacerSum = leftRacerSum * 0.8;
            }else {
                leftRacerSum += numbers.get(i);
            }
        }

        for (int i = numbers.size() - 1; i > middlePosition ; i--) {
            if (numbers.get(i) == 0){
                rightRacerSum = rightRacerSum * 0.8;
            }else {
                rightRacerSum += numbers.get(i);
            }
        }

        if (leftRacerSum < rightRacerSum){

            System.out.printf("The winner is left with total time: %.1f", leftRacerSum);
        }else {
            System.out.printf("The winner is right with total time: %.1f", rightRacerSum);
        }
    }
}
