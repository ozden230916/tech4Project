package casting;

public class CastingPrimitives {
    public static void main(String[] args) {
        /*
        double > float > long > int > char > short > byte
         */

        int myInt = 32;
        long myLong = myInt;  // implicit casting

        myInt = (int) myLong; //explicit casting

        int mySecondInt = 'B';
        char myChar = (char) 56;
        char mySecondChar = 56;

        byte num1 = 45;
        int num2 = num1;

        double num3 = 13.6;
        float num4 = (float) num3;

        byte n = 49;
        char c3 = (char) n;

        int num5 = 45;
        short num6 = 34;

        char c = (char) num5;
        char c2 = (char) num6;

        char c4 = 'a';
        int num7 = c4;

        char c5 = 'b';
        byte b2 = (byte) c5;






    }
}
