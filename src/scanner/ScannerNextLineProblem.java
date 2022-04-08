package scanner;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String[] args){
        /**
        name-->next()
        age-->nextInt()
        myBrainOK-->nextBoolean()
        address-->nextLine()
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = input.next();


        System.out.println("Please enter your age :");
        int age = input.nextInt();

        System.out.println("Please enter is your brain OK :");
        boolean myBrainOK = input.nextBoolean();
        input.nextLine();

        System.out.println("Please enter your address :");
        String address = input.nextLine();


        System.out.println("User name is = " + name +
                "\nUser age is = " + age +
                "\nIs user's brain OK ? = " + myBrainOK +
                "\nUser's address is = " + address);


    }
}
