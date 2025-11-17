
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
        System.out.println("---Student Record---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);

        String status = isPass() ? "Pass" : "Fail";
        System.out.println("Status: " + status);
        }




    }

