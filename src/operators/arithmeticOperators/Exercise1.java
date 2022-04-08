package operators.arithmeticOperators;

public class Exercise1 {
    public static void main(String[] args) {
         /*
        PSEUDO CODE
        1. Create 2 int variables to store data
        2.Find the sum,subtraction,multiplication, division and remainder of 2 given data
        3.Print the result of sum,subtraction,multiplication, division and remainder
         */
        int biggerNumber = 8;
        int smallerNumber = 5;

        int sum = biggerNumber + smallerNumber;
        int subtraction = biggerNumber - smallerNumber;
        int multiplication = biggerNumber * smallerNumber;
        double division = (double) biggerNumber / smallerNumber;
        int remainder = biggerNumber % smallerNumber;

        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Remainder = " + remainder);
    }
}
