package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = input.nextInt();

        boolean isPrime = true;

        for (int i = 2 ; i < n / 2 ; i++) {
            if (n % i == 0){
                isPrime = false;
                break;
            }

        }
        System.out.println(isPrime);

    }


}

