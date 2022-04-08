package collections;

import java.util.*;

public class ConvertingListsToEachOther {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println("The ArrayList ia = " + numbers);

        System.out.println("---Converting ArrayList to a LinkedList");
        List<Integer> numbers2 = new LinkedList<>(numbers);
        System.out.println("The LinkedList is = " + numbers2);

        System.out.println("---Converting LinkedList to ArrayList");
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);

        String[] namesArr = {"Kaly", "Torrie", "Taylor"};
        Vector<String> names2 = new Vector<>(Arrays.asList(namesArr));



    }
}
