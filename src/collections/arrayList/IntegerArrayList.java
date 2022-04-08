package collections.arrayList;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        System.out.println(numbers.size());
        System.out.println(numbers);

        System.out.println("----printing all elements with fori loop----");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("--------printing elements with for each loop------");
        for (Integer number : numbers) {
            System.out.println(number);

        }

        int countEvens = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) countEvens++;

        }
        System.out.println("There are " + countEvens + " even numbers in this list");

        }
    }

