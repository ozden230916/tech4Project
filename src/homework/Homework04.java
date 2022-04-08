package homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println("\n---------TASK-1--------");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number ");
        int firstNumber = input.nextInt();

        System.out.println("Please enter second number ");
        int secondNumber = input.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println("The average of given 2 numbers is : " + ((firstNumber + secondNumber) / 2));

        System.out.println("\n---------TASK-2--------");

        System.out.println("Please enter first number ");
        int number1 = input.nextInt();

        System.out.println("Please enter second number ");
        int number2 = input.nextInt();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println("The average of given 2 numbers is : " + (number1 * number2));

        System.out.println("\n---------TASK-3--------");

        System.out.println("Please enter first number ");
        int number3 = input.nextInt();

        System.out.println("Please enter second number ");
        int number4 = input.nextInt();

        System.out.println("Please enter third number ");
        int number5 = input.nextInt();

        System.out.println("The " + number3 + " multiplied with " + number3 + " is = " + (number3 * number3) +
                "\nThe " + number4 + " multiplied with " + number4 + " is = " + (number4 * number4) +
                "\nThe " + number5 + " multiplied with " + number5 + " is = " + (number5 * number5));

        System.out.println("\n---------TASK-4--------");

        System.out.println("Please enter first number ");
        int number6 = input.nextInt();

        System.out.println("Please enter second number ");
        int number7 = input.nextInt();

        System.out.println("First number = " + number6);
        System.out.println("Second number = " + number7);
        System.out.println("The remainder of " + number6 + " % " + number7 + " = " + (number6 % number7));

        System.out.println("\n---------TASK-5--------");

        System.out.println("Please enter first number ");
        int n1 = input.nextInt();

        System.out.println("Please enter second number ");
        int n2 = input.nextInt();

        System.out.println("Please enter third number ");
        int n3 = input.nextInt();

        System.out.println("Please enter fourth number ");
        int n4 = input.nextInt();

        System.out.println("Please enter fifth number ");
        int n5 = input.nextInt();

        System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n" + n5 );
        System.out.println("The average of the given 5 numbers is : " + ((n1 + n2 + n3 + n4 + n5) / 5 ));

        System.out.println("\n---------TASK-6--------");

        System.out.println("Please enter a number ");
        int num1 = input.nextInt();
        int i = 1;

        System.out.println(num1 + " * " + (i) + " = " + (num1 * i ++ ) +
                "\n" + num1 + " * " + i + " = " + (num1 * i ++ ) +
                "\n" + num1 + " * " + i + " = " + (num1 * i ++ ) +
                "\n" + num1 + " * " + i + " = " + (num1 * i ++ ) +
                "\n" + num1 + " * " + i + " = " + (num1 * i ++ ) +
                "\n" + num1 + " * " + i + " = " + (num1 * i ++ ) +
                "\n" + num1 + " * " + i + " = " + (num1 * i ++ ) +
                "\n" + num1 + " * " + i + " = " + (num1 * i ++ ) +
                "\n" + num1 + " * " + i + " = " + (num1 * i ++ ) +
                "\n" + num1 + " * " + i + " = " + (num1 * i ++ ));

        System.out.println("\n---------TASK-7--------");

        System.out.println("Please enter the side of square ");
        int side = input.nextInt();

        System.out.println("Perimeter of the square = " + (4 * side));
        System.out.println("Area of the square = " + (side * side));






    }
}
