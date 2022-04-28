package collectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Exercise01_RemoveDuplicates {
    public static void main(String[] args) {
        /*
        Create an arrayList and store below elements
        Computer
        Phone
        Mouse
        Mouse
        Phone
        Pen

        From above list remove all duplicates and print the unique elements
         */
        List<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        System.out.println("\n-------First way - not preferred-------\n");
        System.out.println("My list before removing duplicates is = " + objects);

        List<String> uniques = new ArrayList<>();
        for(String s : objects){
            if (!uniques.contains(s)) uniques.add(s);
        }
        System.out.println("My list after removing duplicates is = " + uniques);

        System.out.println("\n-------Second way - using collections-------\n");
        //for insertion order we use LinkedHashSet
        //LinkedHashSet<String> objectsSet = new LinkedHashSet<>(objects);
        System.out.println(new LinkedHashSet<>(objects));

    }
}
