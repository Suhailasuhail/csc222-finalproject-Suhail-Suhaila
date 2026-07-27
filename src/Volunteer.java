public class Volunteer extends Member {


    private int volunteerHours;

    //constructor
    public Volunteer(int memberId, String name, String email,
                     String phone, int volunteerHours){

        super(memberId, name, email, phone);
        this.volunteerHours = volunteerHours;
    }

    //Getters
    public int getVolunteerHours(){
        return volunteerHours;
    }

    //Setters
    public void setVolunteerHours(int volunteerHours){
        this.volunteerHours = volunteerHours;
    }

    @Override
    public void displayInfo(){

        super.displayInfo();
        System.out.println("Volunteer Hours: " + volunteerHours);
    }
}