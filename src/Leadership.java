public class Leadership extends Member
{
    private String position;

    public Leadership(int memberId, String name, String email,
                      String phone, String position)
    {
        super(memberId, name, email, phone);
        this.position = position;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Position: " + position);
    }
}