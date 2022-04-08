package operators.shortHandAssignmentOperators;

public class ShortHandAssignmentOperators {
    public static void main(String[] args) {
        int age = 5;
        //after 3 years
        age += 3;
        System.out.println("Age after 3 years = " + age);

        age -= 2;
        System.out.println(age);//6

        age *= 2;
        System.out.println(age);//12

        age /= 3;
        System.out.println(age);//4

        age %= 3;
        System.out.println(age);// 1
    }
}
