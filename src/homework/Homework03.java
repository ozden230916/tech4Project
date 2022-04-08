package homework;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        System.out.println("\n---------TASK-1--------");
        /*
        PSEUDO CODE
        1.Ask user to enter 2  numbers by scanner class
        2.Store the data in int variables and print the data
        3.Print the sum of these numbers
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = input.nextInt();

        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        System.out.println("The number 1 entered by user is = " + number1);
        System.out.println("The number 2 entered by user is = " + number2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (number1 + number2));

        System.out.println("\n---------TASK-2--------");
        /*
        PSEUDO CODE
        1.Ask user to enter 2 floating numbers by scanner class
        2.Store the data in double variables and print the data
        3.Print the division of these numbers
         */

        System.out.println("Enter first floating number: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter second floating number: ");
        double secondNumber = input.nextDouble();

        System.out.println("The number 1 entered by user is = " + firstNumber);
        System.out.println("The number 2 entered by user is = " + secondNumber);
        System.out.println("The division of number 1 and 2 entered by user is = " + (firstNumber / secondNumber));

        System.out.println("\n---------TASK-3--------");
        /*
        PSEUDO CODE
        1.Print the result of the following operatos
         */

        System.out.println(-10 + 7 * 5);
        System.out.println((72 + 24) % 24);
        System.out.println(10 + -3 * 9 / 9);
        System.out.println(5 + 18 / 3 * 3 - (6 % 3));

        System.out.println("\n---------TASK-4--------");
        /*
        PSEUDO CODE
        1.Ask user to enter 2 floating numbers by scanner class
        2.Store the data in double variables and print the data
        3.Print the result of sum, product, subtraction, division and remainder of these numbers
         */

        System.out.println("Enter first floating number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter second floating number: ");
        double num2 = input.nextDouble();

        System.out.println("The first number entered by user is = " + num1);
        System.out.println("The second number entered by user is = " + num2);
        System.out.println("The sum of the given numbers is = " +(num1 + num2));
        System.out.println("The product of the given numbers is = " + (num1 * num2));
        System.out.println("The subtraction of the given numbers is = " + (num1 - num2));
        System.out.println("The division of the given numbers is = " + (num1 / num2));
        System.out.println("The remainder of the given numbers is = " + (num1 % num2));

        System.out.println("\n---------TASK-5--------");
        /*
        PSEUDO CODE
        1.Store width and height of rectangle byproper data type
        2.Print the area of rectangle
        3.Print the perimeter of rectangle
         */

        double widthOfRectangle = 7.5;
        double heightOfRectangle = 10.5;

        double areaOfRectangle = widthOfRectangle * heightOfRectangle;
        double perimeterOfRectangle = 2 * (widthOfRectangle + heightOfRectangle);

        System.out.println("The area of the rectangle = " + areaOfRectangle);
        System.out.println("The perimeter of the rectangle = " + perimeterOfRectangle);

        System.out.println("\n---------TASK-6--------");
        /*
        PSEUDO CODE
        1.Store annual salary by proper data type
        2.Print the salary for 3 years later
         */

        double annualSalary = 90_000;
        System.out.println("A Software Engineer in Test can earn " + (annualSalary *= 3) + " in 3 years.");

    }
}
