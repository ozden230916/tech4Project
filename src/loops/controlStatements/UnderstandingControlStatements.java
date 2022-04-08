package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {
        /*
        write a program that prints all the numbers bt 1 and 25
        But do not print the numbers that are dividable by 10
        Now do not print the numbers that are greater than 15
         */
        int i = 1;
        while(i < 26){
            if (i % 10 != 0) System.out.println(i);
            if (i == 15) break;
            i ++;

        }
        System.out.println("using continue control statement to skip numbers that can be divided by 10");
        for (int j = 1; j < 26 ; j++) {
            if (j % 10 == 0) {
                continue;
            }
            else {
                System.out.println(j);
            }
            if (j == 15) break;
        }
        System.out.println("End of the program");
    }
}
