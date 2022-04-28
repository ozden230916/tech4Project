package exceptions;

public class Example02 {
    public static void main(String[] args) {
        int numbers = 45;


        try{
            System.out.println(numbers / 3);//15
            String s = null;
            System.out.println(s.startsWith("abc"));
            System.out.println(numbers / 0);
            System.out.println("abc".charAt(15));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of the program");

    }
}
