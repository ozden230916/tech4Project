package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {

        int num = 36;

        // +(concatenation)
        String numStr = num + "";

        //String.valueOf() method
        String numValueOfMethod = String.valueOf(num);

        System.out.println(numStr);
        System.out.println(numValueOfMethod);


    }
}
