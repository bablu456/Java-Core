package Encapsulation.practice_Questions;

public class BankAccount {
    private String AccountNumber;
    private String AccountHolderName;
    private double balance;
    BankAccount(String accountNumber,String accountHolderName){
        this.AccountHolderName = accountHolderName;
        this.AccountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }
    void deposit(double amount){
        if(amount>0) {
            balance = amount;
        }
    }
    void withdrawl(double amount){
        if(amount<0){
            System.out.println("Can't withdrawal");
        }else{
            balance = balance - amount;
        }
    }
    void getAccountInfo(){
        System.out.println("Acoount holder Name : "+getAccountHolderName());
        System.out.println("Account number : "+getAccountNumber());
    }

    public static void main(String[] args){
        BankAccount b = new BankAccount("820775120","bablu");
        b.deposit(670);
        System.out.println("Balance : "+b.getBalance());

    }
}
