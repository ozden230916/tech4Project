package characterClass;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {
        boolean b = Character.isDigit('9');
        System.out.println(b);
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLetterOrDigit(' '));

        //isVowel
        char c = 'A';
        String s = "AEIOUaeiou";

        System.out.println(s.contains(c + ""));// finding if the char is vowel

        char c1 = 'a';
        boolean isc1Vowel = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c1) isc1Vowel = true;
        }

    }
}
