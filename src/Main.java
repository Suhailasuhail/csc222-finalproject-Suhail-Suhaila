import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    //Main method
    public static void main(String[] args) {

        //Creates a Scanner
        Scanner input = new Scanner(System.in);
//Creates an ArrayList
        ArrayList<Member> members = new ArrayList<>();

        //Creates a Volunteer object
        Volunteer volunteer = new Volunteer(
                101, "Ail Naji", "Alinaji@gmail.com", "540-335-9876", 4);
//Creates a Leadership object
        Leadership leader = new Leadership(102, "Marwa Mohammadi", "marwamohammadi@gmail.com", "540-555-5678", "President");
//Add the objects to the ArrayList
        members.add(volunteer);
        members.add(leader);

        int choice;
        do {
        System.out.println();
        System.out.println("She Leads Tomorrow Member Management System");
        System.out.println("1. Add Volunteer");
        System.out.println("2. Add Leadership Member");
        System.out.println("3. View All Members");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        choice = input.nextInt();
        input.nextLine();

        //Add New volunteer
        if (choice == 1) {
            System.out.println("Add Volunteer selected.");

            System.out.println("Enter Member Id: ");
            int memberId = input.nextInt();
            input.nextLine();

            System.out.println("Enter Name: ");
            String name = input.nextLine();
            System.out.println("Enter Email: ");
            String email = input.nextLine();
            System.out.println("Enter Phone: ");
            String phone = input.nextLine();

            System.out.print("Enter Volunteer Hours: ");
            int volunteerHours = input.nextInt();
            input.nextLine();

            Volunteer newVolunteer = new Volunteer(memberId, name, email, phone, volunteerHours);
            members.add(newVolunteer);
            System.out.println("Volunteer added successfully. ");
        }

        //Add a new Leadership member
        else if (choice == 2) {
            System.out.println("Add Leadership Member selected.");

            System.out.print("Enter Member ID: ");
            int memberId = input.nextInt();
            input.nextLine();

            System.out.print("Enter Name: ");
            String name = input.nextLine();
            System.out.print("Enter Email: ");
            String email = input.nextLine();
            System.out.print("Enter Phone: ");
            String phone = input.nextLine();
            System.out.print("Enter Position: ");
            String position = input.nextLine();

            Leadership newLeader = new Leadership(memberId, name, email, phone, position);
            members.add(newLeader);
            System.out.println("Leadership member added successfully.");
        }

// Displays all stored Member objects
        else if (choice == 3) {
            System.out.println();
            System.out.println("All Members:");
            System.out.println();

            for (Member member : members) {
                member.displayInfo();
                System.out.println();
            }
        }

        // Ends the program
        else if (choice == 4) {

            System.out.println("Program ended.");
        }

        // Invalid menu option
        else {

            System.out.println("Invalid choice. Please try again.");

        }

        } while (choice != 4);

        // Closes the Scanner
        input.close();

    }
}