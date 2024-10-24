package MidExamPrep;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int numberOfStudents = Integer.parseInt(scanner.nextLine());
       int numberOfLectures = Integer.parseInt(scanner.nextLine());
       int additionalBonus  = Integer.parseInt(scanner.nextLine());
       double studentWithMaximumBonus = 0;
       int maxAttendance = 0;

        for (int i = 0; i < numberOfStudents; i++) {

            int attendance = Integer.parseInt(scanner.nextLine());
            double totalBonusOfStudent = attendance * 1.0 / numberOfLectures * (5 + additionalBonus);

            if (totalBonusOfStudent > studentWithMaximumBonus){
                studentWithMaximumBonus = totalBonusOfStudent;
                maxAttendance = attendance;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", studentWithMaximumBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendance);

    }
}
