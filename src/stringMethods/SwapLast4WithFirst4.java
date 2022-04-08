package stringMethods;

import utilities.ScannerHelper;

public class SwapLast4WithFirst4 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a String, and swaps first and last 4 characters of this String and print the modified String

        Test data:
        TechGlobal

        Expected output:
        obalGlTech

        NOTE: Write a program that handles any String
        NOTE: First check if the length of String is at least 8, if the String’s length is less than 8, then print message “This String does not have 8 characters”

         */
        String str = ScannerHelper.getAStringFromUser();

        if (str.length() >= 8)System.out.println(str.substring(str.length() - 4) + str.substring(4, str.length()-4) + str.substring(0,4));
        else System.out.println("This String does not have 8 characters");
    }
}
