package homework;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        for (int i = 1; i < 11; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\n--------TASK-2--------\n");

        boolean isNegativeFound = false;
        boolean isPositiveFound = false;


        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        for (int number : numbers) {
            if (!isNegativeFound && number < 0) {
                isNegativeFound = true;
                System.out.println("First negative number is = " + number);
            }
            else if (!isPositiveFound && number > 0) {
                isPositiveFound = true;
                System.out.println("First positive number is = " + number);
            }
            if (isNegativeFound && isPositiveFound) break;
        }
        if (!isNegativeFound) System.out.println("There is no negative number in the array");
        if (!isPositiveFound) System.out.println("There is no positive number in the array");

        System.out.println("\n--------TASK-3--------\n");

        int r1 = (int) (Math.random() * 10 + 1);
        int r2 = (int) (Math.random() * 10 + 1);
        int r3 = (int) (Math.random() * 10 + 1);
        int r4 = (int) (Math.random() * 10 + 1);
        int r5 = (int) (Math.random() * 10 + 1);

        int[] randoms = {r1, r2, r3, r4, r5};
        System.out.println(Arrays.toString(randoms));
        Arrays.sort(randoms);

        System.out.println(Arrays.binarySearch(randoms, 2) >= 0 || Arrays.binarySearch(randoms, 3) >= 0);

        System.out.println("\n--------TASK-4--------\n");

        String[] lists = {"pineapple", "banana", "orange", "grapes"};
        ;
        boolean containsApple = false;
        for (String list : lists) {
            if (list.equalsIgnoreCase("apple")) containsApple = true;
        }
        System.out.println(containsApple);

        System.out.println("\n--------TASK-5--------\n");

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean hasMatchingElement = false;

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    System.out.println(numbers1[i]);
                    hasMatchingElement = true;
                }
            }
        }
        if (!hasMatchingElement) System.out.println("There is no matching elements");

        System.out.println("\n--------TASK-6--------\n");

        boolean hasDuplicated = false;
        String str = "baNana";
        String duplicate = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length    ; j++) {
                if (!duplicate.toLowerCase().contains((chars[i] + "").toLowerCase()) &&
                        (chars[i] + "").equalsIgnoreCase(chars[j] + "")) {
                    duplicate += chars[i];
                    System.out.println(chars[i]);
                    hasDuplicated = true;
                }
            }
        }
        if (!hasDuplicated) System.out.println("There is no duplicated character");

                }
            }







