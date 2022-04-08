package operators.arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args){
        /*
        PSEUDO CODE
        1. Create 2 int variables to store data
        2.Find the sum,subtraction,multiplication, division and remainder of 2 given data
        3.Print the result of sum,subtraction,multiplication, division and remainder
         */

        int num1 = 9;
        int num2 = 3;

        num1 = 5;

        //addition
        int sum = num1 + num2;//8

        //subtraction
        int sub = num1 - num2;//2

        //multiplication
        int multiplication = num1 * num2; //15

        //division
        double division = (double)num1 / num2;

        //remainder
        int remainder = num1 % num2 ;

        System.out.println("Addition is = " + sum);
        System.out.println("Subtraction is = " + sub);
        System.out.println("Multiplication is = " + multiplication);
        System.out.println("Division is = " + division);
        System.out.println("Remainder is = " + remainder);



    }
}
