package homework;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        int randomNumber = (int)(Math.random() * 51);
        System.out.println("Random number generated = " + randomNumber);
        System.out.println("The number is between  10 and 25 is = " + (randomNumber >= 10 && randomNumber <= 25));

        System.out.println("\n--------TASK-2--------\n");

        int randomBt1And100 = (int)(Math.random() * 100 + 1);

        if (randomBt1And100 <= 50){
            System.out.println(randomBt1And100 + " is in the 1st half" );
            if ( randomBt1And100 <= 25 ) System.out.println(randomBt1And100 + " is in the 1st quarter");
            else System.out.println(randomBt1And100 + " is in the 2nd quarter");
        }
        else {
            System.out.println(randomBt1And100 + " is in the 2nd half" );
            if (randomBt1And100 <= 75 ) System.out.println(randomBt1And100 + " is in the 3rd quarter");
            else System.out.println(randomBt1And100 + " is in the 4th quarter");
        }

        System.out.println("\n--------TASK-3--------\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers between 1 and 10");
        int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt(), n4 = input.nextInt(), n5 = input.nextInt();
        int points = 0;

        if (n1 >= 1 && n1 <= 10) points += n1 * 5;
        if (n2 >= 1 && n2 <= 10) points+= n2 * 4;
        if (n3 >= 1 && n3 <= 10) points+= n3 * 3;
        if (n4 >= 1 && n4 <= 10) points+= n4 * 2;
        if (n5 >= 1 && n5 <= 10) points+= n5 ;

        System.out.println(points);

    }
}
