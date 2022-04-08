package arrays;

import utilities.MathHelper;

import java.util.Arrays;

public class _03_PracticeIntArray {
    public static void main(String[] args) {
        System.out.println("\n------TASK-1------\n");
        /*
        Create an int array and store below data

        -3
        -7
        0
        2
        0
        7
        7
        10
        2
        15

        Print the array with message "Array not sorted = "
        Print the sorted array with message "Array sorted = "
         */
        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        System.out.println("Array not sorted = " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers));

        System.out.println("\n------TASK-2------\n");
        /*
        count how many positive - negative and zero numbers you have

        EXPECTED:
        Positives = 6
        Negatives = 2
        Zeros = 2
         */
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int number :numbers){
            if (number > 0) countPositive ++;
            else if (number < 0) countNegative ++;
            else countZero ++;
        }
        System.out.println("Positives = " + countPositive);
        System.out.println("Negatives = " + countNegative);
        System.out.println("Zeros = " + countZero);

        System.out.println("\n------TASK-3------\n");
        /*
        Count how many even and odds

        EXPECTED:
        Evens = 5
        Odds = 5
         */
        int even = 0;
        int odd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) even ++;
            else odd ++;
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);



    }
}
