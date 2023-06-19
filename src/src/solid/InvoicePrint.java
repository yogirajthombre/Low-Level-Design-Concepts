package solid;

public class InvoicePrint {
    Invoice invoice;
    public InvoicePrint(Invoice invoice){
        this.invoice = invoice;
    }
    public void printName(){
        System.out.println(invoice.name);
    }
}
