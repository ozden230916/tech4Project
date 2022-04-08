package loops.nestedLoops;

public class PrintAllLetters {
    public static void main(String[] args) {
        int start = 97 ;
        for (int i = 1; i <=2 ; i++) {
            if (i == 1){
                System.out.println("Lowercase Letters");
            }
            else {
                System.out.println("Uppercase Letters");
                start = 65;
            }
            for (int j = start; j <= start + 25 ; j++) {
                System.out.println((char) j);

            }
            /*for (int j = 97; j <= 122 ; j++) {
                if (i == 1) System.out.println((char)j);
                else System.out.println(("" + (char)j).toUpperCase());
            } */

        }

        }
    }

