package loops.forLoop;

import utilities.ScannerHelper;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
        /*
        Write a Java program to ask user to enter a number and print all the odd numbers starting from 0 to given number by user (0 and given number is included)

        Test data:
        15

        Expected output:
        1
        3
        5
        .
        .
        .
        13
        15
         */
        int number = ScannerHelper.getNumberFromUser();
        for (int i = 0; i <= number; i++){
            if (i % 2 != 0) System.out.println(i);
        }
    }
}
