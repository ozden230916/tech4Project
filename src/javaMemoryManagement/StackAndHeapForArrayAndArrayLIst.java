package javaMemoryManagement;

import java.util.ArrayList;
import java.util.Arrays;

public class StackAndHeapForArrayAndArrayLIst {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Alex";
        names[2] = "Kaly";

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        ArrayList<String> newL = namesList;
        namesList = null;
        System.gc();

        System.out.println(Arrays.toString(names));
       // System.out.println(namesList);

        names[0] = "";
    }
}
