package stringMethods;

import java.util.Arrays;

public class _16_Split {
    public static void main(String[] args) {
        String s = "Banana is nice";
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
