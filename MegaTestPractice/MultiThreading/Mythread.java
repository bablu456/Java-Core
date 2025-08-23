package MegaTestPractice.MultiThreading;

public class Mythread extends Thread{
    public void run(){
        System.out.println("Hello From MyThread !! ");
    }

    public static void main(String[] args) {
        Mythread m = new Mythread();
        m.start();
    }
}
