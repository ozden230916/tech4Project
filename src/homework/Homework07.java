package homework;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        int number1 = (int)(Math.random() * 11);
        int number2 = (int)(Math.random() * 11);
        int number3 = (int)(Math.random() * 11);
        int number4 = (int)(Math.random() * 11);

        System.out.println("Number 1 = " + number1 + "\nNumber 2 = " + number2 + "\nNumber 3 = " + number3 + "\nNumber 4 = " + number4 +
                "\nAbsolute difference of " + number1 + " with " + number2 + " is = " + Math.abs(number1 - number2) +
                "\nAbsolute difference of " + number2 + " with " + number2 + " is = " + Math.abs(number2 - number2) +
                "\nAbsolute difference of " + number3 + " with " + number2 + " is = " + Math.abs(number3 - number2) +
                "\nAbsolute difference of " + number4 + " with " + number2 + " is = " + Math.abs(number4 - number2) +
                "\nGreatest number is = " + Math.max(Math.max(Math.max(number1, number2), number3), number4) +
                "\nSmallest number is = " + Math.min(Math.min(Math.min(number1, number2), number3), number4));

        System.out.println("\n--------TASK-2--------\n");

        int n1 = (int)(Math.random() * 101 - 50);
        int n2 = (int)(Math.random() * 101 - 50);
        int n3 = (int)(Math.random() * 101 - 50);
        int n4 = (int)(Math.random() * 101 - 50);
        int n5 = (int)(Math.random() * 101 - 50);
        int n6 = (int)(Math.random() * 101 - 50);
        int n7 = (int)(Math.random() * 101 - 50);
        int n8 = (int)(Math.random() * 101 - 50);
        int greatest = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5), n6), n7), n8);
        int smallest = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(n1, n2), n3), n4), n5), n6), n7), n8);

        System.out.println("Number 1 = " + n1 + "\nNumber 2 = " + n2 + "\nNumber 3 = " + n3 + "\nNumber 4 = " + n4 +
                "\nNumber 5 = " + n5 + "\nNumber 6 = " + n6 + "\nNumber 7 = " + n7 + "\nNumber 8 = " + n8 +
                "\nGreatest number is = " + greatest +
                "\nSmallest number is = " + smallest +
                "\nAverage of 8 numbers is = " + ((n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8) / 8) +
                "\nAbsolute difference between smallest and greatest is = " + Math.abs(greatest- smallest));

        /*if (n3 > 0) {
            System.out.println("3rd number is positive = " + true);
        }
        else {
            System.out.println("3rd number is positive = " + false);
        }
         if (n5 < 0){
            System.out.println("5th number is negative = " + true);
        }
        else{
            System.out.println("5th number is negative = " + false);
        }
         if (n1 == 0 || n2 == 0 ||  n3 == 0 ||  n4 == 0 ||  n5 == 0 ||  n6 == 0 ||  n7 == 0 ||  n8 == 0){
            System.out.println("There is at least one zero among those numbers is = " + true);
        }
        else {
            System.out.println("There is at least one zero among those numbers is = " + false);
        }
        */
        System.out.println("3rd number is positive = " + (n3 > 0));
        System.out.println("5th number is negative = " + (n5 < 0));
        System.out.println("There is at least one zero among those numbers is = " + (n1 == 0 || n2 == 0 ||  n3 == 0 ||  n4 == 0 ||  n5 == 0 ||
                n6 == 0 ||  n7 == 0 ||  n8 == 0));

        System.out.println("\n--------TASK-3--------\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 7 number ");
        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt(), num4 = input.nextInt(),
                num5 = input.nextInt(), num6 = input.nextInt(), num7 = input.nextInt();
        int max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5), num6), num7);
        int min = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5), num6), num7);

        System.out.println("Number 1 = " + num1 + "\nNumber 2 = " + num2 + "\nNumber 3 = " + num3 + "\nNumber 4 = " + num4 +
                "\nNumber 5 = " + num5 + "\nNumber 6 = " + num6 + "\nNumber 7 = " + num7 +
                "\nGreatest number is = " + max +
                "\nSmallest number is = " + min +
                "\nAverage of 7 numbers is = " + ((num1 + num2 + num3 + num4 + num5 + num6 + num7) / 7));

        /*
        if (num1 >= 10) System.out.println("First number is greater than or equal to 10 = " + true);
        else System.out.println("First number is greater than or equal to 10 = " + false);

        if (num7 <= 40) System.out.println("Last number is less than or equal to 40 = " + true);
        else System.out.println("Last number is less than or equal to 40 = " + false);

        if (num1 >= 25 && num7 >= 25) System.out.println("Both first and last numbers are greater than 25 = " + true);
        else System.out.println("Both first and last numbers are greater than 25 = " + false);

        if ((num1 == 0 || num1 == 50) || (num2 == 0 || num2 == 50) || (num3 == 0 || num3 == 50) ||
                (num4 == 0 || num4 == 50) || (num5 == 0 || num5 == 50) || (num6 == 0 || num6 == 50) ||
                (num7 == 0 || num7 == 50))System.out.println("At least one of those numbers is 0 or 50  = " + true);
        else System.out.println("At least one of those numbers is 0 or 50  = " + false);

        if ((num1 >= 40 && num1 <= 50) || (num2 >= 40 && num2 <= 50) || (num3 >= 40 && num3 <= 50) ||
                (num4 >= 40 && num4 <= 50) || (num5 >= 40 && num5 <= 50) || (num6 >= 40 && num6 <= 50) ||
                (num7 >= 40 && num7 <= 50)) System.out.println("There is no number between 40 and 50 = " + false);
        else System.out.println("There is no number between 40 and 50 = " + true);
        */
        System.out.println("First number is greater than or equal to 10 = " + (num1 >= 10));
        System.out.println("Last number is less than or equal to 40 = " + (num7 <= 40) );
        System.out.println("Both first and last numbers are greater than 25 = " + (num1 >= 25 && num7 >= 25));
        System.out.println("At least one of those numbers is 0 or 50  = " + ((num1 == 0 || num1 == 50) || (num2 == 0 || num2 == 50)
                || (num3 == 0 || num3 == 50) ||(num4 == 0 || num4 == 50) || (num5 == 0 || num5 == 50) || (num6 == 0 || num6 == 50)
                || (num7 == 0 || num7 == 50)));
        System.out.println("There is no number between 40 and 50 = " + !((num1 >= 40 && num1 <= 50) || (num2 >= 40 && num2 <= 50) || (num3 >= 40 && num3 <= 50) ||
                (num4 >= 40 && num4 <= 50) || (num5 >= 40 && num5 <= 50) || (num6 >= 40 && num6 <= 50) ||
                (num7 >= 40 && num7 <= 50)));


        System.out.println("\n--------TASK-4--------\n");

        int random1 = (int) (Math.random() * 101);
        int random2 = (int) (Math.random() * 101);
        int random3 = (int) (Math.random() * 101);

        System.out.println("Number 1 = " + random1 + "\nNumber 2 = " + random2 + "\nNumber 3 = " + random3);

        /*if (random1 > 25 && random2 > 25 && random3 > 25) System.out.println("All numbers are more than 25 is = " + true);
        else System.out.println("All numbers are more than 25 is = " + false);
         */
        System.out.println("All numbers are more than 25 is = " + (random1 > 25 && random2 > 25 && random3 > 25) );

        System.out.println("\n--------TASK-5--------\n");

        System.out.println("Please enter a number between 1 to 7(1 and 7 are included)");
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY ");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("The number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("The number entered returns SUNDAY");
                break;
        }

        System.out.println("\n--------TASK-6--------\n");

        System.out.println("Please enter a number between -10 and 10(-10 and 10 are included");
        int number = input.nextInt();

        if (number > 0) System.out.println("Number entered is POSITIVE");
        else if (number < 0) System.out.println("Number entered is NEGATIVE");
        else System.out.println("Number entered is ZERO");

        if (number % 2 == 0) System.out.println("Number entered is EVEN");
        else System.out.println("Number entered is ODD");

        System.out.println("\n--------TASK-7--------\n");

        System.out.println("Tell me your exam result ? ");
        double exam1 = input.nextDouble(), exam2 = input.nextDouble(), exam3 = input.nextDouble();

        if ((exam1 + exam2 + exam3) / 3 >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED");

        System.out.println("\n--------TASK-8--------\n");

        System.out.println("Enter 3 numbers");
        int enteredNumber1 = input.nextInt(), enteredNumber2 = input.nextInt(), enteredNumber3 = input.nextInt();

        if (enteredNumber1 == enteredNumber2 && enteredNumber1 == enteredNumber3) System.out.println("TRIPLE MATCH");
        else if (enteredNumber1 == enteredNumber2 || enteredNumber1 == enteredNumber3 || enteredNumber2 == enteredNumber3)
            System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");

    }
}
