package arrays;

public class _07_PracticeFindTheLongestString {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "white"};

        int max = Integer.MIN_VALUE;
        String longest = "";

        for (String color : colors) {
            if (color.length() > max) {
                max = color.length();
                longest = color;
            }
        }
        System.out.println(longest);


    }
}
