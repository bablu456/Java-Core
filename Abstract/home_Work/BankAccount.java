package Abstract.home_Work;

abstract class BankAccount {
    double balance;

    abstract void deposit(double balance);
    abstract void withdraw(double amount);

}
class SavingAccount extends BankAccount{
//    double balance;
 void deposit(double balance){
     this.balance = balance;
 }
 void withdraw(double amount){
     if(amount>0){
         this.balance = this.balance - amount;
     }
 }
 void ShowBalance(){
     System.out.println("Current Saving Account Balance Is : "+balance);
 }
}
class CurrentAccount extends BankAccount{
    void deposit(double amount){
        if(amount<=10000){
            this.balance = amount;
        }
    }
    void withdraw(double amount){
        if(amount<=10000){
            this.balance -= amount;
        }
    }
    void ShowBalance(){
        System.out.println("Current Acoount Balance Is : "+balance);
    }
    public static void main(String[] args){
        SavingAccount sv = new SavingAccount();
        sv.deposit(1000);
        sv.withdraw(500);
        sv.ShowBalance();


    }
}
