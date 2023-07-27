package chainofResponsiblity;

public class PayTmPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount >= 500 && amount <= 1000){
            System.out.println("Deposit in PayTm ....");
        }else {
            next.handlePayment(amount);
        }
    }
}
