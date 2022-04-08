package arrays;

public class _09_PracticeFirstEvenAndOdd {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
        boolean isFirstEven = false;
        boolean isFirstOdd = false;
        int firstEven ;
        int firstOdd;


        for (int number : numbers) {
            if (!isFirstEven && number % 2 == 0){
                firstEven = number;
                System.out.println("First even = " + firstEven);
                isFirstEven = true;

            }
            else {
                firstOdd = number;
                System.out.println("First odd = " + firstOdd);
                isFirstOdd = true;
                break;
            }
            if (isFirstEven && isFirstOdd) break;
        }
        if (!isFirstEven) System.out.println("There is no even number in the array");
        if (!isFirstOdd) System.out.println("There is no odd number in the array");

    }
}
