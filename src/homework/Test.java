package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String s = "ab2cd7";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) sum += s.charAt(i);
        }
        System.out.println(sum);
    }
}
