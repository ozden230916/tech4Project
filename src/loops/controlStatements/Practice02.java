package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        between 0 to 10 ( 0 and 10 are included)
        Print all the numbers between given 2 integers starting
        from smallest to biggest (given numbers are included)
        HOWEVER, do not print the number of 5
        1.Ask user to enter 2 different numbers between 0 and 10
        2.Get the numbers and store them in int variable
        3.Use fori loop to print all the numbers between given 2 numbers
        start point = Math.min(n1, n2)
        end point = Math.max(n1, n2)
        change = increment
        4.Do not print if the number = 5
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int n1 = input.nextInt();

        System.out.println("Please enter a number");
        int n2 = input.nextInt();

        int start = Math.min(n1, n2);
        int end = Math.max(n1, n2);
        //First way- without continue
        for (int i = start; i <= end ; i++) {
            if (i != 5) System.out.println(i);

        }
        //Second way using continue
        for (int i = start; i <= end ; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }


    }
}
