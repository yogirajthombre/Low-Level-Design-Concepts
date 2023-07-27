package chainofResponsiblity;

/*** Used to delegate task to correct doer of the task ***/
public class Main {
    public static void main(String[] args) {
        BankPaymentHandler bankPaymentHandler = new BankPaymentHandler();
        PayTmPaymentHandler payTmPaymentHandler = new PayTmPaymentHandler();
        PhonePayPaymentHandler phonePayPaymentHandler = new PhonePayPaymentHandler();
        bankPaymentHandler.setNext(payTmPaymentHandler);
        payTmPaymentHandler.setNext(phonePayPaymentHandler);

        bankPaymentHandler.handlePayment(100);
        bankPaymentHandler.handlePayment(600);
        bankPaymentHandler.handlePayment(1200);
    }
}
