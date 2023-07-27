package chainofResponsiblity;

public class BankPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount <= 500){
            System.out.println("Deposit in Bank ....");
        }else {
            next.handlePayment(amount);
        }
    }
}
