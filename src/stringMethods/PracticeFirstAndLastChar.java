package stringMethods;

import utilities.ScannerHelper;

public class PracticeFirstAndLastChar {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter their name
        Print first char of the name with message "First character in the name is = "
        Print last char of the name with message "Last character in the name is = "
        */
        String name = ScannerHelper.getANameFromUser();
        System.out.println("First character in the name is = " + name.charAt(0));
        System.out.println("Last character in teh name is = " +
                name.charAt(name.length() - 1));



    }
}
