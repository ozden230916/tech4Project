package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");
        /*
        TASK-1
        Write a program that counts spaces for below String
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
        */

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count = 0;
        for (int i = 0; i < address.length(); i++) {
            if (Character.isWhitespace(address.charAt(i))) count ++;
        }
        System.out.println(count);

        /*second way
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == ' ') count ++;
        }
        System.out.println(count);*/

        /*third way
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == 32) count ++;
        }
        System.out.println(count);*/
        /*fourth way
        for (int i = 0; i < address.length(); i++) {
            if (Character.isSpace(address.charAt(i))) count ++;
        }
        System.out.println(count);
         */

        System.out.println("\n--------TASK-2--------\n");
        /*
        Write a program that counts letters for below String.
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        25
         */

        int lettersCount = 0;
        for (int i = 0; i < address.length(); i++) {
            if (Character.isLetter(address.charAt(i))) lettersCount ++;
        }
        System.out.println(lettersCount);

        /*second way
        for (int i = 0; i < address.length(); i++) {
            if ((address.charAt(i) >= 'a' && address.charAt(i) <= 'z') || (address.charAt(i) >= 'A' && address.charAt(i) <= 'Z'))
                lettersCount ++;
        }
        System.out.println(lettersCount);
        
        }
        */
        /*third way
        for (int i = 0; i < address.length(); i++) {
            if ((address.charAt(i) >= 65 && address.charAt(i) <= 90) || (address.charAt(i) >= 97 && address.charAt(i) <= 122))
                lettersCount ++;
        }
        System.out.println(lettersCount);

    }*/

        System.out.println("\n--------TASK-3--------\n");
        /*
        Write a program that counts uppercase and lowercase letters for below String.
        Then, find the difference between lowercase letters and uppercase letters
        Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */

        int countUpperCase = 0;
        int countLowercase = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (Character.isLetter(address.charAt(i))){
                if (Character.isUpperCase(address.charAt(i))) countUpperCase ++;
                else countLowercase ++;
            }
        }
        System.out.println("Number of upperCase = " + countUpperCase);
        System.out.println("Number of lowerCase = " + countLowercase);
        System.out.println("Difference = " + Math.abs(countLowercase - countUpperCase));

        System.out.println("\n--------TASK-4--------\n");
        /*
        Write a program that counts vowel and consonants letters for below String.
        Then, print them with below messages

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        Vowels = 10
        Consonants = 15
         */
        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (Character.isLetter(c)){
                if (CharacterHelper.isVowel(c)) vowels ++;
                else consonant ++;
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonant = " + consonant);

        System.out.println("\n--------TASK-5--------\n");
        /*
        Write a program that characters from the below String.
        Then, print them with below messages

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        Letters = 25
        Lowercases = 17
        Uppercases = 8
        Vowels = 10
        Consonants = 16
        Digits = 12
        Spaces = 9
        Specials = 2
         */
        int countLetter = 0, countLC = 0, countUC = 0, countVowels = 0, countConsonant = 0, countDigits = 0, countSpaces = 0,
                countSpecials = 0, countEven = 0, countOdd = 0;

        for (int i = 0; i < address.length(); i ++){
            char c = address.charAt(i);
            if (Character.isLetter(c)){
                countLetter ++;
                if (Character.isLowerCase(c)) countLC ++;
                else countUC ++;
                if (CharacterHelper.isVowel(c)) countVowels ++;
                else countConsonant ++;
            }
            else if (Character.isDigit(c)) {
                countDigits ++;
                if (Integer.parseInt("" + c) % 2 == 0) countEven ++;
                else countOdd ++;
            }
            else if (Character.isSpaceChar(c)) countSpaces ++;
            else countSpecials ++;
        }
        System.out.println("Letters = " + countLetter);
        System.out.println("Lowercases =" + countLC);
        System.out.println("Uppercases =" + countUC);
        System.out.println("Vowels = " + countVowels);
        System.out.println("Consonants = " + countConsonant);
        System.out.println("Digits = " + countDigits);
        System.out.println("Even digits = " + countEven);
        System.out.println("Odd Digits = " + countOdd);
        System.out.println("Spaces = " + countSpaces);
        System.out.println("Specials = " + countSpecials);

    }
}
