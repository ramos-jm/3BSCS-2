package seatwork;
public class GCash implements PaymentType{
    public String calculatePayment(){
        String output = new String();
        output += "Payment is Gcash\n";
        output += "Energy for Trees: 10 points";

        return output;
    }
}