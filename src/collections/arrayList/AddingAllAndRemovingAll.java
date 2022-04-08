package collections.arrayList;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {
        System.out.println("\n-----Task-1-----\n");

       /*
        TASK-1
        Create an ArrayList of germanCars and add below items
        BMW
        Mercedes
        Volkswagen

        Then print the list

        RESULT:
        German cars = [BMW, Mercedes, Volkswagen]
         */

        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");
        germanCars.add("Audi");

        System.out.println("German cars = " + germanCars);

        System.out.println("\n-----Task-2-----\n");
        /*
        TASK-1
        Create an ArrayList of japanCars and add below items
        Honda
        Toyota
        Lexus

        Then print the list

        RESULT:
        Japan cars = [Honda, Toyota, Lexus]
         */


        ArrayList<String> japaneseCars = new ArrayList<>();
        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");

        System.out.println("Japan cars = " + japaneseCars);

        System.out.println("\n-----Task-3-----\n");
        /*
        TASK-3
        Create an ArrayList of luxuryCars and store below cars
        Maserati
        Tesla
        Range Rover
        Jaguar

        Then print the list

        RESULT:
        Luxury cars = [Maserati, Tesla, Range Rover, Jaguar]
         */

        ArrayList<String> luxuryCars = new ArrayList<>();
        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars = " + luxuryCars);

        System.out.println("\n-----Put all together-------\n");
        ArrayList<String> inventory = new ArrayList<>();
        inventory.addAll(germanCars);
        System.out.println(inventory);//[BMW, Mercedes, Volkswagen]

        inventory.addAll(luxuryCars);
        System.out.println(inventory);//[BMW, Mercedes, Volkswagen, Maserati, Tesla, Range Rover, Jaguar]

        inventory.addAll(1, japaneseCars);
        System.out.println(inventory);//[BMW, Honda, Toyota, Lexus, Mercedes, Volkswagen, Maserati, Tesla, Range Rover, Jaguar]

        inventory.removeAll(japaneseCars);
        System.out.println(inventory);

        /*
        Remove Tesla and BMW
         */
        ArrayList<String> carsTobeRemoved = new ArrayList<>();
        carsTobeRemoved.add("BMW");
        carsTobeRemoved.add("Tesla");

        inventory.removeAll(carsTobeRemoved);
        System.out.println(inventory);


    }
}
