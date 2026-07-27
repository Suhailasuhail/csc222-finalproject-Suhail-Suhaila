public class Leadership extends Member
{
    private String position;

    //constructor
    public Leadership(int memberId, String name, String email,
                      String phone, String position)
    {
        super(memberId, name, email, phone);
        this.position = position;
    }

    //Getters
    public String getPosition(){
        return position;
    }

    //Setter
    public void setPosition(String position){
        this.position = position;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + position);
    }
}