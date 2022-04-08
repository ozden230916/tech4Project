package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        /*
        HOW TO SORT AN ARRAY OF NUMBERS
        byte, short, int, long, float, double
         */
        System.out.println("\n-----Sorting numbers------\n");
        int[] numbers = { 10, -5, 0, 0, 3, 0, 7, 9};
        System.out.println("My array is = " + Arrays.toString(numbers));
        System.out.println();

        Arrays.sort(numbers);
        System.out.println("My sorted array is = " + Arrays.toString(numbers));

        System.out.println("\n-----Sorting characters-----\n");
        char[] characters = {'A', 'b','z', 'H'};
        System.out.println("My char array = " + Arrays.toString(characters));

        Arrays.sort(characters);
        System.out.println("My sorted character array is = " + Arrays.toString(characters));

        System.out.println("\n-----Sorting words-----\n");
        String[] names = {"Adam", "Ademe", "Alex", "tom", "ally", "Adele", "terry", "Josh"};
        Arrays.sort(names);

        System.out.println("My sorted names array = " + Arrays.toString(names));
    }
}
