
public class Student extends Person {

    private String course;
    private double grade;




    public Student(String name, int id, String course, double grade){
        super (name,id);
        this.course = course;
        this.grade = grade;


    }

    public boolean isPass() {
        return grade >= 50;
    }

    public void displayDetails() {
        System.out.println(
                "Student Record " +
                "| Name: " + name +
                "| ID: " + id +
                "| Course: " + course +
                "| Grade: " + grade
        );

        String status = isPass() ? "Pass" : "Fail";
        System.out.println("Status: " + status);
        System.out.println(" ");
        }




    }

