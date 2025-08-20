package Practice_Questions.polymorpshism_practice;

public class Bank {
    int get(){
        return 0;
    }
}
class sbi extends Bank{
    int get(){
        return 5;
    }
}
class Hdfc extends Bank{
    int get(){
        return 6;
    }
}
class ICIC extends Bank{
    int get(){
        return 7;
    }
    public static void main(String[] args){
        Bank b = new Bank();
        sbi c = new sbi();
        int Sbi = c.get();
        Hdfc d = new Hdfc();
        int HDfc = d.get();
        ICIC f = new ICIC();
        int ICIC = f.get();
        System.out.println("SBI Intrest Rate : "+Sbi);
        System.out.println("HDFC Intrest Rate : "+HDfc);
        System.out.println("ICIC Intrest Rate : "+ICIC);
    }
}
