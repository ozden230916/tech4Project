package javaMemoryManagement;

public class ReverseExercise {
    /*
    Write a method that takes a String and returns it reversed
     */
    //Loop logic
    public static String reverse1(String s){
        StringBuilder r = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            r.append(s.charAt(i));
        }
        return r.toString();
    }

    public static String reverse2(String s){
        return new StringBuilder(s).reverse().toString();
    }
    /*
    create a method that takes a String and checks if it is polindrome
    if it is polindrome return true
    else return false

     */
    public static boolean isPolindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(reverse1("Hello"));
        System.out.println(reverse2("Ozden"));

        System.out.println(isPolindrome("madam")); //true
        System.out.println(isPolindrome("123321"));//true
        System.out.println(isPolindrome("Madam"));//false
    }
}
