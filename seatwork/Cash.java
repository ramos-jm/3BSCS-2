package seatwork;
public class Cash implements PaymentType{
    public String calculatePayment(){
        String output = new String();
        output += "Payment is Cash";
        output += "No incentives";

        return output;
    }
}