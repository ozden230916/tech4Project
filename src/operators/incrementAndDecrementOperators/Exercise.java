package operators.incrementAndDecrementOperators;

public class Exercise {
    public static void main(String[] args) {
        int i = 5;
        int age = 10 * (i++);
        System.out.println(age);//50

        int j = 5;
        int age2 = 10 * (++j);
        System.out.println(age2);//60

    }
}
