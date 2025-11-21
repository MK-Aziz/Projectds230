
public class Student extends Person {

    private String course;
    private double grade;



    // Calling the parent constructor super to handle name and id, and then adding course and grade
    public Student(String name, int id, String course, double grade){
        super (name,id);
        this.course = course;
        this.grade = grade;


    }
    //Method to check if the student passed.
    public boolean isPass() {
        return grade >= 50;
    }

    // Called the displayDetails method from person to demonstrate polymorphism
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
        System.out.println("Status: " + status);
        System.out.println(" ");
        }




    }

