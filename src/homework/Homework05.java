package homework;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        int firstNumber = input.nextInt();

        System.out.println("Please enter second number : ");
        int secondNumber = input.nextInt();

        System.out.println("Please enter third number : ");
        int thirdNumber = input.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(firstNumber, secondNumber), thirdNumber));
        System.out.println("Min value = " + Math.min(Math.min(firstNumber, secondNumber), thirdNumber));

        System.out.println("\n--------TASK-2--------\n");

        System.out.println("Please enter first number : ");
        int n1 = input.nextInt();

        System.out.println("Please enter second number : ");
        int n2 = input.nextInt();

        System.out.println("Please enter third number : ");
        int n3 = input.nextInt();

        System.out.println("Please enter fourth number : ");
        int n4 = input.nextInt();

        System.out.println("Please enter fifth number : ");
        int n5 = input.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(Math.max(Math.max(n1 , n2), n3), n4),  n5));
        System.out.println("Min value = " + Math.min(Math.min(Math.min(Math.min(n1 , n2), n3), n4),  n5));

        System.out.println("\n--------TASK-3--------\n");

        System.out.println("Please enter first number : ");
        int num1 = input.nextInt();

        System.out.println("Please enter second number : ");
        int num2 = input.nextInt();

        System.out.println("The difference between numbers is = " + (Math.abs(num1-num2)));

        System.out.println("\n--------TASK-4--------\n");

        int random1 = (int)(Math.random()*51) + 50;
        int random2 = (int)(Math.random()*51) + 50;
        int random3 = (int)(Math.random()*51) + 50;

        System.out.println("Number 1 = " + random1 +
                "\nNumber 2 = " + random2 +
                "\nNumber 3 = " + random3 +
                "\nThe sum of numbers is = " + (random1 + random2 + random3));

        System.out.println("\n--------TASK-5--------\n");

        double alexMoney = 125;
        double mikeMoney = 220;
        double givenMoney = 25.5;

        System.out.println("Alex's money : $" + (alexMoney -= givenMoney));
        System.out.println("Mike's money : $" + (mikeMoney += givenMoney));

        System.out.println("\n--------TASK-6--------\n");

        double saveAmount = 390;
        double dailySave = 15.60;

        System.out.println((int)(saveAmount / dailySave));

    }
}
