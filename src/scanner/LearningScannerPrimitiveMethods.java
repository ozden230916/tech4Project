package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args){
        /*
        how to use Scanner methods
        1.Create an object of scanner class
        ClassName/DataType variableName/objectName = new ClassName/DataType(if it is needed)
        2.variableName/objectName.methodName(if it is needed parameter);
         */

        /*
        TASK-1
        1.Ask user to enter their age
        2.Print the question
        3.Use the proper next method
        4.Print out the user's age
         */
        Scanner collect = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int userAge = collect.nextInt();
        System.out.println("The user's age is = " + userAge);

        /*
        TASK-2
        Ask for the account balance of the user
        Get the account balance and store it
        Print it out
         */
        System.out.println("Please enter your account balance");
        double userBalance = collect.nextDouble();
        System.out.println("User account balance = $" + userBalance);

        /*
        TASk-3
        Ask for user to are you understanding this java class today?
        Get the answer and store it
        Print the answer
         */

        System.out.println("Are you understanding java class today");
        boolean understandingJavaClassToday = collect.nextBoolean();
        System.out.println("User is understanding java class today = " + understandingJavaClassToday);


    }
}
