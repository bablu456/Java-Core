package Inheritance.practice;

public class Account {
    int balance = 1000;
    void showBalance(){

    }
}
class Saving extends Account{
    int intret = 5;
    void showBalance(){
        int store = (balance * intret)/100;
        balance = balance + store;
        System.out.println("Balance with intrest : "+balance);
    }
    public static void main(String[] args){
        Saving s = new Saving();
        s.showBalance();
    }
}
