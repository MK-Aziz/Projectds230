// Importing packages needed for the project
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//This is our interface class where we handle the user choice, add persons and show records
public class Ui {


    public static void main(String[] args) {

        // Store all record of the system inputs in one list
        ArrayList<Person> universityRecords = new ArrayList<>();


        // 4 Sample examples with course names added to the array as requested
        universityRecords.add(new Student("Abdulaziz Nadreen", 240011833, "DS230", 99));
        universityRecords.add(new Student("Jehad Al Ghamdi", 240040810, "SCI101", 100));
        universityRecords.add(new Student("Rakan Aldarwish", 240050050, "MATH150", 92));
        universityRecords.add(new Student("Noor AlJohani", 240123567, "DS231", 49));



        // Create one scanner for all user input
        Scanner scanner = new Scanner(System.in);

        // The main menu loop that keeps looping until option 5. exist is choosen
        while (true) {

            //Printing the options
            System.out.println("--- University Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Full time Employee");
            System.out.println("3. Add Part time Employee");
            System.out.println("4. Display All Records");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice (1-5): ");

            // We utilize "try catch" to catch invalid input
            try {

                // Scanner to take user input
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                /*
                 Handle the user's choice For each choice we will invoke the classes and the methods (inheritance)
                */
                switch (choice) {

                    // Case 1 for adding Student
                    case 1:
                        System.out.println("\n--- Add New Student ---");

                        System.out.print("Enter name: ");
                        String student_name = scanner.nextLine();

                        System.out.print("Enter ID: ");
                        int student_Id = scanner.nextInt();
                        scanner.nextLine(); //  New line after entering ID

                        System.out.print("Enter course: ");
                        String course = scanner.nextLine();

                        // Validation loop for grade will repeat until entering valid grade
                        double grade ;
                        do {
                            System.out.print("Enter grade (0-100): ");
                            grade = scanner.nextDouble();
                            if (grade < 0 || grade > 100) {
                                System.out.println("Error: Grade must be 0-100.");
                            }
                        } while (grade < 0 || grade > 100);

                        // Create and add the student
                        Student newStudent = new Student(student_name, student_Id, course, grade);
                        universityRecords.add(newStudent);
                        System.out.println("Student added successfully.");
                        break; // Exit the switch

                    // Case 2 for adding Full time Employee
                    case 2:
                        // Add the full time employee
                        System.out.println("\n--- Add Full Time Employee ---");

                        System.out.print("Enter name: ");
                        String ft_name = scanner.nextLine();

                        System.out.print("Enter ID: ");
                        int ft_id = scanner.nextInt();


                        // This is to validate a positive non zero
                        double salary;
                        do {
                            System.out.print("Enter Monthly Salary: ");
                            salary = scanner.nextDouble();

                            if ( salary < 0){
                                System.out.println("Please enter a positive salary :)");
                            }
                        } while ( salary < 0);


                        scanner.nextLine(); // Remove the leftover newline

                        universityRecords.add(new FullTimeEmployee(ft_name, ft_id, salary));
                        System.out.println("Full time employee added!");
                        break; // Exit the switch

                    //  Case 3: Add Part Time Employee
                    case 3:
                        System.out.println("\n--- Add Part Time Employee ---");

                        System.out.print("Enter Name: ");
                        String pt_name = scanner.nextLine();
                        System.out.print("Enter ID: ");
                        int pt_id = scanner.nextInt();


                        // This is to validate a positive non zero hourly rate
                        double hourlyRate;
                        do {
                            System.out.print("Enter Hourly Rate: ");
                            hourlyRate = scanner.nextDouble();
                            if ( hourlyRate <= 0){
                                System.out.println("Please enter a positive hourly rate :)");
                            }
                        } while ( hourlyRate <= 0);


                        //validating hours worked a positive non zero
                        int hoursWorked;
                        do {
                            System.out.print("Enter Hours Worked: ");
                             hoursWorked = scanner.nextInt();
                            if ( hoursWorked < 0) {

                                System.out.println("Error: Hours cannot be negative.");
                                System.out.print("Enter Hours Worked: ");
                                hoursWorked = scanner.nextInt();
                            }
                    }   while (hoursWorked < 0);
                        scanner.nextLine(); // Remove the leftover newline


                        universityRecords.add(new PartTimeEmployee(pt_name, pt_id, hourlyRate,hoursWorked));
                        System.out.println("Part time employee added!");

                        break; // Exit the switch

                    //  Case 4: Display All Records
                    case 4:
                        System.out.println("\n--- Displaying All Records ---");
                        if (universityRecords.isEmpty()) {
                            System.out.println("No records found.");
                        } else {
                            // Loop through the list and print details
                            // This is important in using Polymorphism
                            for (Person person : universityRecords) {
                                person.displayDetails(); // Polymorphism in action!
                            }
                        }
                        break; // Exit the switch

                    //  Case 5: Exit
                    case 5:
                        System.out.println("Exiting system. Goodbye.");
                        return; // Exit the main method (and the program)

                    // DEFAULT: To handle any Invalid Numbers
                    default:
                        System.out.println("Error: Invalid choice. Please enter a number between 1 and 5.");
                }

            } catch (InputMismatchException e) {
                //  Error handling: if user enters a non number for menu choice
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the bad input
            }
        }
    }
}