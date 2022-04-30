package collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        /*
        How to create a HAshSet
         */
        HashSet<Integer> numbers = new HashSet<>();
        //Set<Integer> numbers2 = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        System.out.println(numbers);//it will not allow duplicates and more than one null


    }
}
