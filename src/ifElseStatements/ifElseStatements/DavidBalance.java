package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class DavidBalance {
    public static void main(String[] args) {
        /*

        Write a program that asks David what his balance. If David's balance is greater
        than or equal to $600.0, then print message "Awesome! You have enough money!".
        If David's balance is less than $600.0, then print message "Sorry!  You are poor!".

        EXAMPLE PROGRAM 1
        Program: Hey David! Please enter your balance?
        User: 600.0

        Program: Awesome! You have enough money!

        EXAMPLE PROGRAM 2
        Program: Hey David! Please enter your balance?
        User: 59

        Program: Sorry! You are poor!
        PSEUDO CODE
        1.create a Scanner object
        2.Ask user the balance
        3.Store data in double
        4.If statement with proper action
        5.else statement with proper action


         */

        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance ? ");
        double balance = input.nextDouble();

        if ( balance >= 600){
            System.out.println("Awesome! You have enough money!");
        }
        else{
            System.out.println("Sorry!  You are pure!");
        }
    }
}
