package mathClass;

import java.util.Scanner;

public class ExercisesMaxAndMin {
    public static void main(String[] args) {
        /*
        Find the min and max of given 3 numbers, write
        down the Pseudo code and print min and max with
        proper messages.


        NOTE: Declare and Assign all of them in one single line
        x = 4, y = 67, z = -54
        PSEUDO CODE
        1.Declare and assign x, y, z
        2.Find the max value x, y, and z by max() method
        3.Find the min value of x, y and z by min() method
        4.Print the result of max and min value

         */

        int x = 4, y = 67, z = -54;

        System.out.println("Max of x, y, z = " + Math.max(Math.max(x, y), z));
        System.out.println("Min of x, y, z = " + Math.min(Math.min(x, y), z));

        /*
        write a program which is going to print the max of given numbers
        4,56,23
         */
        System.out.println("The max of given numbers is = " + Math.max(Math.max(4, 56), 23));

        /*
        write a program asks user to enter 4 numbers
        print the max of retrieved 4 numbers
         */

        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int number1 = input.nextInt();

        System.out.println("enter second number");
        int number2 = input.nextInt();

        System.out.println("enter third number");
        int number3 = input.nextInt();

        System.out.println("enter fourth number");
        int number4 = input.nextInt();

        System.out.println("Max = " + Math.max(Math.max(Math.max(number1, number2), number3), number4));
        System.out.println("Min = " + Math.min(Math.min(Math.min(number1, number2), number3), number4));



    }
}
