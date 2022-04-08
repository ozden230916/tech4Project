package methods;

import utilities.Calculator;

public class TestingCalculator {
    public static void main(String[] args) {
        int i1 = 15, i2 = 2;

        int result = Calculator.divide(i1, i2);// returns an int
        System.out.println(result);

        double d1 = 15, d2 = 2;
        double resultDouble = Calculator.divide(d1, d2);//returns a double
        System.out.println(resultDouble);

        System.out.println(Calculator.sumOf2(17, 23));
        System.out.println(Calculator.sumOf2(12.34,32.13));
        System.out.println(Calculator.abs(3,17));
        System.out.println(Calculator.abs(3.4,2.1));
        System.out.println(Calculator.productOf2(2,5));
        System.out.println(Calculator.productOf2(0.5,0.8));
    }
}
