package MegaTestPractice.MultiThreading;

public class currentThread implements Runnable{
    public currentThread(String customThread) {
        super();
    }

    public void run(){
        System.out.println("Running in "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        currentThread ct =new currentThread("Custom Thread");
        Thread c = new Thread(ct);
        c.start();
    }

}
