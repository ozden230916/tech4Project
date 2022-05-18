package homework;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int factorial = 1;
        for (int i = 1; i <= 5; i++){
            factorial *= i;
        }
        System.out.println(factorial);

    }
}
