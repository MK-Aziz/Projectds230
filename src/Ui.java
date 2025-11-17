import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ui {

    public static void main(String[] args) {

        // Store all records in one list
        ArrayList<Person> universityRecords = new ArrayList<>();

        // Create one scanner for all input
        Scanner scanner = new Scanner(System.in);

        // The main menu loop
        while (true) {

            System.out.println("--- University Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Full-time Employee");
            System.out.println("3. Add Part-time Employee");
            System.out.println("4. Display All Records");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice (1-5): ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                // Handle the user's choice
                switch (choice) {

                    // This is the code for adding new student
                    case 1:
                        System.out.println("\n--- Add New Student ---");

                        System.out.print("Enter name: ");
                        String student_name = scanner.nextLine();

                        System.out.print("Enter ID: ");
                        int student_Id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        System.out.print("Enter course: ");
                        String course = scanner.nextLine();

                        // Validation loop for grade
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

                    // --- CASE 2: ADD FULL-TIME EMPLOYEE ---

                    case 2:
                        // I modified here to add the full time employee string instead of add
                        System.out.println("\n--- Add Full-Time Employee ---");

                        System.out.print("Enter employee name: ");
                        String ft_name = scanner.nextLine();

                        System.out.print("Enter ID: ");
                        int ft_id = scanner.nextInt();

                        double salary;
                        do {
                            System.out.print("Enter Monthly Salary: ");
                             salary = scanner.nextDouble();

                            if ( salary < 0){
                                System.out.println("Please enter a positive salary :)");
                            }
                        } while ( salary < 0);


                        scanner.nextLine();

                        universityRecords.add(new FullTimeEmployee(ft_name, ft_id, salary));
                        System.out.println("Full-time employee added!");
                        break; // Exit the switch

                    // --- CASE 3: ADD PART-TIME EMPLOYEE ---
                    case 3:

                        System.out.print("Enter Name: ");
                        String pt_name = scanner.nextLine();
                        System.out.print("Enter ID: ");
                        int pt_id = scanner.nextInt();
                        System.out.print("Enter Hourly Rate: ");
                        double rate = scanner.nextDouble();
                        System.out.print("Enter Hours Worked: ");
                        int hours = scanner.nextInt();
                        scanner.nextLine();
                        break; // Exit the switch

                    // --- CASE 4: DISPLAY ALL RECORDS ---
                    case 4:
                        System.out.println("\n--- Displaying All Records ---");
                        if (universityRecords.isEmpty()) {
                            System.out.println("No records found.");
                        } else {
                            // Loop through the list and print details
                            for (Person person : universityRecords) {
                                person.displayDetails(); // Polymorphism in action!
                            }
                        }
                        break; // Exit the switch

                    // --- CASE 5: EXIT ---
                    case 5:
                        System.out.println("Exiting system. Goodbye.");
                        scanner.close(); // Close the scanner
                        return; // Exit the main method (and the program)

                    // --- DEFAULT: HANDLE INVALID NUMBERS ---
                    default:
                        System.out.println("Error: Invalid choice. Please enter a number between 1 and 5.");
                }

            } catch (InputMismatchException e) {
                // --- ERROR HANDLING: CATCHES NON-NUMBER INPUT ---
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the bad input
            }
        }
    }
}