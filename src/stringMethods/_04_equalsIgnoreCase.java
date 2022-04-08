package stringMethods;

public class _04_equalsIgnoreCase {
    public static void main(String[] args) {
        System.out.println("Hello".equals("hello"));
        System.out.println("Hello".equalsIgnoreCase("hello"));

        String s1 = "Good";
        String s2 = "GOOD";

        boolean b1 = s1.equalsIgnoreCase(s2);// true
    }
}
