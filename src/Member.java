public class Member {

    private int memberId;
    private String name;
    private String email;
    private String phone;

    //constructor
    public Member(int memberId, String name, String email, String phone){
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
//display member information
    public void displayInfo(){
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

    //Getters
    public int getMemberId() {
        return memberId;
    }
    public String getName() {
            return name;
        }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
