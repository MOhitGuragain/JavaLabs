class Vehicle {
    // Method in Vehicle
    public void start() {
        System.out.println("Vehicle started");
    }
}

// Derived class
class Car extends Vehicle {
    // Method specific to Car
    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class ques3 {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();

        // Call methods
        myCar.start(); // inherited from Vehicle
        myCar.playMusic(); // specific to Car
    }
}
