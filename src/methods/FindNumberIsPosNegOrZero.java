package methods;

import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

class FindNumberIsPosNegOrZero {
    public static void main(String[] args) {
        /*
        Ask user to enter an any number
        -Print "The number is positive" if the user enters a positive number
        -Print "The number is negative" if the user enters a negative number
        -Print "The number is zero" if the user enters zero
         */

        int number = ScannerHelper.getNumberFromUser();

        if (MathHelper.isPositive(number)) System.out.println("The number is positive");
        else if (MathHelper.isNegative(number)) System.out.println("The number is negative");
        else System.out.println("The number is zero");


    }
}


