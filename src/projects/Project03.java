package projects;

public class Project03 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        String s1 = "24", s2 = "5";
        int number1 = Integer.parseInt(s1);
        int number2 =Integer.parseInt(s2);

        System.out.println("The sum of " + number1 + " and " + number2 + " = " + (number1 + number2) +
                "\nThe subtraction of " + number1 + " and " + number2 + " = " + (number1 - number2) +
                "\nThe division of " + number1 + " and " + number2 + " = " + (double)number1 / number2 +
                "\nThe multiplication of " + number1 + " and " + number2 + " = " + (number1 * number2) +
                "\nThe remainder of " + number1 + " and " + number2 + " = " + (number1 % number2));

        System.out.println("\n--------TASK-2--------\n");

        int random = (int)(Math.random() * 35 + 1);
        System.out.println("Generated random number is = " + random);

        if (random == 2 || random == 3 || random == 5 || random == 7 || random == 11 || random == 13 ||
                random == 17 || random == 19 || random == 23 || random == 29 || random == 31) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        }
        else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");

        System.out.println("\n--------TASK-3--------\n");

        int random1 = (int)(Math.random() * 50 + 1);
        int random2 = (int)(Math.random() * 50 + 1);
        int random3 = (int)(Math.random() * 50 + 1);
        int lowest = Math.min(Math.min(random1, random2), random3);
        int greatest = Math.max(Math.max(random1, random2), random3);
        int middle;

        if (random1 != lowest && random1 != greatest){
             middle = random1;
        }
        else if (random2 != lowest && random2 != greatest){
             middle = random2;
        }
        else{
             middle = random3;
        }

        System.out.println("lowest number is = " + lowest +
                "\nMiddle number is = " + middle +
                "\nGreatest number is = " + greatest);

        System.out.println("\n--------TASK-4--------\n");

        char c1 = 'R';

        if (c1 >= 65 && c1 <= 90) System.out.println("The letter is uppercase");
        else if (c1 >= 97 && c1 <= 122) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");

        System.out.println("\n--------TASK-5--------\n");

        char c2 = 'R';

        if ((c2 >= 65 && c2 <= 90) || (c2 >= 97 && c2 <= 122)){
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u' || c2 == 'A' ||
            c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U') System.out.println("The letter is vowel");
            else System.out.println("The letter is consonant");
        }
        else System.out.println("Invalid character detected!!!");

        System.out.println("\n--------TASK-6--------\n");

        char c3 = '&';

        if (!(c3 >= 65 && c3 <= 90) && !(c3 >= 97 && c3 <= 122) && !( c3 >=48 && c3 <=57)){
            System.out.println("Special character is = " + (char)c3);
        }
        else System.out.println("Invalid character detected!!!");

        System.out.println("\n--------TASK-7--------\n");

        char c4 = '@';

        if ((c4 >= 65 && c4 <= 90) || (c4 >= 97 && c4 <= 122)) System.out.println("Character is a letter");
        else if (c4 >=48 && c4 <=57) System.out.println("Character is a digit");
        else System.out.println("Character is a special character");


    }
}
