package arrays;

import java.util.*;

public class Test {
 /*
 Create a method called removeArraySpecialsDigits()
-This method will take a String array as argument, and it will return a String array without the special characters or digits from the elements.
NOTE: Assume that array size is at least 1.

  */
    public static String[] removeArraySpecialsDigits(String[] arr){
        for (String s : arr) {
             s= s.replaceAll("[^a-zA-Z\\s]", "");

        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"}));
    }
}
