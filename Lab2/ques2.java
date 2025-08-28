// Base class
class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Derived class
class Student extends Person {
    String grade;

    // Constructor for Student
    public Student(String name, int age, String grade) {
        super(name, age); // call base class constructor
        this.grade = grade;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class ques2 {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Mohit", 22, "A");

        // Display student details
        student1.display();
    }
}
