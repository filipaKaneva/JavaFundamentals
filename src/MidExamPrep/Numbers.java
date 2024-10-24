package MidExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sumNumber = 0;

        List<Integer> higherNumber = new ArrayList<>();

        for (int currentNumber : numbers){
            sumNumber += currentNumber;
        }

        double averageNumber = sumNumber * 1.0 / numbers.size();

        for (int currentNumber : numbers){

            if (currentNumber > averageNumber){
                higherNumber.add(currentNumber);
            }
        }

        Collections.sort(higherNumber);
        Collections.reverse(higherNumber);

        if (higherNumber.size() <= 5 && higherNumber.size() >= 1){

            for (int number : higherNumber){

                System.out.print(number + " ");
        }
        }else if (higherNumber.size() > 5){

            for (int i = 0; i < 5; i++) {
                System.out.print(higherNumber.get(i) + " ");
            }
        }else {
            System.out.println("No");
        }
    }
}
