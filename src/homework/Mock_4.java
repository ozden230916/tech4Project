package homework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Mock_4 {
    /*
    Requirement:
-Student is responsible to create a main method and test their method.
-Write a method that takes an array of String and returns the count of each unique element in the array as a Map
Test Data:
[“Apple”, “Apple”, “Orange”, “Apple”, “Kiwi”]
Expected:
 {Apple=3, Orange=1, Kiwi=1}
     */
    public static LinkedHashMap<String, Integer> countUniques(String[] arr){
        LinkedHashMap<String, Integer> uniques = new LinkedHashMap<>();
        for (String s : arr) {
            if (!uniques.containsKey(s)) uniques.put(s, 1);
            else uniques.put(s, uniques.get(s) + 1);
        }
        return uniques;
    }

    public static void main(String[] args) {

        System.out.println(countUniques(new String[] {"Apple", "Apple", "Orange", "Apple", "Kiwi"}));
    }
}
