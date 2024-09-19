package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        int counterIncorrectPass = 0;

        for (int position = username.length()-1; position >= 0 ; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        String currentPassword = scanner.nextLine();

        while (!currentPassword.equals(password)){


            counterIncorrectPass++;

            if (counterIncorrectPass >= 4){
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");

            currentPassword = scanner.nextLine();
        }

        System.out.printf("User %s logged in.", username);
    }
}
