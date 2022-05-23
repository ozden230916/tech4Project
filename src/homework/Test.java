package homework;

import java.util.Arrays;

public class Test {
    /*
    public static void main(String[] args) {
       int[] numbers = {9, 4, 8, 2, 7};
       int[] pair = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length ; j++) {
                if (numbers[i] + numbers[j] == 11){
                   pair[0] = numbers[i];
                   pair[1] = numbers[j];
                    System.out.println(Arrays.toString(pair));
                }

            }

        }

    }
     */
    public static void convertPair(int[] arr, int n){
        int[] pairs = new int[2];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n){
                    pairs[0] = arr[i];
                    pairs[1] = arr[j];
                    System.out.println(Arrays.toString(pairs));
                }
            }

        }
    }

    public static void main(String[] args) {
        convertPair(new int[] {9, 4, 8, 2, 7}, 11);
    }

}
