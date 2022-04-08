package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        int[] numbersArray = {3, 7, 0 , 4};
        System.out.println("My array before sort = " + Arrays.toString(numbersArray));
        Arrays.sort(numbersArray);
        System.out.println("My array after sort = " + Arrays.toString(numbersArray));

        System.out.println("-------sorting an ArrayList------");
        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        numbersArrayList.add(3);
        numbersArrayList.add(7);
        numbersArrayList.add(0);
        numbersArrayList.add(4);

        System.out.println("My list before sorting = " + numbersArrayList);
        Collections.sort(numbersArrayList);
        System.out.println("My list after sorting = " + numbersArrayList);
    }
}
