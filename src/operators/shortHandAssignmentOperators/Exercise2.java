package operators.shortHandAssignmentOperators;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        /*
        PSEUDO CODE
        1.create a scanner object
        2.get the data from user
        3.calculate the balance after 1st , 2nd and 3rd transaction by shorthand operators
        4.print the result
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your balance ");
        double balance = input.nextDouble();
        System.out.println("Balance = $" + balance);

        System.out.println("Enter first transaction");
        double firstTransaction = input.nextDouble();
        System.out.println("Balance after first transaction is = $" + (balance -= firstTransaction));

        System.out.println("Enter second transaction");
        double secondTransaction = input.nextDouble();
        System.out.println("Balance after second transaction is = $" + (balance -= secondTransaction));

        System.out.println("Please enter third transaction");
        double thirdTransaction = input.nextDouble();
        System.out.println("Balance after third transaction is = $" + (balance -= thirdTransaction));


    }
}
