package methods;

import utilities.MyMethods;
import utilities.RandomNumberGenerator;

import java.util.Scanner;

public class TestingMyMethods {
    public static void main(String[] args) {
        int num1 = 2, num2 = 6, num3 = 3, num4 = 9;
        MyMethods.printMaxOf4(num1, num2,num3, num4);
        System.out.println(MyMethods.findMaxOf4(num1, num2, num3, num4));

        int num = RandomNumberGenerator.getRandomNumber(1, 100);
        MyMethods.whereIsTheNumber(num);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers between 1 and 10");
        int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt(), n4 = input.nextInt(), n5 = input.nextInt();

        System.out.println(MyMethods.getPoints(n1, n2, n3, n4, n5));

    }
}
