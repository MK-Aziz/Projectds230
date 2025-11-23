// The Student class inherits attributes and methods from the Person class
public class Student extends Person {

    // Attributes specific to a student
    private String course;
    private double grade;

    // Constructor to initialize student details
    public Student(String name, int id, String course, double grade){
        // Calls the parent Person constructor to handle name and ID
        super (name,id);
        // Initializes the attributes specific to Student
        this.course = course;
        this.grade = grade;

    }
    // Method to check if the student passed (grade 50 or higher)
    public boolean isPass() {
        return grade >= 50;
    }

    // Overrides the abstract method from Person to display specific student info
    public void displayDetails() {
        System.out.println(
                "Student Record " +
                "| Name: " + getName() +
                "| ID: " + getId() +
                "| Course: " + course +
                "| Grade: " + grade
        );

        // Checking the method to print if they Passed or Failed
        String status = isPass() ? "Pass" : "Fail";

        // Prints the final status if they passed or failed
        System.out.println("Status: " + status);
        System.out.println(" ");
        }

    }

