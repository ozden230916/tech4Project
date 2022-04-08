package stringMethods;

import java.util.Scanner;

public class PracticeLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite book and quote ?");
        String favBook = input.nextLine();
        String favQuote = input.nextLine();

        System.out.println("The length of the favorite book = " + favBook.length());
        System.out.println("The length of the favorite quote = " + favQuote.length());
    }
}
