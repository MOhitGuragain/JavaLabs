class Vehicle {
    protected int speed; // protected member

    // Constructor
    public Vehicle(int speed) {
        this.speed = speed;
    }

    // Display current speed
    public void displaySpeed() {
        System.out.println("Current speed: " + speed + " km/h");
    }
}

// Derived class
class Bike extends Vehicle {

    // Constructor
    public Bike(int speed) {
        super(speed); // call parent constructor
    }

    // Method to increase speed
    public void increaseSpeed(int increment) {
        speed += increment; // accessing protected member directly
        System.out.println("Speed increased by " + increment + " km/h");
    }
}

public class qes9 {
    public static void main(String[] args) {
        // Create a Bike object with initial speed
        Bike myBike = new Bike(40);

        // Display initial speed
        myBike.displaySpeed();

        // Increase speed
        myBike.increaseSpeed(20);

        // Display updated speed
        myBike.displaySpeed();
    }
}
