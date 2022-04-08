package projects;

import java.util.ArrayList;

public class project08 {
    //TASK-1
    public static int countMultipleWords(String[] arr){
        int count = 0;
        for (String s : arr) {
            if (s.trim().contains(" ")) count++;
        }
        return count;
    }

    //TASK-2
    public static ArrayList removeNegatives(ArrayList<Integer> arr){
        ArrayList<Integer> negatives = new ArrayList<>();
        for (Integer integer : arr) {
            if (integer < 0) negatives.add(integer);
        }
        arr.removeAll(negatives);
        return arr;
    }
    //TASK-3
    public static boolean validatePassword(String str){
        boolean hasAtLeast1Digit = false;
        boolean hasAtLeast1Uppercase = false;
        boolean hasAtLeast1Lowercase = false;
        boolean hasAtLeast1SpecialChar = false;
        if (str.length() >= 8 && str.length() <= 16){
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))){
                    hasAtLeast1Digit = true;

                }
                else if (Character.isUpperCase(str.charAt(i))){
                    hasAtLeast1Uppercase = true;

                }
                else if (Character.isLowerCase(str.charAt(i))){
                    hasAtLeast1Lowercase = true;

                }
                else {
                    hasAtLeast1SpecialChar = true;

                }
                if (hasAtLeast1Digit && hasAtLeast1Lowercase && hasAtLeast1SpecialChar && hasAtLeast1Uppercase) break;
            }

        }
        return hasAtLeast1Digit && hasAtLeast1Lowercase && hasAtLeast1SpecialChar && hasAtLeast1Uppercase;

    }
    //TASK-4
    public static boolean validateEmailAddress(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') count++;
        }
         return (!str.contains(" ") && count == 1 && str.substring(0, str.indexOf('@')).length() > 2 && str.substring(str.indexOf('@') + 1, str.indexOf('.')).length() > 2 &&
                 str.substring(str.indexOf('.')).length() > 2);
    }
    ////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");
        System.out.println(countMultipleWords(new String[]{"foo", "",  " ", "foo bar", "java is fun", " ruby "}));

        System.out.println("\n--------TASK-2--------\n");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(-10);
        numbers.add(-78);
        numbers.add(0);
        numbers.add(15);
        System.out.println(removeNegatives(numbers));

        System.out.println("\n--------TASK-3--------\n");
        System.out.println(validatePassword("oc!2AB33"));

        System.out.println("\n--------TASK-4--------\n");
        System.out.println(validateEmailAddress("abc@gmail.com"));

    }
}
