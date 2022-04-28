package collections.linkedList;

public class Test {
    public static int findFactorial(int n){
        int product = 1;
        if(n == 0 || n == 1) return 1;
        else{
            for(int i = n; i> 0; i--){
                product *= i;
            }
        }

        return product;
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
