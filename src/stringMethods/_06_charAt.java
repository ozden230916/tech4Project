package stringMethods;

public class _06_charAt {
    public static void main(String[] args) {
        String name = "JOHN";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

        /*
        check if the name starts with A and print "This name starts with A"
        otherwise print "This name does not start with A"
         */

        if (name.charAt(0) == 'A' || name.charAt(0)== 'a') System.out.println("This name starts with A");
        else System.out.println("This name does not starts with A");


    }
}
