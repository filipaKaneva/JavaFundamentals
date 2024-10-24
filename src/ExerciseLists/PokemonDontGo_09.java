package ExerciseLists;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class PokemonDontGo_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> pokemonList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumOfAllElements = 0;

        while (!pokemonList.isEmpty()){

            int index = Integer.parseInt(scanner.nextLine());

            if(index < 0){

                int removedElement = pokemonList.getFirst();

                pokemonList.removeFirst();

                sumOfAllElements += removedElement;

                int lastElement = pokemonList.getLast();

                pokemonList.addFirst(lastElement);

                modifyList(pokemonList, removedElement);

            } else if (index > pokemonList.size() - 1) {

                int lastElement = pokemonList.getLast();

                pokemonList.removeLast();

                sumOfAllElements += lastElement;

                int firstElement = pokemonList.getFirst();

                pokemonList.add(firstElement);
                modifyList(pokemonList, lastElement);

            }else {

                int removedElement = pokemonList.get(index);

                sumOfAllElements += removedElement;

                pokemonList.remove(index);

                modifyList(pokemonList, removedElement);


            }


        }


        System.out.println(sumOfAllElements);

    }

    private static void modifyList(List<Integer> pokemonList, int removedElement) {

        for (int i = 0; i < pokemonList.size(); i++) {
            int currentElement = pokemonList.get(i);

            if(currentElement <= removedElement){
                currentElement += removedElement;
            }else {
                currentElement -= removedElement;
            }
            pokemonList.set(i, currentElement);
        }


    }
}