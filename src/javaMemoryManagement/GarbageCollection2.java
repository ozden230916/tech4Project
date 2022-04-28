package javaMemoryManagement;

public class GarbageCollection2 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog);//Dog@29453f44

        dog = null;
        System.gc();
    }
}
