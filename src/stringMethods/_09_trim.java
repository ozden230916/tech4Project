package stringMethods;

public class _09_trim {
    public static void main(String[] args) {
        String str ="    Hello   ";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.trim().length());

        String str2 = "  Good    Morning";
        String str3 = str2.trim();
        System.out.println(str3);
    }
}
