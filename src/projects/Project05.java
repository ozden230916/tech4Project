package projects;

import utilities.ScannerHelper;
import utilities.StringHelper;
import java.util.Scanner;

public class Project05 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------");

        String str = ScannerHelper.getAStringFromUser();

        if (str.length() >= 8)System.out.println(str.substring(str.length() - 4) + str.substring(4, str.length()-4) + str.substring(0,4));
        else System.out.println("This String does not have 8 characters");

        System.out.println("\n--------TASK-2--------");

        String sentence = ScannerHelper.getAStringFromUser();
        if(sentence.trim().contains(" ")){ //sentence.trim().indexOf(' ') > 0
            String firstWord = sentence.substring(0, sentence.indexOf(' '));
            String lastWord = sentence.substring(sentence.lastIndexOf(' ') + 1);
            String middle = sentence.substring(sentence.indexOf(' ') , sentence.lastIndexOf(' ') + 1);
            System.out.println(lastWord + middle + firstWord);
        }
        else {
            System.out.println("This sentence does not have 2 or more words to swap");
        }

        System.out.println("\n--------TASK-3--------");

        String s = ScannerHelper.getAStringFromUser();
        System.out.println(s.replace("stupid", "nice").replace("idiot", "nice"));

        System.out.println("\n--------TASK-4--------");

        String name = ScannerHelper.getANameFromUser();
        System.out.println(name.length() > 2 ? StringHelper.getMiddle(name) : "Invalid input!!" );

        System.out.println("\n--------TASK-5--------");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a country");
        String country = input.nextLine();

        System.out.println(country.length() > 5 ? country.substring(2, country.length() -2 ) : "Invalid input!!!");

        System.out.println("\n--------TASK-6--------");

        String address = ScannerHelper.getAStringFromUser();//Please enter your address

        System.out.println(address.replace('a', '*').replace('A', '*').replace('e', '#').replace('E', '#').
                           replace('i', '+').replace('I', '+').replace('u', '$').
                           replace('U', '$').replace('o', '@').replace('O', '@'));

        System.out.println("\n--------TASK-7--------");

        int n1 = (int) (Math.random() * 26);
        int n2 = (int) (Math.random() * 26);

        System.out.println("Random number1 = " + n1);
        System.out.println("Random number2 = " + n2);

        String s1 = "";
        for (int i = Math.min(n1, n2); i <= Math.max(n1, n2) ; i++) {
            if (i % 5 != 0) s += i + " - ";
        }
        System.out.println(s1.substring(0, s1.length() - 3));

    }
}
