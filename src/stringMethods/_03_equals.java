package stringMethods;

public class _03_equals {
    public static void main(String[] args) {
        System.out.println("Melda".equals("Melda"));//true

        String name1 = "John";
        String name2 = "James";
        System.out.println(name1.equals(name2));//false

        System.out.println("\n--------Practices--------");
        String str1 = "Hello";
        String str2 = str1;

        boolean b = !(str1.equals(str2));
        System.out.println(b);//false

        System.out.println(!"abc".concat("xyz").equals("abcx" + "yz"));//false
    }
}
