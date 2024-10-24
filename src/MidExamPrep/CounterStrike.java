package MidExamPrep;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energyLevel = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int counterWinning = 0;
        boolean notEnoughEnergy = false;

        while (!command.equals("End of battle")) {

            int distanceToEnemy = Integer.parseInt(command);

            if (distanceToEnemy <= energyLevel) {

                energyLevel -= distanceToEnemy;
                counterWinning++;

                if (counterWinning % 3 == 0) {
                    energyLevel += counterWinning;
                }
            } else {
                notEnoughEnergy = true;

                break;
            }

            command = scanner.nextLine();
        }

        if (notEnoughEnergy) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", counterWinning, energyLevel);
        } else{
            System.out.printf("Won battles: %d. Energy left: %d", counterWinning, energyLevel);
    }
    }
}
