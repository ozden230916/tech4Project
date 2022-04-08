package operators.shortHandAssignmentOperators;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        1.create the variables
        2.use shorthand assignments
        3.Print them out
         */
        int a = 8;
        int b = 3;

        System.out.println("a +=b is : " + (a += b)); //11
        System.out.println("a -= b is : " + (a -= b)); //8
        System.out.println("a *= b is :" + (a *= b)); //24
        System.out.println("a /= b is : " + (a /= b)); //8
        System.out.println("a %= b is : " + (a % b)); //2


    }
}
