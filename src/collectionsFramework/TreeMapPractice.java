package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        TreeMap<String, Integer> studentsAges = new TreeMap<>();
        studentsAges.put("Kaly", 17);
        studentsAges.put("Torrie", 20);
        studentsAges.put("Alona", 15);
        studentsAges.put("andrei", 25);
        //studentsAges.put(null, 15);->NullPointerException
        studentsAges.put("Guluzar", null);
        studentsAges.put("Melda", null);
        studentsAges.put("Taylor", null);
        studentsAges.put("Ismail", null);



        System.out.println(studentsAges);
    }
}
