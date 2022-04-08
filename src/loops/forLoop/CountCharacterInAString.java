package loops.forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {
        /*
        Write a Java program to count total number of “o” letter in the given String below:
	    String str = “TechGlobal School”;
         */
        int count = 0;
        String str = "TechGlobal School";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') count++;
        }
        System.out.println(count);
    }
}
