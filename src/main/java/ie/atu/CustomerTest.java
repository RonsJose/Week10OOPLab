package ie.atu;

//Testing the customer class
public class CustomerTest {
    public static void main(String[] args) {

        // Sets the data values by sending them via the parameterised constructors
        Customer part1Customer = new Customer(
                "Alice Smith",
                "1 High Street",
                "0851234567",
                1001,
                true
        );

        //Sets the data using the setters and getters
        Customer part2Customer = new Customer();
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 Low Street");
        part2Customer.setPhoneNumber("0867654321");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);

        //Prints the output with tostring
        System.out.println(part1Customer);
        System.out.println(part2Customer);
    }
}
