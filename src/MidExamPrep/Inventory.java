package MidExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      List<String> journal = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
      String command = scanner.nextLine();

      while (!command.equals("Craft!")){

          String [] commandData = command.split(" - ");
          String [] item = commandData[1].split(":");

          switch (commandData[0]){

              case "Collect" -> {
                  if (!journal.contains(item[0])) {
                      journal.add(item[0]);
                  }
              }
              case "Drop" -> {
                  if (journal.contains(item[0])) {
                      journal.remove(item[0]);
                  }
              }
              case "Combine Items" -> {

                  if (journal.contains(item[0])) {

                      String secondItem = item[1];
                     int indexOfFirst = journal.indexOf(item[0]);
                      journal.add(indexOfFirst + 1, secondItem);

                  }
              }
              case "Renew" -> {

                  if (journal.contains(item[0])){

                      int indexOfItem = journal.indexOf(item[0]);
                      journal.addLast(item[0]);
                      journal.remove(indexOfItem);


                  }
              }
          }
          command = scanner.nextLine();
      }

        for (int i = 0; i < journal.size() - 1; i++) {
            String item = journal.get(i);

            System.out.print(item + ", ");
        }

        System.out.println(journal.getLast());



    }
}
