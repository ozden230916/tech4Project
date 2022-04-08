package casting;

import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args) {
        /*
        write a program asks user for 5 of their grades as string and print out the average
        Input :
        45
        50
        55
        60
        65

        Output:
        55
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your 5 grade ");
        String grade1 = input.next(), grade2 = input.next(), grade3 = input.next(),
                grade4 = input.next(), grade5 = input.next();

        double grade1Int = Double.parseDouble(grade1);
        double grade2Int = Double.parseDouble(grade2);
        double grade3Int = Double.parseDouble(grade3);
        double grade4Int = Double.parseDouble(grade4);
        double grade5int = Double.parseDouble(grade5);

        System.out.println("Average = " +(int)((grade1Int + grade2Int + grade3Int + grade4Int + grade5int)/5));

        /*
        Write a program that asks users their balance as
        a string and asks for 3 transactions as string end
        print out the end result as double.


        Input:
        "What is your balance?"
        user:
        456.7

        "What is your next 3 transactions?
        user:
        34.1
        65.3
        28.4

        Output:
        "Your balance is now = x"
        */
        System.out.println("What is your balance");
        String balance = input.next();
        System.out.println("What is your next 3 transaction ?");
        String firstTransaction = input.next(), secondTransaction = input.next(), thirdTransaction = input.next();

        double balanceD = Double.parseDouble(balance);
        double firstTransactionD = Double.parseDouble(firstTransaction);
        double secondTransactionD = Double.parseDouble(secondTransaction);
        double thirdTransactionD = Double.parseDouble(thirdTransaction);

        System.out.println("Your balance is now = " + (balanceD - firstTransactionD - secondTransactionD -thirdTransactionD));

        /*
Write a program ASK user for full name, age, phone number then
enter their 3 kids age as string then print out everything plus
the oldest kid, youngest and the age difference between oldest
and youngest.

Program: "Please enter your name"
User: John Doe
Program: "Please enter your age:
User: 45
Program: "Please enter your phone number:
User: (123) 123 1234
Program: "Enter the ages of your kids"
User:
12
22
17
Program:
Your name is John Doe, your phone number is (123) 123 1234,
You are 45 years old, Your oldest kid is 22 years old, your
youngest is 12, difference between oldest and youngest is 10
years.

 */

        System.out.println("What is your full name ? ");
        input.nextLine();
        String fullName = input.nextLine();

        System.out.println("What is your age");
        String age = input.next();

        System.out.println("What is your phone number ?");
        input.nextLine();
        String phoneNumber = input.nextLine();

        System.out.println("Enter your kids age");
        String age1 = input.next(), age2 = input.next(), age3 = input.next();

        int ageI = Integer.parseInt(age);
        int age1I = Integer.parseInt(age1);
        int age2I = Integer.parseInt(age2);
        int age3I = Integer.parseInt(age3);

        System.out.println("Your name is " + fullName + ", your phone number is " + phoneNumber +
                "\nYou are " + ageI + " years old, Your oldest kid is " + (Math.max(Math.max(age1I, age2I), age3I)) +
                " years old, your \nyoungest is " + (Math.min(Math.min(age1I, age2I), age3I)) + ", difference between oldest and youngest is " +
                (Math.abs(Math.max(Math.max(age1I, age2I), age3I) - Math.min(Math.min(age1I, age2I), age3I))) + " years");




    }
}
