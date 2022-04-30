package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
 /*
•	Write a method that takes a “String password” as an argument and checks if the given password is valid or not
•	This method will return true if given password is valid, or false if given password is not valid
•	A VALID PASSWORD:
	-should have length of 8 to 16 (length of 7 or 17 should return false)
	-should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special char
	-should NOT have any space


  */
    public static boolean isValidPassword(String s){
        boolean isValid = false;
        int upper = 0, lower = 0, digit = 0, special = 0;
        for (int i = 0; i < s.length(); i++) {
           if(s.length() < 8 || s.length() > 16) isValid = false;
           else {
               if (Character.isDigit(s.charAt(i))) digit++;
               else if (Character.isUpperCase(s.charAt(i))) upper++;
               else if(Character.isLowerCase(s.charAt(i))) lower ++;
               else if(!Character.isLetterOrDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) special++;
           }
           if ( digit >= 1 && upper >= 1 && lower >= 1 && special >= 1) isValid = true;
        }
        return isValid;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("$Ad1234"));
    }

}








