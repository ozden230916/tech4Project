package homework;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");
        /*
        Assume that you are given a String as below;
        String str = ”SDLC is step by step procedure to create an application”;
        Write a program to find length of given String and the indexes of “SDLC” and “application” words
         */
        String str ="SDLC is step by step procedure to create an application";
        System.out.println("Length of the str is = " + str.length());
        System.out.println("Index of SDLC is = " + str.indexOf("SDLC"));
        System.out.println("Index of application is = " + str.indexOf("application"));

        System.out.println("\n--------TASK-2--------\n");
        /*
        Assume that you are given a String as below;
        String str = “  I know how to code with Python  ”;
        •
        Write a program to manipulate given String and convert it to be:
        “I KNOW HOW TO CODE WITH JAVA”
         */

        String str1 ="  I know how to code with Python  ";
        System.out.println(str1.trim().replace("Python", "Java").toUpperCase());

        System.out.println("\n--------TASK-3--------\n");
        /*
        Assume that you are given a String as below;
        String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
        1.Find the first character of given String which is not white space
        2.Find the last character of given String which is not white space
         */
        String str2 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ";
        System.out.println("The first character is = " + str2.trim().charAt(0));
        System.out.println("The last character is = " + str2.trim().charAt(str2.trim().length()-1));

        System.out.println("\n--------TASK-4--------\n");
        /*
        Assume you are given 3 Strings as below;
        String s1 = “  TECH ”;
        String s2 = “ glo  ”;
        String s3 = “ BAL       “;
        Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
        Note: The length of s4 will be 10 at the end!!!
         */
        String s1 = "  TECH ".trim();
        String s2 = " glo  ".trim();
        String s3 =" BAL       ".trim();

        String s4 = s1.replace("ECH", "ech") + s2.replace('g', 'G') + s3.toLowerCase();
        System.out.println(s4);

        /*
        Second way
        String s5 = (s1 + s2 + s3).toLowerCase().replace('t','T').replace('g', 'G');
        System.out.println(s5);
         */

        System.out.println("\n--------TASK-5--------\n");
        /*
        Write a program that asks user to enter their favorite color.
        Then, print the first and last characters of the color
        Also, print the first and last 3 characters of the color
        Test data:
        green
        Expected output:
        1st character is = g
        2nd character is = n
        First 3 characters are = gre
        Last 3 characters are = een
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your favorite color");
        String color = input.next();

        System.out.println("First character of " + color + " is = " + color.charAt(0));
        System.out.println("Last character of " + color + " is = " + color.charAt(color.length() - 1));
        System.out.println("First 3 character of " + color + " is = " + color.substring(0,3));
        System.out.println("Last 3 character of " + color + " is = " + color.substring(color.length() - 3));

        System.out.println("\n--------TASK-6--------\n");
        /*
        Write a program that asks user to enter a full sentence
        Then, convert all sentence to lower case and print the first and last words in the given sentence
        Test data:
        JavA is an object-oriented programming LanguAGE
        Expected output:
        1st word is = java
        2nd word is = language
         */
        String s = ScannerHelper.getAStringFromUser();
        System.out.println("1st word is = " + s.toLowerCase().substring(0, s.indexOf(' ')));
        System.out.println("Last word is = " + s.toLowerCase().substring(s.lastIndexOf(' ' ) + 1));

        System.out.println("\n--------TASK-7--------\n");
        /*
        Write a program that asks user to enter a full sentence
        Then, check if given sentence contains $ character
        If it contains $ character, then find the index of the $ character and print a proper message for the found index
        Test data 1:
        I saved $100 to buy new airpods
        Expected output 1:
        This sentence contains $ character
        $ character’s index is = 8
        Test data 2:
        I’ll become a Software Engineer in Test
        Expected output 2:
        This sentence does not contain $ character

         */
        String sentence = ScannerHelper.getAStringFromUser();
        if (sentence.contains("$")) System.out.println("This sentence contains $ character " +
                "\n$ character index is = " + sentence.indexOf('$'));
        else System.out.println("This sentence does not contains $ character ");

    }
}
