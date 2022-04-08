package collections;

import java.util.*;

public class ConvertingListToArray {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rami");
        names.add("Naim");
        names.add("Reem");

        LinkedList<Integer> ages = new LinkedList<>();
        ages.add(25);
        ages.add(26);
        ages.add(27);
        ages.add(30);

        Vector<Boolean> booleans = new Vector<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);

        System.out.println("-----Converting List to Array----");

        System.out.println("---Way 1----");
        String[] namesArr1 = new String[names.size()];

        for (int i = 0; i < names.size(); i++) {
            namesArr1[i] = names.get(i);
        }

        System.out.println(Arrays.toString(namesArr1));

        System.out.println("---Way 2----");
        Object[] namesArr2 = names.toArray();
        Object[] agesArr = ages.toArray();
        Object[] booleansArr = booleans.toArray();

        System.out.println(Arrays.toString(namesArr2));
        System.out.println(Arrays.toString(agesArr));
        System.out.println(Arrays.toString(booleansArr));


    }
}
