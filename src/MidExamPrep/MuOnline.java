package MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<String> input = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String [] inputData = new String[input.size()];
        int startedHealth = 100;
        int sumBitcoins = 0;
        boolean isItDone = true;

        for (int i = 0; i < input.size(); i++) {

            inputData[i] = input.get(i);
            String [] command = inputData[i].split(" ");

            if (command[0].equals("potion")) {

                int currentHealth = Integer.parseInt(command[1]);

                if (startedHealth < 100) {

                    startedHealth += currentHealth;

                    if (startedHealth > 100) {

                        System.out.printf("You healed for %d hp.%n", currentHealth - (startedHealth - 100));
                        startedHealth = 100;


                    }else {
                        System.out.printf("You healed for %d hp.%n", currentHealth);
                    }

                    System.out.printf("Current health: %d hp.%n", startedHealth);
                }
            }else if (command[0].equals("chest")){

                int bitcoins = Integer.parseInt(command[1]);

                System.out.printf("You found %d bitcoins.%n", bitcoins);
                sumBitcoins += bitcoins;
            }else {
                String nameMonster = command[0];
                int monsterAttack = Integer.parseInt(command[1]);
                startedHealth -= monsterAttack;

                if (startedHealth > 0){
                    System.out.printf("You slayed %s.%n", nameMonster);
                }else {
                    System.out.printf("You died! Killed by %s.%n", nameMonster);
                    System.out.printf("Best room: %d", i + 1);
                    isItDone = false;
                    break;
                }
            }
        }
        if (isItDone){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", sumBitcoins);
            System.out.printf("Health: %d", startedHealth);
        }
    }
}
