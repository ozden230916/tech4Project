package loops.forLoop;

import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        write a program to print only even numbers bt 0 and 10(0 and 10 are icluded)
         */

        System.out.println("1st way");
        for(int i = 0; i < 11; i ++){
        if(i % 2 == 0) System.out.println(i);
        }

        System.out.println("2nd way");
        for (int i = 0; i < 11; i++) {
            if(MathHelper.isEven(i)) System.out.println(i);
        }

        System.out.println("3rd way");
        for (int i = 0; i <= 10; i+=2){
            System.out.println(i);
        }

        System.out.println("4th way");
        for (int i = 0; i < 11; i++){
            System.out.println(i++);
        }
    }
}
