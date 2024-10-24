package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();

        for (int number : numbers){

            if (number > 0){
                positiveNumbers.add(number);
            }
        }
        if (positiveNumbers.isEmpty()){
            System.out.println("empty");
        }else {

            Collections.reverse(positiveNumbers);

            for (int number : positiveNumbers){
                System.out.print(number + " ");
            }
        }
    }
}
