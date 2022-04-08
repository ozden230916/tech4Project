package homework;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------");

        String s = "";
        for (int i = 1; i <= 100 ; i++) {
            if (i % 7 == 0) s += i + " - ";
        }
        System.out.println(s.substring(0, s.length()- 3));

        System.out.println("\n--------TASK-2--------");

        String s1 = "";
        for (int i = 1; i <= 50 ; i++) {
            if (i % 6 == 0) s1 += i + " - ";
        }
        System.out.println(s1.substring(0, s1.length()- 3));

        System.out.println("\n--------TASK-3--------");

        String s2 = "";
        for (int i = 100; i >= 50 ; i--) {
            if (i % 5 == 0) s2 += i + " - ";
        }
        System.out.println(s2.substring(0, s2.length()- 3));

        System.out.println("\n--------TASK-4--------");

        for (int i = 0; i <= 7 ; i++) {
            System.out.println("The square of " + i + " is = " + (i * i));
        }

        System.out.println("\n--------TASK-5--------");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n--------TASK-6--------");

        int number = ScannerHelper.getNumberFromUser();// Please enter a positive number
        int factorial = 1;
        for (int i = 1; i <= number; i ++){
            factorial *= i;
        }

        System.out.println(factorial);

        System.out.println("\n--------TASK-7--------");

        String fullName = ScannerHelper.getAStringFromUser();
        int countVowel = 0;

        for (int i = 0; i < fullName.length(); i++) {
            if (CharacterHelper.isVowel(fullName.charAt(i))) countVowel ++;
        }
        System.out.println("There are " + countVowel + " vowel letters in this full name");

        System.out.println("\n--------TASK-8--------");

        Scanner input = new Scanner(System.in);
        int run = 1;
        int sumOfNumbers = 0;

        do {
            System.out.println("Please enter a number");
            int n = input.nextInt();
            sumOfNumbers += n;
            if ( run == 1 && n >= 100) System.out.println("This number is already more than 100");
            else run ++;
        }while (sumOfNumbers < 100);
            if (run > 1 ) System.out.println("Sum of the entered numbers is at least 100");

        System.out.println("\n--------TASK-9--------");

        int num = ScannerHelper.getNumberFromUser();
        int firstNumber = 0;
        int secondNumber = 1;
        String fibonacci = "0 - 1 - ";
        for (int i = 2; i <= num - 1 ; i ++){
            int sumOfFirstNumberAndSecondNumber = firstNumber + secondNumber;
            fibonacci +=sumOfFirstNumberAndSecondNumber  + " - ";
            firstNumber = secondNumber;
            secondNumber = sumOfFirstNumberAndSecondNumber;
        }
        System.out.println(fibonacci.substring(0,fibonacci.length() - 3));

        System.out.println("\n--------TASK-10--------");

        String name;

        do {
            System.out.println("Please enter a name");
             name = ScannerHelper.getANameFromUser();
        } while (!name.toLowerCase().startsWith("j"));
        System.out.println("End of the program");
    }
}
