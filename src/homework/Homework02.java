package homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args){
        System.out.println("\n--------TASK-1---------\n");
        /*
        PSEUDO CODE
        1.Create a Scanner object
        2.Ask user to enter required information
        3.Get the data entered by user by proper method
        4.Print all the data
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name : ");
        String firstName = input.next();

        System.out.println("Please enter your last name : ");
        String lastName = input.next();

        System.out.println("Please enter your age : ");
        int age = input.nextInt();

        System.out.println("Please enter your email address : ");
        String emailAddress = input.next();
        input.nextLine();

        System.out.println("Please enter your phone number : ");
        String phoneNumber = input.nextLine();

        System.out.println("Please enter your address : ");
        String address = input.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName +  ". " + firstName + "'s age is "+
                age + ". " + firstName + "'s email \naddress is " + emailAddress +", phone number " +
                phoneNumber + ", and address is \n" + address + ".");

        System.out.println("\n--------TASK-2---------\n");
        /*
        PSEUDO CODE
        1.Create a Scanner object
        2.Ask user to enter required information
        3.Get the data entered by user by proper method
        4.Print all the data
         */

        System.out.println("What is your favorite book ?");
        String favBook = input.nextLine();

        System.out.println("What is your favorite color ?");
        String favColor = input.nextLine();

        System.out.println("What is your favorite number ?");
        int favNumber = input.nextInt();

        System.out.println("User's favorite book is : " + favBook +
                "\nUser's favorite color is : " + favColor +
                "\nUser's favorite number is : " + favNumber);

    }
}
