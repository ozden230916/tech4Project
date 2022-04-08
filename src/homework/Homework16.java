package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {
    //TASK-1

    public static int countWords(String str){
        String[] arr=str.trim().split(" ");
        return arr.length;
    }

    //TASK-2

    public static int countA(String str){
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a')countA++;
        }
        return countA;
    }

    //TASK-3
    /*
    Write a method countPos() that takes an ArrayList of
Integer as an argument, and returns how many elements
are positive
Test data 1:
[-45, 0, 0, 34, 5, 67]
     */
    public static Integer countPos(ArrayList<Integer> numbers){
        int countPos = 0;
        for (Integer number : numbers) {
            if (number > 0)countPos++;
        }
        return countPos;
    }
    //TASK-4

    public static ArrayList removeDuplicateNumbers(ArrayList<Integer> arr){
        ArrayList<Integer> withoutDuplicates = new ArrayList<>();
        for (Integer integer : arr) {
            if (!withoutDuplicates.contains(integer)) withoutDuplicates.add(integer);

        }
        return withoutDuplicates;
    }
    //TASK-5
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> arr){
        ArrayList<String> withoutDuplicateElements = new ArrayList<>();
        for (String s : arr) {
            if (!withoutDuplicateElements.contains(s)) withoutDuplicateElements.add(s);
        }
        return withoutDuplicateElements;
    }
    //TASK-6
    public static String removeExtraSpaces(String str){
        String s1 = "";

        String[] words = str.trim().split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        ArrayList<String> withoutExtraSpaces = new ArrayList<>();
        for (String s : wordsList) {
            if (!s.equals("")) withoutExtraSpaces.add(s);
        }
        for (String withoutExtraSpace : withoutExtraSpaces) {
                s1 += withoutExtraSpace + " " ;

        }
        return s1;
    }
    //TASK-7
    public static String add(int[] arr1, int[] arr2){
        int[] sum = new int[Math.max(arr1.length, arr2.length)];
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                sum[i] = arr1[i] + arr2[i];
            }
        }
        else if (arr1.length > arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (i <= arr2.length - 1) sum[i] = arr1[i] + arr2[i];
                else sum[i] = arr1[i];
            }
        }
        else {
            for (int i = 0; i < arr2.length; i++) {
                if (i <= arr1.length - 1) sum[i] = arr1[i] + arr2[i];
                else sum[i] = arr2[i];

            }
        }
        return Arrays.toString(sum);
    }
    //TASK-8
    public static int findClosestTo10(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for (int number : arr) {
            if (number != 10){
                if (Math.abs(number - 10) < Math.abs(smallest - 10)) smallest = number;
                else if (Math.abs(number - 10) == Math.abs(smallest - 10)) smallest = Math.min(smallest, number);
            }
        }
        return smallest;
    }
    ////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");
        System.out.println(countWords("Selenium is the most common UI automation tool.   "));

        System.out.println("\n--------TASK-2--------\n");
        System.out.println(countA("QA stands for Quality Assurance"));

        System.out.println("\n--------TASK-3--------\n");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-45);
        numbers.add(0);
        numbers.add(0);
        numbers.add(34);
        numbers.add(5);
        numbers.add(67);
        System.out.println(countPos( numbers));

        System.out.println("\n--------TASK-4--------\n");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(35);
        nums.add(20);
        nums.add(35);
        nums.add(60);
        nums.add(70);
        nums.add(60);
        System.out.println(removeDuplicateNumbers(nums));

        System.out.println("\n--------TASK-5--------\n");
        ArrayList<String > elements = new ArrayList<>();
        elements.add("java");
        elements.add("C#");
        elements.add("ruby");
        elements.add("JAVA");
        elements.add("ruby");
        elements.add("C#");
        elements.add("C++");
        System.out.println(removeDuplicateElements(elements));

        System.out.println("\n--------TASK-6--------\n");
        System.out.println(removeExtraSpaces("  I   am      learning     Java     "));

        System.out.println("\n--------TASK-7--------\n");
        System.out.println(add(new int[]{6, 8, 3, 0, 0, 7, 5, 10, 34}, new int[] {10, 3, 6, 3, 2}));

        System.out.println("\n--------TASK-8-------\n");
        System.out.println(findClosestTo10(new int[]{10, -13, 8, 12, 15, -20}));

    }

}
