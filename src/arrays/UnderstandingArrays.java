package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        String name;
        name = "John";
        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age);

        /*
        The new trend is to have multiple students information
         */
        String studentsName = "Alex, Abe, Yakeen";
        String agesAll = "20, 21, 22";

        //Can you print Abe's age only--> 21

        String[] names= {"Alex", "Abe", "Yakeen"};
        int[] ages = {20, 21,22};
        char[] favCharacters ={'A', '%', 'G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        //How to print all of ARRAY
        System.out.println(Arrays.toString(names));

        //HOW TO GET A SINGLE DATA FROM ARRAY
        System.out.println(names[1]);//Abe
        System.out.println(names[0]);//Alex


        //HOW TO UPDATE AN ELEMENT
        names[1] = "Abraham";
        System.out.println(Arrays.toString(names));

        //HOW TO LOOP ARRAY USING FORI LOOP
        for (int i = 0; i <= 2; i++) {
            System.out.println(names[i] + "'s age is " + ages[i] +" and his fav char is " + favCharacters[i] + ". His balance is " +
                    balances[i] + " and he likes java is " + doTheyLikeJava[i]);
        }

    }
}
