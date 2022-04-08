package collections;

import java.util.*;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Create a list to store below data
        cities

        Berlin
        Chicago
        Dallas
        Miami
        Brugge
        Kiev

        Print the list
        Then, remove Miami and Dallas
        Print the list again

        RESULT:
        [Berlin, Chicago, Dallas, Miami, Brugge, Kiev]
        [Berlin, Chicago, Brugge, Kiev]
         */
        String[] cities = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};

        List<String> citiesList1 = new LinkedList<>(Arrays.asList(cities));
        System.out.println(citiesList1);

        citiesList1.remove("Miami");
        citiesList1.remove("Dallas");
        System.out.println(citiesList1);

        System.out.println("----second way----");
        List<String> countriesList2 = new LinkedList<>();
        Collections.addAll(countriesList2, cities);
        System.out.println(countriesList2);

        countriesList2.remove("Miami");
        countriesList2.remove("Dallas");
        System.out.println(countriesList2);

        System.out.println("----third way----");
        List<String> countries3 = new LinkedList<>();
        for (String city : cities) {
            countries3.add(city);
        }


    }
}
