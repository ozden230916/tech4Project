package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        str = str.replaceAll("[aeiouAEIOU]", "\\$");
        System.out.println(str);

        String str2 = "hello123world";
        str2 = str2.replaceAll("[0-9]", "");
        System.out.println(str2);

        String s = "How much wood would a wood-Chuck chuck if a wood-chuck could chuck wood";
        System.out.println(s.replaceAll("[wood]{4}","****"));

        String str3 = " abc 123 $#^ ";
        str3 = str3.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str3);

        String newS = "";
        for (int i = 0; i < str3.length(); i++) {
            if (Character.isLetter(str3.charAt(i)) || Character.isDigit(str3.charAt(i))) newS += str3.charAt(i);
        }
        System.out.println(newS);

    }
}
