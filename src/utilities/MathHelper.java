package utilities;

public class MathHelper {

    //create a method that takes 3 int and returns the max

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
    //method overloading
    public static double maxOfThree(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
    //create a method that takes 3 byte numbers  and returns the min
    public  static byte minOfThree(byte num4 , byte num5, byte num6){
        return (byte) Math.min(num4, Math.min( num5, num6));
    }
    /*
    Please create a method that takes an int as an argument and returns true if it is even
    returns false if it is odd
     */
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    /*
    Please create a method that takes an int as an argument and returns true if it is odd
    returns false if it is even
     */
    public static boolean isOdd(int number){
        return number % 2 != 0;
    }
    //Create a method that takes one int as an argument and returns if the number is positive.
    //If the number is positive, it will return true.
    //Otherwise, it will return false.
    public static boolean isPositive(int number){
        return number > 0;
        /*
        second way:
        public static boolean isPositive(int num){
        return num != 0 && num == Math.abs(num);
        }
         */
    }
    //Create a method that takes one int as an argument and returns if the number is negative.
    //If the number is negative, it will return true.
    //Otherwise, it will return false.
    public static boolean isNegative(int number){
        return number < 0;
    }
    //create another method called isZero
    public static boolean isZero(int number){
        return number == 0;
    }




}
