package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")){

            String[] commandData = input.split(" ");
            String command = commandData[0];
            String product1 = commandData[1];


            switch (command){

                case "Urgent" -> {
                    if (!productList.contains(product1)){
                        productList.add(0, product1);
                    }
                }
                case "Unnecessary" -> {
                    if (productList.contains(product1)){
                        productList.remove( product1);
                    }
                }
                case "Correct" -> {
                    String product2 = commandData[2];
                    int positionProduct1 = productList.indexOf(product1);
                    if (productList.contains(product1)){

                        productList.set(positionProduct1, product2);
                    }
                }
                case "Rearrange" -> {
                    if (productList.contains(product1)){
                        int positionProduct1 = productList.indexOf(product1);
                        productList.add(product1);
                        productList.remove(positionProduct1);
                    }
                }
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i <= productList.size() - 1; i++) {

            String currentProduct = productList.get(i);

            if (i != productList.size() - 1){
                System.out.print(currentProduct + ", ");
            }else {
                System.out.print(currentProduct);
            }

        }
    }
}
