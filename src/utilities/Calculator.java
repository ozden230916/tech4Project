package utilities;

public class Calculator {

    public static int divide(int num1, int num2){
        return num1 / num2;
    }
    public static double divide(double num1, double num2){
        return num1 / num2;
    }

    //create a method that finds sum of 2 int numbers and returns it

    public static int sumOf2(int num1, int num2){

        return num1 + num2;
    }
    //create a method that finds sum of 2 double numbers and returns it

    public static double sumOf2(double num1, double num2){

        return num1 + num2;
    }
    //create a method that finds the absolute difference of 2 int numbers and returns it

    public static int abs(int num1, int num2){
        if (num1 > num2) return num1 - num2;
        else return num2 - num1;
    }
    //create a method that finds the absolute difference of 2 double numbers and returns it

    public static double abs(double num1, double num2){
        if (num1 > num2) return num1 - num2;
        else return num2 - num1;
    }
    //create a method that finds the product of 2 int numbers and returns it

    public static int productOf2(int num1, int num2){
        return  num1 * num2;
    }
    //create a method that finds the product of 2 double numbers and returns it

    public static double productOf2(double num1, double num2){
        return num1 * num2;
    }
}
