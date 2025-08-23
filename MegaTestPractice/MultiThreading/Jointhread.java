package MegaTestPractice.MultiThreading;

public class Jointhread extends Thread{
    public void run(){
        System.out.println("A start ");
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("A end");
    }
    public static void main(String[] args) {
        Jointhread t = new Jointhread();
        t.start();
        try{
            t.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Main After A ");
    }
}
