import java.util.Date;

public class SalesContract extends BusinessContract {
    private double salesTaxAmount=0.05;
    private double recordingFee=100.00;
    private double processingFee=295.00;
    private boolean isFinanced=true;

    SalesContract(
            //BASE
            Date date,
            String customerName,
            String customerEmail,
            boolean isSold,
            double totalPrice
            //NEW
            double salesTaxAmount,
            double recordingFee,
            double processingFee,
            boolean isFinanced

    ){
        super(date, customerName, customerEmail,isSold, totalPrice);
        this.salesTaxAmount=salesTaxAmount;
        this.recordingFee=recordingFee;
        this.processingFee=processingFee;
        this.isFinanced=isFinanced;
    }
    public double getSalesTaxAmount(){
        return this.salesTaxAmount;
    }
    public double getRecordingFee(){
        return this.recordingFee;
    }
    public double getProcessingFee(){
        return this.processingFee;
    }
    public boolean isFinanced(){
        return this.isFinanced;
    }
    public double getMonthlyPayment(){
        return 0.0;
    }
    public double getTotalPrice(){
        return 0.0;
    }
}
