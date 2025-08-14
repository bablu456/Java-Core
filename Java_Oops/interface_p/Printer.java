package Java_Oops.interface_p;

public interface Printer {
    void print();
}
interface Scanner{
    void scan();
}
class MultiFunctionDevice implements Printer,Scanner{
    public void print(){
        System.out.println("I'm Printing The Messages !! ");
    }
    public void scan(){
        System.out.println("I'm Scanning The Questions !! ");
    }
    public static void main(String[] args){
        MultiFunctionDevice m = new MultiFunctionDevice();
        m.print();
        m.scan();

    }
}
