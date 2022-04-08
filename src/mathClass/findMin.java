package mathClass;

public class findMin {
    public static void main(String[] args) {
        int x = 45;
        int y = 12;
        int z = 65;

        int a = 123;
        int b = -123;

        int minOfXY = Math.min(x,y);
        int minOfZA = Math.min(z, a);
        int minOfZAB = Math.min(minOfZA, b);
        int minOfAll = Math.min(minOfZAB, minOfXY);
        System.out.println(minOfAll);
    }
}
