package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {
        int age = 45;
        System.out.println(age);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        System.out.println(dog1); // This is the location:Dog@29453f44
        System.out.println(dog2); // This is the location:Dog@5cad8086
        System.out.println(dog3); // This is the location:Dog@6e0be858

        dog1.bread = "puppy";

    }
}
