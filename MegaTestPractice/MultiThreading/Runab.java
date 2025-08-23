package MegaTestPractice.MultiThreading;

public class Runab implements Runnable {
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Runab rn = new Runab();
        Thread t = new Thread(rn);
        t.start();
    }
}
