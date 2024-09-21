package LabDataTypesAndVariables;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte centuries = Byte.parseByte(scanner.nextLine());
        short years = (short) (centuries * 100);
        double days = years * 365.2422 ;
        double hours = days * 24.0;
        double minutes = hours * 60.0;

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);
    }
}
