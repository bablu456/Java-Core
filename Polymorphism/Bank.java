package Polymorphism;

public class Bank {
    int getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    int getInterestRate() {
        return 5;
    }
}

class HDFC extends Bank {
    int getInterestRate() {
        return 6;
    }
}

class ICIC extends Bank {
    int getInterestRate() {
        return 7;
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        SBI s = new SBI();
        int c = s.getInterestRate();
        HDFC h = new HDFC();
        int d = s.getInterestRate();
        ICIC i = new ICIC();
        int ic = i.getInterestRate();
        System.out.println("SBI intrest rate : " + c);
        System.out.println("HDFC intrest rate : " + d);
        System.out.println("ICICI intrest rate " + ic);
    }
}
