package arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        Print each element with a message

        EXPECTED OUTPUT:
        Element 1 = A
        Element 2 =
        Element 3 = ,
        Element 4 = #
        Element 5 = T
        Element 6 = 6
        Element 7 = 9
         */
        char[] chars = {'A', ' ', ',', '#', 'T','6','9'};
        System.out.println(chars.length);

        System.out.println("\n----fori loop-----\n");

        for (int i = 0; i < chars.length; i++) {
            System.out.println("Element" + (i + 1) + " = " + chars[i]);
        }

        System.out.println("\n----for each loop-----\n");
        int i = 1;
        for (char element : chars){
            System.out.println("Element" + i + " = " + element);
            i ++;
        }

    }
}
