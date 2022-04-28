package arrays;

import java.util.Arrays;

public class _04_PracticePartialArrays {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------");
        /*
        TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */
        int[] numbers = {10,-3, -7, 0, 0, 7, 22};
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("\n--------TASK-2--------");

         /*
        Find sum of all elements in the array

        Expected Result = 29
         */

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        System.out.println("\n--------TASK-3--------");

        /*
        Find sum of first three elements in the array

        Expected Result = 0
         */
        int sumOfFirst3 = 0;
        for (int i = 0; i < 3; i++) {
            sumOfFirst3 += numbers[i];
        }
        System.out.println(sumOfFirst3);

        System.out.println("\n--------TASK-4--------");
        /*
        Find the sum of last 5 elements in the array

        RESULT:
        22
         */
        int sumOfLast5 = 0;
        for (int i = numbers.length - 5; i < numbers.length ; i++) {
            sumOfLast5 += numbers[i];
        }
        System.out.println(sumOfLast5);

        System.out.println("\n--------TASK-5--------");
        /*

        Find the product of last 4 elements in the array but exclude zero if there are any
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        154
         */
        int productOfLast4 = 1;
        for (int i = numbers.length - 4; i < numbers.length ; i++) {
            if (numbers[i] != 0) productOfLast4 *= numbers[i];
        }
        System.out.println(productOfLast4);

        System.out.println("\n--------TASK-6--------");
        boolean hasZero = false;
        for (int number : numbers) {
            if (number == 0)  {
                hasZero= true;
                break;
            }
        }
        System.out.println(hasZero);

        System.out.println("\n--------TASK-6-secondway--------");
        Arrays.sort(numbers);
        if (Arrays.binarySearch(numbers, 0) > 0) hasZero = true;
        System.out.println(hasZero);
    }
}
