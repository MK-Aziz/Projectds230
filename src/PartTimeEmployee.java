
// Part-time employee paid by the hour
public class PartTimeEmployee extends Employee {
    private double hourlyRate; // payment per hour
    private int hoursWorked; // total hours worked


    // Constructor sets name, ID, rate, and hours
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    // Getter for hourly rate
    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setter for hourly rate
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Getter for hours worked
    public int getHoursWorked() {
        return hoursWorked;
    }

    // Setter for hours worked
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Salary = hourly rate × hours worked
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Displays part-time employee information
    @Override
    public void displayDetails() {
        System.out.println(
            "Part-Time Employee | Name: " + getName() +
            " | ID: " + getId() +
            " | Hourly: " + hourlyRate +
            " | Hours: " + hoursWorked +
            " | Salary: " + calculateSalary()
        );
        System.out.println("");
    }
}
