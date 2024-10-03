package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfPeople = Byte.parseByte(scanner.nextLine());
        byte capacity = Byte.parseByte(scanner.nextLine());

        double counterCourses = Math.ceil(numberOfPeople * 1.0 / capacity );

        System.out.printf("%.0f", counterCourses);


    }
}
