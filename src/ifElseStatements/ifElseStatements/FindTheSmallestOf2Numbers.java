package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class FindTheSmallestOf2Numbers {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter 2 numbers
        Find the smallest and print it

        EXAMPLE PROGRAM:
        Program: Please enter 2 numbers
        User: 5 7

        Program: 5
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int number1 = input.nextInt(), number2 = input.nextInt();

        //1st way by using Math.min() method
        // int smallest = Math.min(number1, number 2;
        /*
        Second way-if else statement
        if (number1 < number2) System.out.println("The smallest of the " + number1 + " and " + number2 + " is = " + number1);
        else System.out.println("The smallest of the " + number1 + " and " + number2 + " is = " + number2);
        */

        //3rd way=Ternary Operator
        int smallest = number1 < number2 ? number1 : number2;
        System.out.println("The smallest of 2 number is = " + smallest);

        System.out.println("End of the program !");
    }
}
