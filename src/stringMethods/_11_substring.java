package stringMethods;

public class _11_substring {
    public static void main(String[] args) {
        String result = "About 3,520,000,000 results (0.82 seconds)";
        String num = result.substring(6, 19);
        System.out.println(num);

        //use the substring method to get (0.82 seconds)
        System.out.println(result.substring(28));
        System.out.println(result.substring(result.indexOf('(')));
        System.out.println(result.substring(result.lastIndexOf('0')  -1));
        System.out.println(result.substring(result.length() - 14));


    }
}
