package Java_Oops.interface_p;

public interface PaymentGateway {
    void pay(double amount);
}
class UPIPayment implements PaymentGateway{
    public void pay(double amount){
        System.out.println(amount+" Payment Sucessfull !! "+amount);
    }
}
class CreditCardPayment implements PaymentGateway{
    public void pay(double amount){
        double charge = amount * 0.02;
        double totalAmount = amount - charge;
        System.out.println("Processing Credit Payment. Amount : "+totalAmount);
    }
    public static void main(String[] args){
        UPIPayment up = new UPIPayment();
        up.pay(1000);
        CreditCardPayment cr = new CreditCardPayment();
        cr.pay(1000);

    }
}

