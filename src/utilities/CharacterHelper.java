package utilities;

public class CharacterHelper {

    //TASK-1
    public static boolean isSpace(char c){
        return c == ' ';
    }

    //TASK-2
    public static boolean isDigit(char c){
         return c >= 48 && c <= 57;
    }

    //TASK-3
    public static boolean isUppercase(char c){
         return c >= 'A' && c <= 'Z';
    }

    //TASK-4
    public static boolean isLowercase(char c){
         return c >= 'a' && c <= 'z';
    }
    //TASK-5
    public static boolean isLetter(char c){
        return CharacterHelper.isLowercase(c) || CharacterHelper.isUppercase(c);
    }

    //TASK-6
    public static boolean isVowel(char c){
        return c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'I' ||
                c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i';
    }

    //TASK-7
    public static boolean isConsonant(char c){
       return CharacterHelper.isLetter(c) && !CharacterHelper.isVowel(c) ;
    }
}
