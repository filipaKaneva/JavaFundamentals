package MidExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        int countShotTargets = 0;

        while (!input.equals("End")){

            int shotPosition = Integer.parseInt(input);
            if (shotPosition >= 0 && shotPosition <= targets.length - 1){

                int valueShotTarget = targets[shotPosition];

                for (int position = 0; position <= targets.length - 1; position++) {

                    int currentTargetValue = targets[position];

                    if (currentTargetValue != -1 && position != shotPosition){
                        if (currentTargetValue > valueShotTarget){
                            currentTargetValue -= valueShotTarget;
                        }else {
                            currentTargetValue += valueShotTarget;
                        }

                        targets[position] = currentTargetValue;
                    }
                }
                targets[shotPosition] = -1;
                countShotTargets++;
            }
            input = scanner.nextLine();
        }

        System.out.print("Shot targets: " + countShotTargets + " -> ");
        for (int target : targets){
            System.out.print(target + " ");
        }
    }
}
