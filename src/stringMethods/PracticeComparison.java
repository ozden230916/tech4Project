package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeComparison {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 strings
        And store answers of user in different String variables
        Finally, check if given 2 Strings are equal or not and print messages given below

        Test data 1:
        Java
        java

        Expected output 1:
        These strings are not equal

        Test data 2:
        Hello
        Hello

        Expected output 2:
        These strings are equal
         */
        //1st way
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 string");
        String s1 = input.nextLine(), s2 = input.nextLine();

        if (s1.equals(s2)) System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");

        //2nd way
        System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ?
                "These strings are equal" : "These strings are not equal");


    }
}
