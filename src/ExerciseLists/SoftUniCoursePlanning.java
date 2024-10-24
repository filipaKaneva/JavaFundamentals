package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> scheduleLessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")){

           String [] commandData = input.split(":");
           String command = commandData[0];
           String lessonsTitle = commandData[1];
           String exerciseTitle = lessonsTitle+"-"+"Exercise";

            switch (command) {
                case "Add" -> {
                    if (isTheTitleExistOnList (scheduleLessons, lessonsTitle)) {
                        scheduleLessons.add(lessonsTitle);
                    }
                }
                case "Insert" -> {
                    if (isTheTitleExistOnList (scheduleLessons, lessonsTitle)) {
                        int index = Integer.parseInt(commandData[2]);
                        scheduleLessons.add(index, lessonsTitle);
                    }
                }
                case "Remove" -> {
                    if (!isTheTitleExistOnList (scheduleLessons, lessonsTitle)) {
                        scheduleLessons.remove(lessonsTitle);
                        scheduleLessons.remove(exerciseTitle);
                    }
                }
                case "Swap" -> {
                    String firstLessonTitle = commandData[1];
                    String secondLessonTitle = commandData[2];
                    methodSwap(scheduleLessons, firstLessonTitle, secondLessonTitle);
                }
                case "Exercise" -> {
                    if (!isTheTitleExistOnList (scheduleLessons, lessonsTitle)) {
                        if (!scheduleLessons.contains(exerciseTitle)) {
                            int indexOfLesson = scheduleLessons.indexOf(lessonsTitle);
                            scheduleLessons.add(indexOfLesson + 1, exerciseTitle);
                        }
                    } else {
                        scheduleLessons.add(lessonsTitle);
                        scheduleLessons.add(exerciseTitle);
                    }
                }
            }

            input = scanner.nextLine();
        }
        int lessonIndex = 1;
        for (String lesson : scheduleLessons){


            System.out.println(lessonIndex + "." + lesson);
            lessonIndex++;
        }
    }

    private static void methodSwap(List<String> scheduleLessons,  String firstLessonTitle, String secondLessonTitle) {

        if (scheduleLessons.contains(firstLessonTitle) && scheduleLessons.contains(secondLessonTitle)){
            int firstPosition = scheduleLessons.indexOf(firstLessonTitle);
            int secondPosition = scheduleLessons.indexOf(secondLessonTitle);

            scheduleLessons.set(firstPosition, secondLessonTitle);
            scheduleLessons.set(secondPosition, firstLessonTitle);
            String firstExerciseTitle = firstLessonTitle+"-"+"Exercise";
            String secondExerciseTitle = secondLessonTitle+"-"+"Exercise";

            if (scheduleLessons.contains(firstExerciseTitle)){
                int indexOfExecise = scheduleLessons.indexOf(firstLessonTitle);
                scheduleLessons.remove(indexOfExecise);
                scheduleLessons.add(secondPosition + 1,firstExerciseTitle);


            }else if (scheduleLessons.contains(secondExerciseTitle)){
                int indexOfExecise = scheduleLessons.indexOf(secondExerciseTitle);
                scheduleLessons.remove(indexOfExecise);
                scheduleLessons.add(firstPosition + 1,secondExerciseTitle);

            }
        }
    }
    private static boolean isTheTitleExistOnList (List<String> scheduleLessons, String lessonsTitle){
        return !scheduleLessons.contains(lessonsTitle);
    }
}

