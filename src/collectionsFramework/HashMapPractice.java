package collectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Roma");
        capitals.put("US", "DC");
        capitals.put("Canada", "Ottawa");

        //How to print HashMap
        System.out.println(capitals);//{Canada=Ottawa, Ukraine=Kiev, Italy=Roma, Portugal=Lisbon, US=DC, Spain=Madrid}




        //How to get a particular key value pair
        System.out.println(capitals.get("Spain"));
        System.out.println(capitals.get("us"));

        System.out.println("\n--------Understanding HashMap------\n");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alona");
        students.put(2, "Abdullah");
        students.put(3, "Abdullah");
        students.put(4, "Data");
        students.put(null, "John");
        students.put(null, "Alex");//This will replace John with Alex
        students.put(1, "Daria");
        students.put(5, null);
        students.put(6, null);
        students.put(7, null);
        students.put(null, null);//This will replace Alex with null
        System.out.println(students.size());
        System.out.println(students);


    }
}
