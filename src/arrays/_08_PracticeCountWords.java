package arrays;

public class _08_PracticeCountWords {
    public static void main(String[] args) {

        System.out.println("\n-----TASK-1-----\n");

        /*
        TASK -1
        Assume you are given a string as below
        Please find jow many words you have in the given String

        String s1 = "Today is Tuesday";

        RESULT:3

         */
        String s1 = "Today is Tuesday";

        String[] words = s1.split(" ");
        System.out.println(words.length);

        System.out.println("\n-----TASK-2-----\n");
        /*
        TASK-2
        Assume you are given a String as below
        Please find how many words you have in the given String starts with A or a

        String s2 = "Some countries I visited were Argentina, Andorra, Belgium and Malta";

        RESULT:
        3
         */

        String s = "Some countries I visited were Argentina, Andorra, Belgium and Malta";

        int countA = 0;
        String[] words2 = s.split(" ");

        for (String element : words2) {
            if (element.toLowerCase().startsWith("a")) countA ++;
        }
        System.out.println(countA);


    }
}
