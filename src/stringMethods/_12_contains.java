package stringMethods;

import java.util.Scanner;

public class _12_contains {
    public static void main(String[] args) {
        String s = "Good Morning";

        System.out.println(s.contains("Good"));
        System.out.println(s.contains(""));
        System.out.println(s.contains("123"));


        /*
        Ask user to enter an address
        If address contains "chicago" in any way, then print "You are in the club"
        else, print "You are not in the club"

        Chicago, CHICAGO, cHIcaGO
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an address");
        String address = input.nextLine();

        System.out.println(address.toLowerCase().contains("chicago") ? "You are in the club" : "You are not in the club");
    }




}
