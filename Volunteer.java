public class Volunteer extends Member {


    private int volunteerHours;

    public Volunteer(int memberId, String name, String email,
                     String phone, int volunteerHours){


        super(memberId, name, email, phone);
        this.volunteerHours = volunteerHours;
    }

    @Override
    public void displayInfo(){

        super.displayInfo();
        System.out.println("Volunteer Hours: " + volunteerHours);
    }
}