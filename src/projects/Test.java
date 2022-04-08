package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 1, 3, 4, 3, 2, 6};
        int element = 0;
        int count = 0;
        List<Integer> withoutDuplicated = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length ; j++) {
                if(!withoutDuplicated.contains(numbers[i])) withoutDuplicated.add(numbers[i]);
                else if( !withoutDuplicated.contains(numbers[numbers.length - 1])){
                    withoutDuplicated.add(numbers[numbers.length - 1]);
                }

            }
        }
        for (int i = 0; i < withoutDuplicated.size(); i++) {
            element = withoutDuplicated.get(i);
            count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (withoutDuplicated.get(i) == numbers[j]){
                    count ++;

                }

            }
            System.out.println(element + " occurs " + count + " times");
        }






    }
}








