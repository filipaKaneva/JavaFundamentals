package LabDataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.next().charAt(0);

        if (letter >= 97 && letter <= 122){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }
    }
}
