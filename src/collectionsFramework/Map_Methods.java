package collectionsFramework;

import java.util.*;

public class Map_Methods {
    public static void main(String[] args) {
        HashMap<String, String> ourFavorites = new HashMap<>();
        ourFavorites.put("Day", "Friday");
        ourFavorites.put("Color", "Black");
        ourFavorites.put("City", "Chicago");
        ourFavorites.put("Car", "Mercedes");
        ourFavorites.put("Pat", "Turtle");

        //Keys : Day, Color, City, Car, Pet
        //Values: Friday, Black, Chicago, Lexus, Turtle

        Set<String> keys = ourFavorites.keySet();
        System.out.println(keys);//[Pat, Car, Color, City, Day]

        Collection<String> values = ourFavorites.values();
        System.out.println(values);//[Turtle, Mercedes, Black, Chicago, Friday]

        System.out.println(values.stream().filter(element -> element.length() > 5).count());//4
        System.out.println(keys.stream().filter(element -> element.toLowerCase().startsWith("c")).count());//3

        /*
        Entry = key-value
         */
        Set<Map.Entry<String, String >> entries = ourFavorites.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println("My favorite " + entry.getKey() + " is " + entry.getValue());

        }


    }
}
