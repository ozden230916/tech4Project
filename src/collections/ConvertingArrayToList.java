package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {
        /*
        Create a array and store below data - countries1

        USA
        Brasilia
        Argentina
        France
        Belgium
        Germany
        Portugal

        Print your list

        RESULT:
        [USA, Brasilia, Argentina, France, Belgium, Germany, Portugal]
         */

        String[] countries = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};

        System.out.println("-----Way1 to convert Array to ArrayList or LinkedList-------");

        List<String> countries1 = new ArrayList<>(Arrays.asList(countries));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries));
        System.out.println(countries1);
        System.out.println(countries2);


        System.out.println("-----Way2 to convert Array to ArrayList or LinkedList-------");
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        Collections.addAll(countries3, countries);
        Collections.addAll(countries4, countries);

        System.out.println(countries3);
        System.out.println(countries4);

        System.out.println("-----Way3 to convert Array to ArrayList or LinkedList-------");

        int[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numbersList = new ArrayList<>();

        for (int i : numbers) {
            numbersList.add(i);

        }
        System.out.println(numbersList);



    }
}
