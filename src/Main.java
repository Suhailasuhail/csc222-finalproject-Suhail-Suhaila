import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    //Main method
    public static void main(String[] args) {

        //Creates a Scanner
        Scanner input = new Scanner(System.in);

//Creates a Volunteer object
        Volunteer volunteer = new Volunteer(

                101,
                "Ail Naji",
                "Alinaji@gmail.com",
                "540-335-9876",
                4);
//Creates a Leadership object
        Leadership leader = new Leadership(
                102,
                "Marwa Mohammadi",
                "marwamohammadi@gmail.com",
                "540-555-5678",
                "President");

        ArrayList<Member> members = new ArrayList<>();
        members.add(volunteer);
        members.add(leader);

        for (Member member : members) {
            member.displayInfo();
            System.out.println();
        }

        input.close();
    }
}