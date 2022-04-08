package utilities;

public class MyMethods {
    // Write a method which going to find the max of 4 int numbers and prints it out ONLY
    public static void printMaxOf4(int n1, int n2, int n3, int n4){
        System.out.println(Math.max(Math.max(Math.max(n1, n2), n3), n4));
    }
    // Write a method which going to find the max of 4 int numbers and RETURNS it
    public static int findMaxOf4(int n1, int n2, int n3, int n4){
        return Math.max(Math.max(Math.max(n1, n2), n3),n4);
    }
    public static void isNumberBetween10And25(int num){
        if (num >= 10 && num <= 25) System.out.println(true);
        else System.out.println(false);
    }
    /*
    Write a program that generates a random number between 1 and 100 (both 1 and 100 are included)
        Find which quarter and half is number in
        1st quarter is 1-25
        2nd quarter is 26-50
        3rd quarter is 51-75
        4th quarter is 76-100
        1st half is 1-50
        2nd half is 51-100

     */
    public static void whereIsTheNumber(int num){
        if (num <= 50){
            System.out.println(num + " is in the 1st half" );
            if (num <= 25) System.out.println(num + " is in the 1st quarter");
            else System.out.println(num + " is in the 2nd quarter");
        }
        else{
            System.out.println(num + " is in the 2nd half" );
            if (num <= 75 ) System.out.println(num + " is in the 3rd quarter");
            else System.out.println(num + " is in the 4th quarter");
        }
    }
    /*
    Write a program that asks user to enter 5 numbers between 1 to 10 (1 and 10 are included)
    They will get some points based on numbers they entered. So, their points will be calculated as below
    1st  number will be multiplied by 5 and added as points
    2nd number will be multiplied by 4 and added as points
    3rd number will be multiplied by 3 and added as points
    4th number will be multiplied by 2 and added as points
    5th number will be multiplied by 1 and added as points
    If user enters any number that is not in th
     */
    public static int getPoints(int num1, int num2, int num3, int num4, int num5){
        int points = 0;
        if (num1 >= 1 && num1 <= 10)  points += num1 * 5;
        if (num2 >= 1 && num2 <= 10)  points += num2 * 4;
        if (num3 >= 1 && num3 <= 10)  points += num3 * 3;
        if (num4 >= 1 && num4 <= 10)  points += num4 * 2;
        if (num5 >= 1 && num5 <= 10)  points += num5 ;
        return points;
    }




}
