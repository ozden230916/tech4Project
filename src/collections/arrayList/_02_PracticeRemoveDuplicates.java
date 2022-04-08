package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class _02_PracticeRemoveDuplicates {
    public static void main(String[] args) {
        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pencil");
        System.out.println("\n-----TASK-1-----\n");
        /*
        TASK-1
        Find unique elements in this and print them

        RESULT:
        [Cup, Book, Pen, Pencil]
         */

        List<String> withoutDuplicate = new ArrayList<>();
        for (String object : objects) {
            if (!withoutDuplicate.contains(object) ) withoutDuplicate.add(object);
        }
        System.out.println(withoutDuplicate);

        System.out.println("\n-----TASK-2-----\n");

    }
}
