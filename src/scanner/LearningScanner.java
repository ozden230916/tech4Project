package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args){
        /*
        PSEUDO CODE
        1.I am going to use Scanner class for creating my object
        2.I will use the object for reading the data

         */
        Scanner input = new Scanner(System.in);//creating an input object for using the methods
        System.out.println("Please put your first name : ");//this is what I want user to put
        String firstName = input.next();//storing the first name from user

        System.out.println("Please enter your last name:");
        String lastName = input.next();

        System.out.println("User first name = " + firstName);//Printing my object/variable
        System.out.println("User last name = " + lastName);

    }
}
