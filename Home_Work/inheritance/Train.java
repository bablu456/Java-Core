package Home_Work.inheritance;

public class Train {
    void run(){
        System.out.println("Train is running...");
    }
}
class Metro extends Train{
    void run(){
        System.out.println("Metro is running on electric track...");
    }

    public static void main(String[] args) {
        Metro m = new Metro();
        m.run();
    }
}
