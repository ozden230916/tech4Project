package ifElseStatements.ifElseStatements;

public class FindGreatestOfTwoNumbers {
    public static void main(String[] args) {
        /*
        write a program that creates 2 random numbers between 0 and 10.
        Print the numbers
        Find the greatest number by using if-else statement
         */
        int num1 = (int)(Math.random() * 11), num2 = (int)(Math.random() * 11);

        System.out.println(num1);
        System.out.println(num2);

        if (num1 > num2){
            System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num1);
        }
        else System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num2);
    }
}
