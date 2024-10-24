package ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countProduct = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int count = 1; count <= countProduct; count++) {

            String product = scanner.nextLine();
            products.add(product);
            
        }

        Collections.sort(products);
        int number = 1;
        for (String product : products){

            System.out.println(number + "." + product);
            number++;

        }

    }
}
