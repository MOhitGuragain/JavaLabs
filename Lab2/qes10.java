abstract class Appliance {
    // Abstract method
    public abstract void turnOn();
}

// Subclass Fan
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is now spinning.");
    }
}

// Subclass WashingMachine
class WashingMachine extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Washing machine is now running.");
    }
}

public class qes10 {
    public static void startAppliance(Appliance app) {
        app.turnOn(); // dynamic method dispatch
    }

    public static void main(String[] args) {
        // Create objects
        Appliance myFan = new Fan();
        Appliance myWasher = new WashingMachine();

        // Call method with different appliances
        startAppliance(myFan); // Executes Fan's turnOn()
        startAppliance(myWasher); // Executes WashingMachine's turnOn()
    }

}
