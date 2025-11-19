public abstract class Person {

    /*
    This is the parent class Person which all other subclasses inherit from

     */

    //Those are the attributes as requested by the project for name and id
    public String name;
    public int id;

    public Person(String name, int id){

        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    // Here we have a base method that behaves differently for each time it is in different object
    public abstract void displayDetails();


}
