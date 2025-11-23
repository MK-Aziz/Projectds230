// Parent class that acts like a blueprint for the subclasses like Student and Employee
public abstract class Person {

    /* This is the parent class Person which all other subclasses inherit from
    Those are the attributes to store person details */
    private String name;
    private int id;

    // Constructor to initialize the object's attributes.
    public Person(String name, int id){

        this.name = name;
        this.id = id;
    }

    // Method to retrieve the name
    public String getName() {
        return name;
    }

    // Method to retrieve the ID
    public int getId() {
        return id;
    }

    /* Here we have a base method that behaves differently for each time it is in different object
     Also to make it mandetory for subclasses to create their own display */
    public abstract void displayDetails();

}
