// Employee is an abstract class that extends Person
// Cannot be created directly (only full-time or part-time)
 abstract class Employee extends Person {

    // Calls the Person constructor
    public Employee(String name, int id) {
        super(name, id);
    }

    // Each employee type calculates salary differently
    public abstract double calculateSalary();

    // Each employee type shows details in its own way
    @Override
    public abstract void displayDetails();
}
