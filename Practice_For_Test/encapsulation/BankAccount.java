package Practice_For_Test.encapsulation;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber,String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }
    void deposit(double amount){
        if(amount>0){
            this.balance = amount;
        }
    }
    void withdrawal(double amount){
        if(amount<=balance){
            this.balance = balance - amount;
        }
    }
    double getBalance(){
        return balance;
    }
    String getAccountIfo(){
        return "Account Holder Name : "+accountHolderName+"\nAccount Number : "+accountNumber;
    }
    public static void main(String[] args){
        BankAccount b = new BankAccount("123bk","Bablu Roy");
        System.out.println(b.getAccountIfo());
    }

}
