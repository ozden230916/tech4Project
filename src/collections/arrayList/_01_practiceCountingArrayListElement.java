package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class _01_practiceCountingArrayListElement {
    public static void main(String[] args) {
        System.out.println("\n-----TASK-1-----\n");
        /*
        TASK-1
        Create an ArrayList called numbers that stores below numbers,

        10
        12
        13
        8
        9
        15

        Print the list

         */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);

        System.out.println(numbers);

        System.out.println("\n-----TASK-2-----\n");
        /*
        TASK-2
        Count how many odd numbers you have in the list and print the result

        RESULT:
        Odds = 3
         */
        System.out.println("---foreach loop----");
        int countOdd = 0;
        for (Integer number : numbers) {
            if (number % 2 == 1) countOdd ++;

        }
        System.out.println("Odds = " + countOdd);


        System.out.println("---fori loop----");
        countOdd = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1) countOdd++;
        }
        System.out.println(countOdd);



        System.out.println("\n-----TASK-3-----\n");
        /*
        TASK-3
        Create a List called colors that stores below elements
        Purple
        Yellow
        blue
        red
        Brown
        Black
        White

        And then print the list

        RESULT:
        [Purple, Yellow, blue, red, Brown, Black, White]
         */

        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");

        System.out.println(colors);

        System.out.println("\n-----TASK-4-----\n");
        /*
        TASK-4
        Count how many colors in the colors list are starting with uppercase

        RESULT:
        5
         */
        int countUpperCase = 0;

        System.out.println("---foreach loop----");
        for (String color : colors) {
            if (Character.isUpperCase(color.charAt(0))) countUpperCase++;

        }
        System.out.println(countUpperCase);

        System.out.println("---fori loop----");
        countUpperCase = 0;
        for (int i = 0; i < colors.size(); i++) {
            if (Character.isUpperCase(colors.get(i).charAt(0))) countUpperCase++;

        }
        System.out.println(countUpperCase);

    }
}
