package homework;

import java.util.Arrays;

public class Homework19 {
    //TASK-1

    public static String noDigit(String s){
         return s.replaceAll("[0-9]", "");
    }

    //TASK-2
    public static String noVowel(String s){
        return s.replaceAll("[AEIOUaeiou]", "");
    }

    //TASK-3
    public static int sumOfDigits(String s){
        int sum = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) sum += Integer.parseInt("" + c);
        }
        return sum;
    }

    //TASK-4
    public static boolean hasUpperCase(String s){
        char[] chars = s.toCharArray();
        boolean hasUpperCase = false;
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }
        return hasUpperCase;
    }

    //TASK-5
    public static int middleInt(int a, int b, int c){
        int middle;

        if (a == b && b == c) return a;
        else if (a == b || a == c) return a;
        else if (b == c) return b;
        else {
            if (a != Math.max(Math.max(a, b),c) && a != Math.min(Math.min(a, b), c)) middle = a;
            else if (b != Math.max(Math.max(a, b),c) && b != Math.min(Math.min(a, b), c)) middle = b;
            else middle = c;
        }
        return middle;
    }

    //TASK-6
    public static int[] no13(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 13) numbers[i] = 0;
        }
        return numbers;
    }

    //TASK-7
    public static int[] arrFactorial(int[] numbers){
        int[] arr = new int[numbers.length];
        int factorial = 1;
        for (int i = 0; i < arr.length; i++) {
            if (numbers[i] == 0 || numbers[i] == 1) arr[i] = 1;
            else{
                for (int j = 1; j <= numbers[i]; j++) {
                    factorial *= j;
                }
                arr[i] = factorial;
                factorial = 1;
            }
        }
        return arr;
    }

    //TASK-8
    public static String[] categorizeCharacters(String s){
        char[] chars = s.toCharArray();
        String letters = "";
        String digits = "";
        String specials = "";
        for (char c : chars) {
            if (Character.isLetter(c)) letters+= c;
            else if (Character.isDigit(c)) digits+= c;
            else if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) specials += c;
        }
        String[] categorizedS = {letters, digits, specials};
        return categorizedS;
    }

    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");
        System.out.println(noDigit(""));
        System.out.println(noDigit("Java"));
        System.out.println(noDigit("123Hello"));
        System.out.println(noDigit("123Hello World149"));
        System.out.println(noDigit("123Tech456Global149"));

        System.out.println("\n--------TASK-2--------\n");
        System.out.println(noVowel(""));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("125$"));
        System.out.println(noVowel("TechGlobal"));

        System.out.println("\n--------TASK-3--------\n");
        System.out.println(sumOfDigits(""));
        System.out.println(sumOfDigits("Java"));
        System.out.println(sumOfDigits("John’s age is 29"));
        System.out.println(sumOfDigits("“$125.0"));

        System.out.println("\n--------TASK-4--------\n");
        System.out.println(hasUpperCase(""));
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase("John’s age is 29"));
        System.out.println(hasUpperCase("“$125.0"));

        System.out.println("\n--------TASK-5--------\n");
        System.out.println(middleInt(1, 1, 1));
        System.out.println(middleInt(1, 2, 2));
        System.out.println(middleInt(5, 5, 8));
        System.out.println(middleInt(5, 3, 5));
        System.out.println(middleInt(-1, 25, 10));

        System.out.println("\n--------TASK-6--------\n");
        System.out.println(Arrays.toString(no13(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 3 })));
        System.out.println(Arrays.toString(no13(new int[]{13, 13, 13 , 13, 13})));

        System.out.println("\n--------TASK-7--------\n");
        System.out.println(Arrays.toString(arrFactorial(new int[] {1, 2, 3, 4})));
        System.out.println(Arrays.toString(arrFactorial(new int[] {0, 2, 4 , 1})));
        System.out.println(Arrays.toString(arrFactorial(new int[] {5 , 0, 6})));

        System.out.println("\n--------TASK-8--------\n");
        System.out.println(Arrays.toString(categorizeCharacters("     ")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));

    }
}
