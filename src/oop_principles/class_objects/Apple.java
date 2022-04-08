package oop_principles.class_objects;

public class Apple {
    /*
    class members
    1.attributes
    2.methods
    3.blocks
    4.constructors - helps us to create objects
     */
    //this is default constructor
    public Apple(){
        //Block of code
    }
    //One-arg constructor
    public Apple(int number){
    }
    //Define instance variables
    public String color;
    public String taste;
    public double price;

    public String toString(){
        return "Apple{" +
                "color='" + color + "', " +
                "taste='" + taste + "', " +
                "price='" + price + "'}" ;

    }



}
