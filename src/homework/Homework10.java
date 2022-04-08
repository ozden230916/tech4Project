package homework;

import utilities.CharacterHelper;
import utilities.ScannerHelper;
import utilities.StringHelper;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        String s = ScannerHelper.getAStringFromUser();
        if (s.length() < 1) System.out.println("Length is zero");
        else {
            System.out.println("The length of the String is = " + s.length());
            System.out.println("First char in the String is = " + s.charAt(0));
            System.out.println("Last char in the String is = " + s.charAt(s.length() - 1));

            boolean isContainsVowel = false;
            for (int i = 0; i < s.length(); i++) {
                if (CharacterHelper.isVowel(s.charAt(i))) isContainsVowel = true;
            }
            System.out.println(isContainsVowel? "This String has vowel" : "This String does not have vowel");
        }

        System.out.println("\n--------TASK-2--------\n");

        String str = ScannerHelper.getAStringFromUser();

        System.out.println(str.length() < 3 ? "Length is less than 3" : StringHelper.getMiddle(str) );

        System.out.println("\n--------TASK-3--------\n");

        String s1 = ScannerHelper.getAStringFromUser();

        if (s1.length() < 4) System.out.println("INVALID INPUT");
        else{
            System.out.println("First 2 characters are = " + s1.substring(0, 2));
            System.out.println("Last 2 characters are = " + s1.substring(s1.length() - 2));
            System.out.println("The other characters are = " + s1.substring(2, s1.length() - 2));
        }
        System.out.println("\n--------TASK-4--------\n");

        String s2 = ScannerHelper.getAStringFromUser();
        if (s2.length() < 2) System.out.println("Length is less than 2");
        else System.out.println(s2.substring(0, 2).equals(s2.substring(s2.length() - 2)));

        System.out.println("\n--------TASK-5--------\n");

        String s3 = ScannerHelper.getAStringFromUser();
        String s4 = ScannerHelper.getAStringFromUser();

        if (s3.length() < 2 || s4.length() < 2) System.out.println("INVALID INPUT");
        else System.out.println(s3.substring(1, s3.length() - 1) + s4.substring(1, s4.length() - 1));

        System.out.println("\n--------TASK-6--------\n");

        String s5 = ScannerHelper.getAStringFromUser();

        System.out.println(s5.length() < 4 ? "INVALID INPUT" : (s5.toLowerCase().startsWith("xx") && s5.toLowerCase().endsWith("xx")));

    }
}
