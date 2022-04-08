package stringMethods;

import utilities.ScannerHelper;

public class PracticeSubstring {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a sentence (multiple words)
        Find and print the first and the last words from the given sentence with below messages

        Test data1:
        I like Java

        Expected output:
        The first word is = I
        The last word is = Java

        Test data2:
        Today is Sunday

        Expected output:
        The first word is = Today
        The last word is = Sunday
         */
        String sentence = ScannerHelper.getAStringFromUser();
        System.out.println("The first word = " + sentence.substring(0,sentence.indexOf(" ")));
        System.out.println("The last word = " + sentence.substring(sentence.lastIndexOf(' ') + 1));

    }
}
