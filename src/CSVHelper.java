import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CSVHelper {
    public static void exportToCSV(ArrayList<Member> members){

        try {
            PrintWriter writer = new PrintWriter("members.CSV");

            //header
            writer.println("memberId,name,email,phone,memberType, volunteerHours, position");

            //one row for each member
            for (Member member: members) {
                //volunteer information
                if (member instanceof Volunteer) {
                    Volunteer volunteer = (Volunteer) member;

                    writer.println(
                            member.getMemberId() + "," +
                                    member.getName() + "," +
                                    member.getEmail() + "," +
                                    member.getPhone() + "," +
                                    "Volunteer" + "," +
                                    volunteer.getVolunteerHours() + ",");
                }

                //leadership information
                else if (member instanceof Leadership) {
                    Leadership leader = (Leadership) member;

                    writer.println(
                            member.getMemberId() + "," +
                                    member.getName() + "," +
                                    member.getEmail() + "," +
                                    member.getPhone() + "," +
                                    "Leadership" + ",," +
                                    leader.getPosition());
                }
            }

        //closes the CSV file
                writer.close();
                System.out.println("Member information export successfully to members.csv");

            }catch (FileNotFoundException e) {
                System.out.println("Error creating the CSV file.");
            }
         }
    }
