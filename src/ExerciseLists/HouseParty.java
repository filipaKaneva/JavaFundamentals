package ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCommands = Integer.parseInt(scanner.nextLine());

        List<String> goingPeople = new ArrayList<>();

        for (int i = 0; i < numberCommands; i++) {

            String command = scanner.nextLine();
            String [] commandData = command.split(" ");
            String name = commandData [0];
            boolean isNameHere = goingPeople.contains(name);


            if (isNameHere){
                String goingOrNot = commandData[2];
                if (goingOrNot.equals("going!")){
                    System.out.printf("%s is already in the list!%n", name);
                }else if (goingOrNot.equals("not")){
                    goingPeople.remove(name);
                }
            }else {
                String goingOrNot = commandData[2];
                if (goingOrNot.equals("going!")) {
                    goingPeople.add(name);
                }else {
                    System.out.printf("%s is not in the list!%n",name);
                }
            }

        }

        for (String names : goingPeople){
            System.out.println(names);
        }
    }

}
