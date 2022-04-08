package collections.arrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _03_PracticeRemoveElements {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");
        System.out.println("\n-----TASK-1-----\n");
        /*
        TASK-1
        Remove Python from the list and print it

        Result:
        [Java, JavaScript, C#, C++]
         */
        languages.remove("Python");
        System.out.println(languages);

        System.out.println("\n-----TASK-2-----\n");

        /*
        TASK-2
        Remove all elements that start with J

        RESULT:
        [C#, C++]
         */

       /* List<String> elementsStartsWithJ = new LinkedList<>();

        for (String language : languages) {
            if (language.startsWith("J")) elementsStartsWithJ.add(language);
        }

        languages.removeAll(elementsStartsWithJ);
        System.out.println(languages);*/

        //USING printIf()
        System.out.println("-----Using removeIf() Method------");

        languages.removeIf(element -> element.startsWith("J"));
        System.out.println(languages);

        System.out.println("-----Using iterator------");

        Iterator<String> iterator = languages.iterator();

        while (iterator.hasNext()){
            String element = iterator.next();
            if (element.startsWith("J")){
                iterator.remove();
            }
        }
        System.out.println(languages);


    }
}
