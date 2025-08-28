// Base class
class LivingBeing {
    public void existence() {
        System.out.println("I exist as a living being.");
    }
}

// Derived class from LivingBeing
class Animal extends LivingBeing {
    public void movement() {
        System.out.println("I can move.");
    }
}

// Derived class from Animal
class Bird extends Animal {
    public void fly() {
        System.out.println("I can fly.");
    }
}

public class ques4 {
    public static void main(String[] args) {
        // Create a Bird object
        Bird myBird = new Bird();

        // Call methods from all levels
        myBird.existence(); // from LivingBeing
        myBird.movement(); // from Animal
        myBird.fly(); // from Bird
    }

}
