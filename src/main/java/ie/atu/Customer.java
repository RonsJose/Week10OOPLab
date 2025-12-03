package ie.atu;

//Child class of person & parent class of preferredcustomer so its both a sub and super class
public class Customer extends Person {

    //declaring variables
    private int customerNumber;
    private boolean mailingList;

    //constructor when parameters are passed
    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    //Default constructor
    public Customer() {
        super();
        this.customerNumber = 0;
        this.mailingList = false;
    }

    //Getters and setters
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    //tostring thats overriden to make it look nicer
    @Override
    public String toString() {
        return "Customer{" +
                "person=" + super.toString() +
                "customerNumber=" + customerNumber +
                ", mailingList=" + mailingList +
                '}';
    }
}
