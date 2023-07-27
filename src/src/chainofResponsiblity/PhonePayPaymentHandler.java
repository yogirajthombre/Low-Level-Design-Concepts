package chainofResponsiblity;

public class PhonePayPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount >= 500){
            System.out.println("Process through PhonePay ....");
        }else {
            next.handlePayment(amount);
        }
    }
}
