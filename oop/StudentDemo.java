/*
Day 4: Class and Object Example

Class:
- A blueprint to create objects

Object:
- An instance of a class

This program creates a Student class and uses an object
to store and display student details.
*/


class Student {
    //attributes (data)

    String name;
    int age;

    //Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(); //creating an object of Student class

        //assings values
        s1.name = "Sasindu";
        s1.age = 23;

        //call method

        s1.display();
    }
}