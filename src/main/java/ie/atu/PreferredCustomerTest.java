package ie.atu;

//Testing the preferred customer class
public class PreferredCustomerTest
{
    public static void main(String[] args)
    {
        //Setting the values using the parameterised constructor
        PreferredCustomer pc = new PreferredCustomer();
        pc.setName("Charlie Customer");
        pc.setAddress("3 Middle Road");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);

        //Prints out the tostring
        System.out.println(pc);

        //Updates the amount of points the preferred customer has
        pc.addLoyaltyPoints(700);
        System.out.println(pc);//Prints out the updated values for discount and points

        pc.addLoyaltyPoints(800);//Updates again
        System.out.println(pc);//Prints the new values for discount and points
    }
}
