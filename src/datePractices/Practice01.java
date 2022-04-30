package datePractices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their date of year
        Then calculate their age and print with the message below

        EXPECTED OUTPUT:
        You are {age} years old!

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your date of year");
        int dateOfYear = scan.nextInt();


        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(currentDate));

        System.out.println("You are " + (currentYear - dateOfYear) + " years old!");
    }
}
