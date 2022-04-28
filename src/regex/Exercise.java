package regex;

import java.util.regex.Pattern;

public class Exercise {
    public static void main(String[] args) {
        String s = "Abcd123*";
        System.out.println(Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S).{8,15}", s));

    }
}
