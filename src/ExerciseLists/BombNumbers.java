package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] specialBombNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bombNumber = specialBombNumbers[0];
        int power = specialBombNumbers[1];

        int indexOfBomb = numbers.indexOf(bombNumber);

        while (indexOfBomb != -1) {
            removeNumbersAroundBomb(numbers, power, indexOfBomb);
            indexOfBomb = numbers.indexOf(bombNumber);
        }
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

    }

    private static void removeNumbersAroundBomb (List<Integer> numbers, int power, int indexOfBomb) {

        int startIndex = Math.max(0, indexOfBomb - power);
        int endIndex = Math.min(numbers.size(), indexOfBomb + power + 1);

        for (int i = endIndex - 1; i >= startIndex; i--) {
            numbers.remove(i);
        }
    }
}

