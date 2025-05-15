import java.util.Date;

public class LeaseContract extends BusinessContract {
    private double expectedEndingValue;
    private double leaseFee;

    LeaseContract(
            //BASE
            Vehicle vehicle,
            Date date,
            String customerName,
            String customerEmail,
            boolean isSold,
            double totalPrice,
            //NEW
            double expectedEndingValue,
            double leaseFee

    ){
        super(vehicle,date, customerName, customerEmail,isSold, totalPrice);
this.expectedEndingValue=expectedEndingValue;
this.leaseFee=leaseFee;
    }

    public double getSalesTaxAmount(){
        return this.salesTaxAmount;
    }
    double getTotalPrice(){
        return 0;
    }
    double getMonthlyPayment(){
        return 0;
    }

}
