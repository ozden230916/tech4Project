package loops.controlStatements;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {
        /*
        write a java program that asks user to enter 2 different integers
        Print all the numbers between given 2 integers starting from biggest to smallest
        given numbers are included
        HOWEVER, do not print any number less than 10
        PSEUDO CODE
        1.Ask user to enter 2 different nubers
        2.Get these numbers and store in int variables
        3.Use fori loop to print all the numbers from biggest to smallest between 2 numbers given by user
        4.Starting point is the max of 2 numbers, termination point is min of 2 numbers,change is decrement(--)

         */
        int n1 = ScannerHelper.getNumberFromUser();
        int n2 = ScannerHelper.getNumberFromUser();
        for (int i = Math.max(n1, n2); i >= Math.min(n1, n2); i--) {
            if (i < 10) break;
            System.out.println(i);
                }


        /*if(Math.max(n1, n2) >= 10){
            for (int i = Math.max(n1, n2); i >= Math.min(n1, n2); i--) {
                System.out.println(i);
                if(i == 10) break;
            }
        }*/



    }
        }



