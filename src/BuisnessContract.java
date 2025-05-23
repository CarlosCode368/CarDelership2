import java.util.Date;

abstract class BusinessContract {
    private Date date;
    private String customerName;
    private String customerEmail;
    private boolean isSold;
    private double totalPrice;
    private double monthlyPayment;
private Vehicle
    BusinessContract(
            Vehicle vehicle
            Date date,
            String customerName,
            String customerEmail,
            boolean isSold,
            double totalPrice

    ) {

    }

    public String toString() {
        return String.format("""
                        %s
                        %s
                        %s
                        %s
                        %.2f
                        %.2f
                        """,
                this.vehicle=vehicle,
                this.date,
                this.customerName,
                this.customerEmail,
                this.isSold,
                this.totalPrice

        );
    }
    public Date getDate(){
      return this.date;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getCustomerEmail() {
        return this.customerEmail;
    }
    public boolean IsSold() {
        return this.isSold;
    }

        abstract double getTotalPrice();
    abstract double getMonthlyPayment();
}


