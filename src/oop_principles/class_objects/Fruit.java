package oop_principles.class_objects;

public class Fruit {
    //Instance variables
    public static boolean hasColor;
    static {
        hasColor = true;
    }
    public String name;
    {
        shape = "Round";
        isSweet = true;

    }
    public String shape;
    public boolean isSweet;



    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        System.out.println(Fruit.hasColor);
        System.out.println(fruit1.name);
        System.out.println(fruit1.shape);
        System.out.println(fruit1.isSweet);
    }

}
