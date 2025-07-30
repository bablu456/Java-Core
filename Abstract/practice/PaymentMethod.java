package Abstract.practice;

public interface PaymentMethod {
    void pay(double amount);
}
class creditCard implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paying this amount through : "+amount);
    }
    public static void main(String[] args){
        creditCard c = new creditCard();
        c.pay(1000);
    }
}
