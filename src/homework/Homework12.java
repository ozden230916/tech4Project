package homework;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n--------TASK-2--------\n");

        String[] words = new String[5];
        words[1] = "abc";
        words[4] = "xyz";

        System.out.println(words[3]);
        System.out.println(words[0]);
        System.out.println(words[4]);
        System.out.println(Arrays.toString(words));

        System.out.println("\n--------TASK-3--------\n");

        int[] numbersTask3 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbersTask3));

        Arrays.sort(numbersTask3);
        System.out.println(Arrays.toString(numbersTask3));

        System.out.println("\n--------TASK-4--------\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n--------TASK-5--------\n");

        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoonDogs));

        boolean hasPluto = false;
        for (String cartoonDog : cartoonDogs) {
            if (cartoonDog.equals("Pluto")) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);

        System.out.println("\n--------TASK-6--------\n");

        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));

        boolean hasGarfield = false;
        boolean hasFelix = false;

        for (String cartoonCat : cartoonCats) {
            if (cartoonCat.equals("Garfield")) hasGarfield = true;
            else if (cartoonCat.equals("Felix")) hasFelix = true;
        }
        System.out.println(hasGarfield && hasFelix);

        System.out.println("\n--------TASK-7--------\n");

        double[] numbersTask7 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numbersTask7));

        for (double num : numbersTask7) {
            System.out.println(num);
        }

        System.out.println("\n--------TASK-8--------\n");

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int countLetters = 0;
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        int countSpecialCharacter = 0;
        int countSpace = 0;

        System.out.println(Arrays.toString(characters));

        for (char character : characters) {
            if (Character.isLetter(character)){
                countLetters ++;
                if (Character.isUpperCase(character)) countUpperCase ++;
                else countLowerCase ++;
            }
            else if (Character.isDigit(character)) countDigit ++;
            else if (Character.isWhitespace(character)) countSpace ++;
            else countSpecialCharacter ++;

        }
        System.out.println("Letters = " + countLetters);
        System.out.println("Uppercase letters = " + countUpperCase);
        System.out.println("Lowercase letters = " + countLowerCase);
        System.out.println("Digits = " + countDigit);
        System.out.println("Special characters =" + countSpecialCharacter);

        System.out.println("\n--------TASK-9--------\n");

        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(objects));

        int startsUpperCase = 0;
        int startsLowerCase = 0;
        int startsBOrP = 0;
        int containsBookOrPen = 0;
        for (String object : objects) {
            if(Character.isUpperCase(object.charAt(0))) startsUpperCase++;
            else startsLowerCase ++;

            if (object.toLowerCase().charAt(0) == 'b' || object.toLowerCase().charAt(0) == 'p') startsBOrP ++;
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) containsBookOrPen ++;
        }
        System.out.println("Elements starts with uppercase = " + startsUpperCase);
        System.out.println("Elements starts with lowercase = " + startsLowerCase);
        System.out.println("Elements starting with B or P = " + startsBOrP);
        System.out.println("Elements having ”book” or “pen” = " + containsBookOrPen);

        System.out.println("\n--------TASK-10--------\n");

        int[] numbersTask10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(numbersTask10));

        int greater10 = 0;
        int less10 = 0;
        int equals10 = 0;

        for (int n : numbersTask10) {
            if ( n > 10) greater10 ++;
            else if (n < 10) less10 ++;
            else equals10 ++;
        }
        System.out.println("Elements that are more than 10 = " + greater10);
        System.out.println("Elements that are less than 10 = " + less10);
        System.out.println("Elements that are 10 = " + equals10);

        System.out.println("\n--------TASK-11--------\n");

        int[] first = {5, 8, 13, 1, 2, 6, 9};
        int[] second = {9, 3, 67, 1, 0};
        int[] third = new int[5];

        for (int i = 0; i <= 4; i++) {

            if (i < Math.max(first.length, second.length)){
                third[i] = Math.max(first[i], second[i]);
            }
            else if (first.length > second.length){
                third[i] = first[i];
            }
            else{
                third[i] = second[i];
            }
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(third));

    }
}
