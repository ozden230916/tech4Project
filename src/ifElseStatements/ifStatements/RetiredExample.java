package ifElseStatements.ifStatements;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter their age
        And print "It is your time to get retired!" if their age is more than or equal to 55
        NOTE: Write PSEUDO CODE first

        EXAMPLE PROGRAM 1
        Program: Please enter your age?
        User: 60

        Program: It is your time to get retired!

        EXAMPLE PROGRAM 1
        Program: Please enter your age?
        User: 45

        Program:

        PSEUDO Code
        1.create a scanner object
        2.Ask user's age
        3.Store the age in ant int variable
        4.use if statement and proper action in curly braces

         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age ? ");
        int age = input.nextInt();

        if (age >= 55){
            System.out.println("It is your time to get retired!");
        }
    }
}
