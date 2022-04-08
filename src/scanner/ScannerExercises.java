package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args){

        System.out.println("------TASK-1------");

        /*
        Write a Java program that reads firstName and lastName from user and
        print those as full name in 1 statement

        PSEUDO CODE
        1.Create an object of scanner to use methods
        2.Ask user to enter name
        3.Store the name by next method in a proper container for reading
        4.Ask user to enter  last name
        5.Store the last name by next method in a proper container for reading
        6.Print user's full name as name + lastName
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = input.next();

        System.out.println("Please enter your last name :");
        String userLastName = input.next();

        System.out.println("User's full name is = " + userName + " " + userLastName);
        input.nextLine();
        System.out.println("------TASK-2------");
        /*
        Write a Java program that reads the full address from user and print the address
        PSEUDO CODE
        1.Create an object of scanner to use methods
        2.Ask user to enter their address
        3.Store the address by nextLine() method in a proper container for reading
        .Print the address
         */

        System.out.println("Please enter your address");
        String address = input.nextLine();
        System.out.println("User's address is = " + address);

        System.out.println("------TASK-3------");

        /*
        Write a Java program that asks user to enter 3 numbers and print the sum of those 3 numbers
        PSEUDO CODE
        1.Create an object of scanner
        2.Ask user to enter first number
        3.Get the first number by nextInt() method in a proper container for reading
        4.Ask user to enter second number
        5.Get the second number by nextInt() method in a proper container for reading
        6.Ask user to enter third  number
        7.Get the third number by nextInt() method in a proper container for reading
        8.Print the sum of three numbers given by user

         */

        System.out.println("Please enter first number : ");
        int number1 = input.nextInt();
        System.out.println("First number is = " + number1);

        System.out.println("Please enter second number : ");
        int number2 = input.nextInt();
        System.out.println("Second number is = " + number2);

        System.out.println("Please enter third number : ");
        int number3 = input.nextInt();
        System.out.println("Third number is = " + number3);

        System.out.println("Sum of numbers = " + (number1 + number2 + number3));


    }
}
