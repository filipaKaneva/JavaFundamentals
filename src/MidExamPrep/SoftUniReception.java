package MidExamPrep;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiencyPerHour = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiencyPerHour = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiencyPerHour = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int totalEfficiencyPerHour = firstEmployeeEfficiencyPerHour+ secondEmployeeEfficiencyPerHour + thirdEmployeeEfficiencyPerHour;
        int countHours = 1;

      while (studentsCount > 0){
          if (countHours % 4 == 0){
              studentsCount -= 0;
          }else {
              studentsCount -= totalEfficiencyPerHour;
          }
          countHours++;
      }
        System.out.printf("Time needed: %dh.", countHours - 1);


    }
}
