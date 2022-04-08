package arrays;

import java.util.Arrays;

public class FruitCollection {
    public static void main(String[] args) {
        /*
        Task-1
        Create an array that will store 4 fruit names
        Then, print the empty array

        EXPECTED OUTPUT
        [null, null, null, null]
         */
        String[] fruits =new String[4];
        System.out.println(Arrays.toString(fruits));
        /*
        Task-2
        Store your favorite fruit and store it at the index of 0
        Store the 4th fav fruit in the index of 3
        Print the array again

         EXPECTED OUTPUT
        [Banana, null, null, Apple]
         */
        fruits[0] = "Banana";
        fruits[3] = "Apple";

        System.out.println(Arrays.toString(fruits));
        /*
        Task-3
        find the size of your array and print it
        SIZE
         */
        System.out.println(fruits.length);

        /*
        Task-4
        Print the elements at the index of 0 and 3
         */

        System.out.println(fruits[0]);
        System.out.println(fruits[3]);
        System.out.println(fruits[1]);

        System.out.println(fruits[0].toUpperCase());
        System.out.println(fruits[0].charAt(0));
        System.out.println(fruits[3].length());
        System.out.println(fruits[0].startsWith("B"));

        //System.out.println(fruits[1].length());//NullPointerException
    }
}
