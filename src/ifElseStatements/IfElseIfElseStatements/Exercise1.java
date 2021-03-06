package ifElseStatements.IfElseIfElseStatements;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        Write a program that generates a random number between -10, 10(inclusive)
        and if the number is positive print out "number is POSITIVE!",
        if the number is negative print out "number is NEGATIVE!",
        and if the number is 0 print out "number is ZERO!".


        input:                      input:                  input:
        6                           -5                      0
        output:                     output:                 output:
        number is POSITIVE!         number is NEGATIVE!     number is ZERO!

        PSEUDO CODE
        1.Generate a number
        2.Create if statements for checking 3 different possibilities
        3.Do the proper action for every single possibility
 */
        int number = (int) (Math.random()* 21- 10);
        System.out.println("Random number = " + number);

        if (number > 0){
            System.out.println("number is POSITIVE");
        }
        else if (number < 0){
            System.out.println("number is NEGATIVE");
        }
        else {
            System.out.println("number is 0");
        }
    }
}
