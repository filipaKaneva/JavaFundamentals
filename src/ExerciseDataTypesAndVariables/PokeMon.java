package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nStarted = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int n = nStarted;

        int counterTargets = 0;

        while (n >= m){
            n -= m;
            counterTargets++;

            if (n * 2 == nStarted && y != 0){
                n /= y;
            }
        }

        System.out.println(n);
        System.out.println(counterTargets);
    }
}
