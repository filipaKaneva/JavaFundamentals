package MoreExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLetters = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countLetters; i++) {

            int inputNumbers = Integer.parseInt(scanner.nextLine());
            String numberAsText = Integer.toString(inputNumbers);
            int digitsCount = numberAsText.length();
            int mainDigit = inputNumbers % 10;
            int offSet = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9){
                offSet++;
            }

            int letterIndex = offSet + digitsCount - 1;

            if (inputNumbers == 0){
                System.out.print(" ");
            }else {
                System.out.print((char) (letterIndex + 97));
            }
        }

    }
}
