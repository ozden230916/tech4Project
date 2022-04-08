package projects;

import utilities.ScannerHelper;
import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("\n-------TASK-1--------\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine().trim();

        int numberOfSpace = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') numberOfSpace ++;
        }
        if (numberOfSpace == 0) System.out.println("This sentence does not have multiple words");
        else System.out.println("This sentence has " + (numberOfSpace + 1) + " words");

        System.out.println("\n-------TASK-2--------\n");

        String word = ScannerHelper.getAStringFromUser();

        String reversedWord = "";

        if (word.length() >= 1) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            if (word.equals(reversedWord)) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");
        }
        else System.out.println("This word does not have 1 or more characters");

        System.out.println("\n-------TASK-3--------\n");

        String s = ScannerHelper.getAStringFromUser().trim();
        int aOrA = 0;
         if (s.length() >= 1){
             for (int i = 0; i < s.length(); i++) {
                 if (s.charAt(i) == 'a' || s.charAt(i) == 'A') aOrA ++;
             }
             System.out.println("This sentence has " + aOrA + " a or A");
         }
         else System.out.println("This sentence does not have any characters");

        System.out.println("\n-------TASK-4--------\n");

        System.out.println("Please enter a positive number");
        int number = input.nextInt();

        int i = 1;
        while (i <= number){
            if (i % 6 == 6) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
            i ++;
        }
    }
}
