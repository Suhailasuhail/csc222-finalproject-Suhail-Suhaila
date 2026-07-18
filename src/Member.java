public class Member {

    private int memberId;
    private String name;
    private String email;
    private String phone;

    public Member(int memberId, String name, String email, String phone){
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void displayInfo(){
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
