package collectionsFramework;

import java.util.*;

public class Exercise02_findsecondgreatest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);

        TreeSet<Integer> uniques = new TreeSet<>(numbers);
        ArrayList<Integer> uniquesList = new ArrayList<>(uniques);
        System.out.println("Second greatest = " + uniquesList.get(uniquesList.size() - 2));
        System.out.println("Second smaller = " + uniquesList.get(1));

        int[] arr = {1, 2, 3, 4};
        Set<Integer> arrSet = new HashSet<>();
        for (int e : arr){
            arrSet.add(e);
        }
        System.out.println(arrSet);


    }
}
