package homework;

import java.util.*;

public class Homework22 {
    //TASK-1
    public static int[] fibonacciSeries1(int n){
        int[] fibonacci1 = new int[n];
        int first = 1;
        int second = 1;

        for (int i = 1; i <= n ; i++) {
            if(i == 1) fibonacci1[0] = 1;
            else if (i == 2) fibonacci1[1] = 1;
            else {
               int sum = first + second;
              fibonacci1[i - 1] = sum;
               first = second;
               second = sum;
            }

        }
        return fibonacci1;
    }

    //TASK-2
    public static int fibonacciSeries2(int n){
        int[] fibonacci2 = new int[n];
        int first = 1;
        int second = 1;

        for (int i = 1; i <= n ; i++) {
            if (i == 1) fibonacci2[0] = 1;
            else if (i == 2) fibonacci2[1] = 1;
            else {
                int sum = first + second;
                fibonacci2[i - 1] = sum;
                first = second;
                second = sum;
            }
        }
        return fibonacci2[n - 1];
    }

    //TASK - 3
    public static int[] findUniques(int[] arr1, int[] arr2){
        List<Integer> allElements = new ArrayList<>();
        for (int i : arr1) {
            allElements.add(i);
        }
        for (int i : arr2) {
            allElements.add(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        Set<Integer> uniquesSet = new LinkedHashSet<>(allElements);
        uniquesSet.removeIf(element-> Arrays.binarySearch(arr1, element) >= 0 && Arrays.binarySearch(arr2, element) >= 0);

        List<Integer> uniquesList = new ArrayList<>(uniquesSet);

        int[] uniques= new int[uniquesList.size()];
        for (int i = 0; i < uniquesList.size(); i++) {
            uniques[i] = uniquesList.get(i);

        }
        return uniques;

    }

    //TASK - 4

    public static boolean isPowerOf3(int n){
        if (n == 1) return true;
        else return (n % 3 == 0);
    }

    //TASK - 5
    public static int firstDuplicate(int[] numbers){
        int index = Integer.MAX_VALUE;
        int duplicatedElement = -1;
        if (numbers.length < 2) return -1;
        else{
            List<Integer> numbersList = new ArrayList<>();
            for (int number : numbers) {
                numbersList.add(number);

            }
            List<Integer> duplicates = new ArrayList<>();

            for (int i = 0; i < numbersList.size(); i++) {
                for (int j = i + 1; j < numbersList.size(); j++) {
                    if(numbersList.get(i) == numbersList.get(j)) duplicates.add(numbersList.get(i));
                }
            }
            if (duplicates.size() < 0) System.out.println(-1);
            else {
                for (int i = 0; i < duplicates.size() ; i++) {
                    if (numbersList.lastIndexOf(duplicates.get(i)) < index){
                        index = numbersList.lastIndexOf(duplicates.get(i));
                        duplicatedElement = duplicates.get(i);
                    }
                }

            }

        }
        return duplicatedElement;

    }
    

    public static void main(String[] args) {
        System.out.println("\n---------TASK-1--------\n");

        System.out.println(Arrays.toString(fibonacciSeries1(7)));

        System.out.println("\n---------TASK-2--------\n");

        System.out.println(fibonacciSeries2(8));

        System.out.println("\n---------TASK-3--------\n");

        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));

        System.out.println("\n---------TASK-4--------\n");

        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));

        System.out.println("\n---------TASK-5--------\n");

        System.out.println(firstDuplicate(new int[]{}));
        System.out.println(firstDuplicate(new int[]{1}));
        System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
        System.out.println(firstDuplicate(new int[]{1,  2, 3, 3, 4, 1}));













    }

}
