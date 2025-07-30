package Abstract.home_Work;

 interface Payment_System {
    void pay(double amount);
}
class CreditCard implements Payment_System{
    @Override
    public void pay(double amount) {
        System.out.println("Paying With Credit Card Amount : "+amount);
    }
}
class Upi implements Payment_System{
     public void pay(double amount){
         System.out.println("Paying with UPI Amount : "+amount);
     }
}
class Cash implements Payment_System{
     public void pay(double amount){
         System.out.println("Paying with Cash Amount : "+amount);
     }
}
class main{
     public static void main(String[] args){
         CreditCard c = new CreditCard();
         c.pay(1000);
         Cash cash = new Cash();
         cash.pay(500);
         Upi u  = new Upi();
         u.pay(300);
     }
}
