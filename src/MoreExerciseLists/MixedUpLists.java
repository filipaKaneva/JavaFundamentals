package MoreExerciseLists;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbersTogether = new ArrayList<>();
        int startRange = 0;
        int endRange = 0;

        if (firstLine.size() > secondLine.size()){

            for (int i = 0; i < secondLine.size() ; i++) {

                numbersTogether.add(firstLine.get(i));
                numbersTogether.add(secondLine.get(secondLine.size() - 1 - i));
            }
            startRange = firstLine.get(secondLine.size());
            endRange = firstLine.get(secondLine.size() + 1);

        }else {
            for (int i = 0; i < firstLine.size() ; i++) {

                numbersTogether.add(firstLine.get(i));
                numbersTogether.add(secondLine.get(secondLine.size() - 1 - i));
            }
            startRange = secondLine.get(0);
            endRange = secondLine.get(1);
        }

        Collections.sort(numbersTogether);

        for (int numbers : numbersTogether){

            if (startRange < endRange) {

                if (numbers > startRange && numbers < endRange) {
                    System.out.print(numbers + " ");
                }
            }else {
                if (numbers > endRange && numbers < startRange) {
                    System.out.print(numbers + " ");
                }
            }
        }


    }
}
