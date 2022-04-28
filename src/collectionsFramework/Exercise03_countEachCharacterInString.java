package collectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise03_countEachCharacterInString {
    public static void main(String[] args) {
        String word = "Chicago is a nice city";
        /*
        count each character

         */
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        for(Character c : word.toCharArray()){
            if (!charCount.containsKey(c)) charCount.put(c, 1);
            else charCount.put(c, charCount.get(c) +1);
        }
        System.out.println(charCount);

        for (Map.Entry entry : charCount.entrySet()){
            System.out.println(entry);
        }

    }
}
