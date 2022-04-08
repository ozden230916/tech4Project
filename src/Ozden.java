import java.util.Arrays;

public class Ozden {
    public static void main(String[] args) {
        String str = "abcd1234";
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
        System.out.println(hasAtLeast1Digit && hasAtLeast1Lowercase && hasAtLeast1SpecialChar && hasAtLeast1Uppercase);

    }

    }

