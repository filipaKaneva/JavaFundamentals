package MidExamPrep;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double targetPlunder = Double.parseDouble(scanner.nextLine());;
        int counterDays = 0;
        double sumPlunder = 0;

        for (int i = 0; i < days; i++) {

            counterDays++;
            sumPlunder += dailyPlunder;

            if (counterDays % 3 == 0){

                sumPlunder +=  dailyPlunder * 0.5;

            }
            if (counterDays % 5 == 0) {

            sumPlunder = sumPlunder * 0.7;

                }
            }

        if (sumPlunder >= targetPlunder){

            System.out.printf("Ahoy! %.2f plunder gained.",sumPlunder);
        }else {

            double percentLeft = (sumPlunder / targetPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentLeft);
        }


        }


    }

