package collections.linkedList;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Test {
  public static int countVowel(String s){
      String str = s.replaceAll("[^aeiouAEIOU]", "");
      return str.length();
  }

    public static void main(String[] args) {
        System.out.println(countVowel("I like Java"));
    }

}
