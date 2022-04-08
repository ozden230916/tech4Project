package arrays;

import utilities.CharacterHelper;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {
        /*
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H
        Print the array
         */
        System.out.println("\n--------TASK-1--------\n");

        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(chars));

        System.out.println("\n--------TASK-2--------\n");
        /*
        Print the size of the array with a message
        The size of the array is = 6
         */

        System.out.println("The size of the array is = " + chars.length);

        System.out.println("\n--------TASK-3--------\n");
        /*
        Print each element using fori loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
         */
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("\n--------TASK-4--------\n");
        /*
        Print each element using foreach loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
         */
        for (char c : chars){
            System.out.println(c);
        }
        System.out.println("\n--------TASK-5--------\n");
        /*Print each element that are letters
        EXPECTED:
        A
        b
        H
         */
        System.out.println("-----using fori loop------");
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) System.out.println(chars[i]);

        }
        System.out.println("-----using for each loop------");
        for (char c : chars){
            if (Character.isLetter(c)) System.out.println(c);
        }
        System.out.println("\n--------TASK-6--------\n");
        /*
        Count how many uppercase characters you have in the array
        EXPECTED:
        2

         */
        System.out.println("-----using for i loop------");
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) count ++;
        }
        System.out.println(count);

        System.out.println("-----using for each loop------");
        int countUpper = 0;
        for (char c : chars){
            if (Character.isUpperCase(c)) countUpper ++;
        }
        System.out.println(countUpper);


    }
}
