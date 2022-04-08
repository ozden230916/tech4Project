package stringMethods;

import java.util.Locale;

public class _05_toLowercase_toUppercase {
    public static void main(String[] args) {
        String s1 = "HELLO world";

        System.out.println(s1.toLowerCase());//hello world
        System.out.println(s1.toUpperCase());//HELLO WORLD

        String sentence = " I paid $100.99 to buy airpods.";
        String s2 = sentence.toLowerCase(); //i paid $100.99 to buy airpods.
        String s3 = sentence.toUpperCase();// I PAID $100.99 TO BUY A AIRPODS.
        System.out.println(s3.toLowerCase().toUpperCase().toLowerCase());// i paid $100.99 to buy airpods.
    }
}
