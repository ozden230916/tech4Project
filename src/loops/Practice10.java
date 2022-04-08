package loops;
import java.util.Scanner;
public class Practice10{
    public static void main(String[] args){
        //TASK-1

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        int n1 = input.nextInt();

        System.out.println("Please enter second number");
        int n2 = input.nextInt();

        int i = Math.min(n1, n2);
        while (i <= Math.max(n1, n2)){
            if (i == 5) {
                i ++;
                continue;
            }
            System.out.println(i);
            i ++;



        }
        }

    }
