package ifElseStatements.ifStatements;

import java.util.Scanner;

public class EvenNumberExercise {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a number.
        If the number entered is even, then print message “The number you entered is even!”

        EXAMPLE PROGRAM 1
        Program: Please enter a number?
        User: 6

        Program: The number you entered is even!

        EXAMPLE PROGRAM 2
        Program: Please enter a number?
        User: 13

        Program:

        PSEUDO CODE
        1.Create a scanner object
        2.Ask user to enter a number
        3.Store the number in an int container
        4.if statement with proper action

         */
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a number ");
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("The number you entered is even!");
        }
    }
}
