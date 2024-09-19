package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentHours = Integer.parseInt(scanner.nextLine());
        int currentMinutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = currentHours * 60 + currentMinutes + 30;

        int finalHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        if (finalHours > 23){
            finalHours = 0;
        }

        System.out.printf("%d:%02d", finalHours, finalMinutes);
    }
}
