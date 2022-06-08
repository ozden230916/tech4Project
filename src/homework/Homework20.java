package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {
    //TASK-1
    public static boolean hasLowerCase(String s) {
        char[] chars = s.toCharArray();
        boolean hasLowerCase = false;
        for (char c : chars) {
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                    break;
                }
            }
        }
        return hasLowerCase;
    }

    //TASK-2
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers) {
        numbers.removeIf(element -> element == 0);
        return numbers;
    }

    //TASK-3
    public static int[][] numberAndSquare(int[] arr) {
        int[][] numberGroups = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
           numberGroups[i][0] = arr[i];
           numberGroups[i][1] = arr[i] * arr[i];
        }
        return numberGroups;

    }
    //TASK-4
    public static boolean containsValue(String[] arr, String s){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, s) >= 0;
    }

    //TASK-5
    public static String reverseSentence(String s){
        String[] words = s.split(" ");
        if ( words.length < 2) return "There is not enough words";

        else{
            words[0] = (words[0].charAt(0) + "").toLowerCase() + words[0].substring(1);
            words[words.length - 1] = (words[words.length - 1].charAt(0) + "").toUpperCase() + words[words.length - 1].substring(1);
            String reverse = "";
            for (int i = words.length - 1; i >= 0 ; i--) {
                reverse += words[i] + " ";

            }
            return reverse;
        }

    }

    //TASK-6
    public static String removeStringSpecialsDigits(String s){
        char[] chars = s.toCharArray();
        String str = "";
        for (char c : chars){
            if (Character.isLetter(c) || Character.isWhitespace(c)) str += c;
        }
        return str;
    }

    //TASK-7
    public static String[] removeArraySpecialsDigits(String[] arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("[^a-zA-Z\\s]", "");

        }
        return arr;
    }

    //TASK-8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> s1, ArrayList<String>s2){
        ArrayList<String> commons = new ArrayList<>();
        for (int i = 0; i < s1.size(); i++) {
            for (int j = 0; j < s2.size(); j++) {
                if (!commons.contains(s1.get(i)) && s1.get(i).equals(s2.get(j))) commons.add(s1.get(i));

            }
        }
        return commons;
    }

    //TASK-9
    public static ArrayList<String> noXInVariables(ArrayList<String> list){
        ArrayList<String> listWithoutX = new ArrayList<>();

       for (String s : list){
           if (!s.toLowerCase().equals("x")){
               s = s.replaceAll("[xX]", "");
               listWithoutX.add(s);
           }

       }
        return listWithoutX;
    }



    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------");
        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$”"));
        System.out.println(hasLowerCase("hello"));

        System.out.println("\n--------TASK-2--------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(0);
        System.out.println(noZero(new ArrayList<>(numbers)));

        System.out.println("\n--------TASK-3--------");
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 2, 3})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 6})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 4})));

        System.out.println("\n--------TASK-4--------");
        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "hello"));
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "Abc"));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "java", "hello"}, "123"));

        System.out.println("\n--------TASK-5--------");
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("\n--------TASK-6--------");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

        System.out.println("\n--------TASK-7--------");
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));

        System.out.println("\n--------TASK-8--------");
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Java");
        s1.add("C#");
        s1.add("C#");

        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Python");
        s2.add("C#");
        s2.add("C++");
        System.out.println(removeAndReturnCommons(new ArrayList<>(s1), new ArrayList<>(s2)));

        System.out.println("\n--------TASK-9--------");
        ArrayList<String> list = new ArrayList<>();
        list.add("xyXyxy");
        list.add("Xx");
        list.add("ABC");
        System.out.println(noXInVariables(new ArrayList<>(list)));



    }
}
