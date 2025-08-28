class Shape {
    public double area() {
        System.out.println("Area of shape is undefined.");
        return 0;
    }
}

// Subclass
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the area() method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class qes5 {
    public static void main(String[] args) {
        // Create a Circle object
        Circle c = new Circle(5.0);

        // Call area() method
        System.out.println("Area of Circle: " + c.area());
    }
}
