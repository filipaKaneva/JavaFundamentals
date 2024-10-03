package DataTypesAndVariablesMoreExercise;

import java.util.Objects;
import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numbersOfLines = Integer.parseInt(scanner.nextLine());
        int openedBracketCounter = 0;
        int closedBracketsCounter = 0;

        for (int i = 0; i < numbersOfLines; i++)
        {
            String input = scanner.nextLine();

            if(Objects.equals(input, ")") && openedBracketCounter == 0) {
                System.out.println("UNBALANCED");
                return;
            }

            else if (Objects.equals(input, "(")) {

                openedBracketCounter ++;
                if (openedBracketCounter == 2)
                {
                    System.out.println("UNBALANCED");
                    return;
                }
            }

            else if (Objects.equals(input, ")")) {
                closedBracketsCounter ++;
                if (closedBracketsCounter == 2)
                {
                    System.out.println("UNBALANCED");
                    return;
                }
            }

            if(openedBracketCounter==1 && closedBracketsCounter == 1) {
                openedBracketCounter = 0;
                closedBracketsCounter = 0;
            }
        }


        if (openedBracketCounter == closedBracketsCounter)
        {
            System.out.println("BALANCED");
        }

        else
        {
            System.out.println("UNBALANCED");
        }


    }
    }

