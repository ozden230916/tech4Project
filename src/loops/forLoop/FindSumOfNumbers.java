package loops.forLoop;

import utilities.ScannerHelper;

public class FindSumOfNumbers {
    public static void main(String[] args) {
        /*
        write a java program to find sum of the numbers from 10 to 15(10 and 15 are included)
         */
        int sum = 0;
        for (int i = 10; i < 16 ; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
