package homework;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Homework18 {
    //TASK-1

    public static String noSpace(String s){
        return s.replaceAll("\\s", "");
    }

    //TASK-2

    public static String replaceFirstLast(String s){
        String sNew = s.trim();
        if (sNew.length() < 2) return "";
        return sNew.charAt(sNew.length() - 1) + sNew.substring(1, sNew.length() -1) + sNew.charAt(0);
    }
    //TASK-3

    public static boolean hasVowel(String s){
        char[] chars = s.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return Arrays.binarySearch(chars, 'a') >= 0 || Arrays.binarySearch(chars, 'e') >= 0 || Arrays.binarySearch(chars, 'i') >= 0 ||
                Arrays.binarySearch(chars, 'o') >= 0 || Arrays.binarySearch(chars, 'u') >= 0;
    }
    //TASK-4

    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(date));
        int age = currentYear - yearOfBirth;
        if ( age >= 0 && age < 16) System.out.println("AGE IS NOT ALLOWED");
        else if (age >= 16 && age <= 100) System.out.println("AGE IS ALLOWED");
        else System.out.println("AGE IS NOT VALID");
    }
    //TASK-5

    public static int averageOfEdges(int a, int b, int c){
        return (Math.max(Math.max(a, b), c) + Math.min(Math.min(a, b), c)) / 2;
    }
    //TASK-6

    public static String[] noA(String[] arr){
        String[] arrNew = new String[arr.length];
        for (int i = 0; i < arrNew.length; i++) {
            if (arr[i].toLowerCase().startsWith("a")) arrNew[i] = "###";
            else arrNew[i] = arr[i];
        }
        return arrNew;
    }
    //TASK-7

    public static int[] no3or5(int[] arr){
        int[] numbers = new int[arr.length];
        for (int i = 0; i < numbers.length; i++) {
            if (arr[i] % 15 == 0) numbers[i] = 101;
            else if (arr[i] % 5 == 0) numbers[i] = 99;
            else if (arr[i] % 3 == 0) numbers[i] = 100;
            else numbers[i] = arr[i];
        }
        return numbers;
    }
    //TASK-8

    public static int countPrimes(int[] arr){
        int count = 0;
        for (int n : arr) {
            if (n == 2 || n == 3) count++;
            else if (n > 3){
                boolean isPrime = true;
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0){
                        isPrime = false;
                    }
                }
                if (isPrime) count++;
            }
            
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println("\n--------TASK-1------\n");

        System.out.println(noSpace(""));
        System.out.println(noSpace("Java"));
        System.out.println(noSpace("   Hello   "));
        System.out.println(noSpace("Hello World  "));
        System.out.println(noSpace("Tech Global"));

        System.out.println("\n--------TASK-2------\n");

        System.out.println(replaceFirstLast(""));
        System.out.println(replaceFirstLast("A"));
        System.out.println(replaceFirstLast("   A       "));
        System.out.println(replaceFirstLast("Hello"));
        System.out.println(replaceFirstLast("Tech Global"));

        System.out.println("\n--------TASK-3------\n");

        System.out.println(hasVowel(""));
        System.out.println(hasVowel("java"));
        System.out.println(hasVowel("1234"));
        System.out.println(hasVowel("ABC"));

        System.out.println("\n--------TASK-4------\n");

        checkAge(2006);
        checkAge(2005);
        checkAge(2050);
        checkAge(1920);
        checkAge(1800);

        System.out.println("\n--------TASK-5------\n");

        System.out.println(averageOfEdges(0, 0, 0));
        System.out.println(averageOfEdges(0, 0, 6));
        System.out.println(averageOfEdges(-2, -2, 10));
        System.out.println(averageOfEdges(-3, 15, -3));
        System.out.println(averageOfEdges(10, 13, 20));

        System.out.println("\n--------TASK-6------\n");

        System.out.println(Arrays.toString(noA(new String[]{"java", "hello", "123", "xyz"})));
        System.out.println(Arrays.toString(noA(new String[]{"appium", "123", "ABC", "java"})));
        System.out.println(Arrays.toString(noA(new String[]{"apple", "appium", "ABC", "Alex", "A"})));

        System.out.println("\n--------TASK-7------\n");

        System.out.println(Arrays.toString(no3or5(new int[]{7, 4, 11, 23, 17})));
        System.out.println(Arrays.toString(no3or5(new int[]{3, 4, 5, 6})));
        System.out.println(Arrays.toString(no3or5(new int[]{10, 11, 12, 13, 14, 15})));

        System.out.println("\n--------TASK-8------\n");

        System.out.println(countPrimes(new int[]{-10, -3, 0, 1}));
        System.out.println(countPrimes(new int[]{7, 4, 11, 23, 17}));
        System.out.println(countPrimes(new int[]{41, 53, 19, 47, 67}));
    }
}
