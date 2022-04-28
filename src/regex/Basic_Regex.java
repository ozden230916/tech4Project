package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("o");
        Matcher matcher = pattern.matcher("I love TechGlobal");
        System.out.println(matcher.matches());

        while (matcher.find()){//find the next matched pattern in the given string
            System.out.println(matcher.group());//Print out the next matched pattern in the given string
            System.out.println("start point : " + matcher.start());// Returns you an integer and prints out where found pattern starts
            System.out.println("end point : " + matcher.end());//Returns you an integer and prints out where found pattern ends
        }
        System.out.println(Pattern.matches("[xyz]", "xyz"));
        System.out.println(Pattern.matches("[xyz]", "xxxx"));
        System.out.println(Pattern.matches("[xyz]", "x"));
        System.out.println(Pattern.matches("[^xyz]", "y"));

    }
}
