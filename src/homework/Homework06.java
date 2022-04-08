package homework;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        String s1 = "5", s2 = "10";

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println("Sum of " + n1 + " and " + n2 + " is = " + (n1 + n2)+
                "\nProduct of " + n1 + " and " + n2 + " is = " + (n1 * n2) +
                "\nDivision of " + n1 + " and " + n2 + " is = " + (n1 / n2) +
                "\nSubtraction of " + n1 + " and " + n2 + " is = " + (n1 - n2) +
                "\nRemainder of " + n1 + " and " + n2 + " is = " + (n1 % n2));

        System.out.println("\n--------TASK-2--------\n");

        String s3 = "200", s4 = "-50";

        int n3 = Integer.parseInt(s3);
        int n4 = Integer.parseInt(s4);

        System.out.println("The greatest value is = " + Math.max(n3, n4) +
                "\nThe smallest value is = " + Math.min(n3, n4) +
                "\nThe average is = " + (n3 + n4)/2 +
                "\nThe absolute difference is = " + Math.abs(n3 - n4));

        System.out.println("\n--------TASK-3--------\n");

        double dailySave = 3*0.25 + 0.1 + 2*0.05 + 0.01;

        int daysFor24 = (int)(24 / dailySave);
        System.out.println(daysFor24 + " days");

        int daysFor168 = (int)(168 / dailySave);
        System.out.println(daysFor168 + " days");

        double saveAfter5Months = 5 * 30 * dailySave;
        System.out.println("$" + saveAfter5Months);

        System.out.println("\n--------TASK-4--------\n");

        double needAmount = 1250;
        double savePerDay = 62.5;

        System.out.println((int)(needAmount / savePerDay));

        System.out.println("\n--------TASK-5--------\n");

        double priceOfCar = 14265;
        double option1Payment = 475.50;
        double option2Payment = 951;

        System.out.println("Option 1 will take " + (int)(priceOfCar / option1Payment) + " months" +
                "\nOption 2 will take " + (int)(priceOfCar / option2Payment) + " months");

        System.out.println("\n--------TASK-6--------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = input.nextInt();

        System.out.println("Enter second number");
        int number2 = input.nextInt();

        double division = (double) number1 / number2;
        System.out.println(division);

        


    }
}
