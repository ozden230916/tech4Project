package oop_principles.class_objects;

public class Student {
    //Please call default constructor
    public Student(){

    }
    /*
    Define instance variables of student class as below
    firstName, lastName, age, dateOfBirth, gender, address, height, weight,
    email, ID
     */

    public String firstName;
    public String lastName;
    public int age;
    public String dateOfBirth;
    public String gender;
    public String address;
    public  double height;
    public double weight;
    public String email;
    public int id;

    //Define Student behaviors-functions
    //Study, eat, sleep

    public void study(){
        System.out.println("Student studies");

    }
    public void eat(){
        System.out.println("Student eats");

    }
    public void sleep(){
        System.out.println("Student sleeps");

    }

    //Override toString() method from object class

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
