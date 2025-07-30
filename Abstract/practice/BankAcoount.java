package Abstract.practice;

abstract class BankAcoount {
    double balance;
    BankAcoount(double balance){
        this.balance = balance;
    }
    void deposit(){
        System.out.println("Deposit Sucessful ");
    }
    abstract void withdraw(double money);

}
class SavingAccount extends BankAcoount{
    SavingAccount(double balance){
        super(balance);
    }
    void deposit(double add){
        balance += add;
        System.out.println("Balance deposited successfully !! ");
    }
    void withdraw(double money){
        balance -= money;
        System.out.println("Money Withdrawal Succesfull !! ");
    }
    public static void main(String[] args){
        SavingAccount s = new SavingAccount(100);
        s.deposit(1000);
        s.withdraw(500);
    }

}
