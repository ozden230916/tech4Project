package recursion;

public class _03_ReverseString {
    /*
    Write a recursive method to reverse a given String

    str = "Apple"

    Expected:
    elppA
    */

    public static String recursiveReverseString(String str){
        if(str.length() <= 1) return str;
        return recursiveReverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(recursiveReverseString("Apple"));
    }
}
