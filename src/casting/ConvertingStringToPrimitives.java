package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {

        String num1 = "23";
        String num2 = "12";

        System.out.println(num1 + num2); // 2312

        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);

        System.out.println(num1Int + num2Int);// 35

        int num1IntValueOf = Integer.valueOf(num1);
        int num2IntValueOf = Integer.valueOf(num2);

        System.out.println(num1IntValueOf + num2IntValueOf);


    }
}
