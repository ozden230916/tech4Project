package mathClass;

public class ExerciseMathRandom {
    public static void main(String[] args) {
        /*
        Create a program which is generating random  number between 45-98 and
        print it out
         */
        int number = (int)(Math.random() * 54 + 45);
        System.out.println(number);

        /*
        Create a program which is generating  two random  number between 67 and 85
        print out number1 , number2, max and min
         */
        int num1 = (int)(Math.random() * 19 + 67);
        int num2 = (int)(Math.random() * 19 + 67);
        System.out.println("Number 1 =" + num1 +
                "\nNumber 2 = " + num2 +
                "\nMax = " + Math.max(num1, num2) +
                "\nMin = " + Math.min(num1, num2));
    }
}
