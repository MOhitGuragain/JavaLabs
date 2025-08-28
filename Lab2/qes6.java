class Employee {
    public double calculateSalary() {
        System.out.println("Salary calculation for generic employee.");
        return 0;
    }
}

// Subclass for Full-Time Employees
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary; // Fixed monthly salary
    }
}

// Subclass for Part-Time Employees
class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate; // Pay based on hours worked
    }
}

public class qes6 {
    public static void main(String[] args) {
        // Polymorphism: Employee reference can point to subclass objects
        Employee emp1 = new FullTimeEmployee(30000); // full-time
        Employee emp2 = new PartTimeEmployee(50, 200); // part-time

        // Calls overridden methods depending on actual object type
        System.out.println("Full-time Employee Salary: " + emp1.calculateSalary());
        System.out.println("Part-time Employee Salary: " + emp2.calculateSalary());
    }
}
