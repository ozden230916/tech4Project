package collections.arrayList;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 5, 7, 1, 5, 2, 4, 6, 9, 3};
       Map<Integer, Integer> numbersMap = new HashMap<>();
       for(int number : numbers){
           if (!numbersMap.containsKey(number)) numbersMap.put(number , 1);
           else numbersMap.put(number, numbersMap.get(number) + 1);
       }

       for(Map.Entry entry : numbersMap.entrySet()){
           System.out.println(entry);
       }



    }
}
