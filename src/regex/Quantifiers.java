package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println( Pattern.matches("[a-z]+", "hello"));//true
        System.out.println( Pattern.matches("[a-z]+", "h"));//true
        System.out.println( Pattern.matches("[a-z]+", "1"));//false
        System.out.println( Pattern.matches("[a-z]+", "hello my name is Bilal and I love TechGlobal"));//false
        System.out.println(Pattern.matches("[a-zA-Z]{3,}", "Hello class"));
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{8,15}","OzdenFirat_1-"));
        System.out.println(Pattern.matches("[(][1-9]{3}[)]-[0-9]{3}-[0-9]{4}","(437)-238-8134"));
        System.out.println(Pattern.matches("[^@]{2,}@[a-z]{2,}.[a-z]{2,}", "oozerfirat@gmail.com"));
        System.out.println(Pattern.matches("\\([1-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(123)-456-7890"));
        System.out.println(Pattern.matches("[(][1-9]{3}[)]-[0-9]{3}-[0-9]{4}","(437)-238-8134"));



    }
}
