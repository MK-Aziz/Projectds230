// Full-time employee with fixed monthly salary
public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor sets name, ID, and salary
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Salary for full time employee is the monthly amount
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
    // Displays full time employee information
    @Override
    public void displayDetails() {
        System.out.println(
            "Full-Time Employee | Name: " + getName()  +
            " | ID: " + getId() +
            " | Monthly Salary: " + calculateSalary()
        );
        System.out.println("");
    }
}
