package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int wagonMaxCapacity = Integer.parseInt(scanner.nextLine());

        List <String> command =  Arrays.stream (scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("end")) {

            if (command.get(0).equals("Add")){

                int wagonToAdd = Integer.parseInt(command.get(1));
                train.add(wagonToAdd);
            }else {
                int passengersToAdd = Integer.parseInt(command.get(0));

                for (int finalPassCount = 0; finalPassCount < train.size(); finalPassCount++) {

                    int exactPassengers = passengersToAdd + train.get(finalPassCount);

                    if (exactPassengers <= wagonMaxCapacity){

                        train.add(finalPassCount, exactPassengers);
                        train.remove(finalPassCount + 1);
                        break;
                    }
                }
            }



            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        }

        for (int wagon : train){

            System.out.print(wagon + " ");
        }

    }
}
