package ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String[] firstInitial = firstInput.split(" ");

        String secondInput = scanner.nextLine();
        String[] secondInitial = secondInput.split(" ");

        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();

        for (int i = 0; i < firstInitial.length; i++) {
            player1.add(Integer.parseInt(firstInitial[i]));
        }
        for (int i = 0; i < secondInitial.length; i++) {
            player2.add(Integer.parseInt(secondInitial[i]));
        }
        while (player1.size() > 0 && player2.size() > 0) {
            if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            } else if (player2.get(0) > player1.get(0)) {
                player2.add(player2.get(0));
                player2.add(player1.get(0));
                player1.remove(0);
                player2.remove(0);
            } else {
                player1.remove(0);
                player2.remove(0);
            }
        }
        int sum = 0;
        if (player1.size() == 0) {
            for (int card : player2) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (int card : player1) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }

    }
}

