package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in); //creating an object to use methods
        System.out.println("Where is your userAddress : ");//What we want from user
        String userAddress = inputReader.nextLine();//Storing data taken from user
        System.out.println("User address  is = ".concat("\"" + userAddress + "\""));//Printing variable

    }
}

