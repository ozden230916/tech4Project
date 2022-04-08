package loops;

public class Practice {
    public static void main(String[] args) {

        /*
        TASK-1
        Write a program that prints all the numbers between 1-100
        But do not print any number that can be divided by 2 or 3

        Expected output:
        1
        5
        7
        11
        13
        17
        19
        23
        .
        .
        .
        97
         */

        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 != 0 && i % 3 != 0) System.out.println(i);
        }

        System.out.println("While loop");
        int i = 1;
        while (i <= 100){
            if (i % 2 != 0 && i % 3 != 0) System.out.println(i);
            i ++;
        }
        System.out.println("do While loop");
        int j = 1;
        do {
            if (j % 2 != 0 && j % 3 != 0) System.out.println(j);
            j++;
        }while (j <= 100);
    }
}
