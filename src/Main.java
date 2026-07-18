public class Main {

    public static void main(String[] args){

        Volunteer volunteer = new Volunteer(

                101,
                "Ail Naji",
                "Alinaji@gmail.com",
                "540-335-9876",
                4);

        Leadership leader = new Leadership(
                102,
                "Marwa Mohammadi",
                "marwamohammadi@gmail.com",
                "540-555-5678",
                "President");


        volunteer.displayInfo();
        System.out.println();
        leader.displayInfo();
    }
}
