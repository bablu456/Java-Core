package MegaTestPractice.MultiThreading;

public class ThreadSleep extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(600);
                System.out.println("Working...");
            }catch (InterruptedException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
    }

    public static void main(String[] args) {
        ThreadSleep ts = new ThreadSleep();
        ts.start();
    }
}
