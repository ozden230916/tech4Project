package loops.whileLoop;

public class PrintNumbersAscending {
    public static void main(String[] args) {
        /*
        write a program that prints numbers from 1 to 7(both included)
         */
        System.out.println("for loop");
        for (int i = 1; i < 8 ; i++) { // fori loop
            System.out.println(i);
        }
        System.out.println("while loop");
        int i = 1;
        while (i <= 7){
            System.out.println(i);
            i ++;
        }

    }
}
