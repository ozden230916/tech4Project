package arrays;

import java.util.Arrays;

public class _06_AdditionalInterviewQuestions {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");
        /*
        int[] numbers = {5, 3, 0, -5};

        Find the greatest and print it

        RESULT:
        {5, 3, 0, -5} -> 5
        {4, 10, 15} -> 15
         */

        System.out.println("----solution 1-----");
        int[] numbers = { 5, 3, 0, -5};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) max = number;
        }
        System.out.println(max);

        System.out.println("----solution 2-----");
        Arrays.sort(numbers);
        max = numbers[numbers.length - 1];
        System.out.println(max);

        System.out.println("\n--------TASK-2--------\n");
        /*
        create a double array and store below elements
        2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25

        Find the min value

        RESULT :
        0.5
         */

        double[] doubles = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
        double min = Double.MAX_VALUE;

        for (double aDouble : doubles) {
            if (aDouble < min) min = aDouble;
        }
        System.out.println(min);

        System.out.println("\n--------TASK-3--------\n");
        /*
        Find the second min
         */
        double secondMin = Double.MAX_VALUE;
        for (double aDouble : doubles) {
            if (aDouble != min && aDouble < secondMin) secondMin = aDouble;

        }
        System.out.println(secondMin);
    }
}
