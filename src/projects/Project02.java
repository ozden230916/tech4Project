package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        int number1 = input.nextInt();

        System.out.println("Please enter second number : ");
        int number2 = input.nextInt();

        System.out.println("Please enter third number : ");
        int number3 = input.nextInt();

        System.out.println("The product of the numbers entered is = " + (number1 * number2 * number3));

        System.out.println("\n--------TASK-2--------\n");

        System.out.println("What is your first name ?");
        String firstName = input.next();

        System.out.println("What is your last name ?");
        String lastName = input.next();

        System.out.println("What is your year of birth ? ");
        int yearOfBirth = input.nextInt();
        int currentYear = 2022;

        System.out.println(firstName + " " + lastName + "'s age is = " + (currentYear- yearOfBirth));

        System.out.println("\n--------TASK-3--------\n");

        System.out.println("What is your full name ? ");
        input.nextLine();
        String fullName = input.nextLine();

        System.out.println("What is your weight as kg ?");
        double weight = input.nextDouble();

        System.out.println(fullName + "'s weight is = " + (weight * 2.205) + " lbs.");

        System.out.println("\n--------TASK-4--------\n");

        System.out.println("What is your full name ? ");
        input.nextLine();
        String student1FullName = input.nextLine();

        System.out.println("What is your age ? ");
        int student1Age = input.nextInt();

        System.out.println("What is your full name ? ");
        input.nextLine();
        String student2FullName = input.nextLine();

        System.out.println("What is your age ? ");
        int student2Age = input.nextInt();

        System.out.println("What is your full name ? ");
        input.nextLine();
        String student3FullName = input.nextLine();

        System.out.println("What is your age ? ");
        int student3Age = input.nextInt();

        System.out.println(student1FullName + "'s age is " + student1Age +
                "\n" + student2FullName + "'s age is " + student2Age +
                "\n" + student3FullName + "'s age is " + student3Age +
                "\nThe average age is " + ((student1Age + student2Age + student3Age) / 3) +
                "\nThe eldest age is " + (Math.max(Math.max(student1Age, student2Age), student3Age)) +
                "\nThe youngest age is " + (Math.min(Math.min(student1Age, student2Age), student3Age)));
    }
}
