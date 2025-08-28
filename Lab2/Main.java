// Base class
class Animal {
    // Method in base class
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class
class Dog extends Animal {
    // Override the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog();

        // Call the overridden method
        myDog.makeSound(); // Output: Bark
    }
}
