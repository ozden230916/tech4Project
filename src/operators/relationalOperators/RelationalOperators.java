package operators.relationalOperators;

public class RelationalOperators {
    public static void main(String[] args){
        int a = 4;
        int b = 10;

        boolean isALessThanB = a < b;
        boolean isALessThanOrEqualToB = a <= b;
        boolean isAGreaterThanB = a > b;
        boolean isAGreaterThanOrEqualToB = a >= b;
        boolean isAEqualToB = (a == b);
        boolean isANotEqualToB = (a != b);

        System.out.println("a < b : " + isALessThanB);
        System.out.println("a <= b : " + isALessThanOrEqualToB);
        System.out.println("a > b : " + isAGreaterThanB);
        System.out.println("a >= b : " + isAGreaterThanOrEqualToB);
        System.out.println("a == b : " + isAEqualToB);
        System.out.println("a != b : " + isANotEqualToB);
    }
}
