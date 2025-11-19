public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        System.out.println(
            "Full-Time Employee | Name: " + getName()  +
            "| ID: " + getId() +
            "|Monthly Salary: " + calculateSalary()
        );
    }
}
