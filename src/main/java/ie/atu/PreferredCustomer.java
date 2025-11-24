package ie.atu;

public class PreferredCustomer extends Customer{
    private int loyaltyPoints;
    private double discountLevel;

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        addLoyaltyPoints(loyaltyPoints);
    }

    public PreferredCustomer() {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }

    private void updateDiscountLevel(){
        if(loyaltyPoints > 500){
            discountLevel = 0.00;
        }
        else if(loyaltyPoints >= 500 && loyaltyPoints <= 999)
        {discountLevel = 0.05; }
        else if (loyaltyPoints >= 100 && loyaltyPoints <= 1499) {
            discountLevel = 0.06;
        }
        else if (loyaltyPoints >= 1500 && loyaltyPoints <= 1999) {
            discountLevel = 0.07;
        }
        else if (loyaltyPoints >= 2000) {
            discountLevel = 0.1;
        }
    }

    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                "loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';
    }
}
