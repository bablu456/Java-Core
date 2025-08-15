package Encapsulation.practice_Questions;


public class Timer {
    private long startTime;
    private  long endTime;
    boolean isRunning;
    Timer(){
        this.isRunning = false;
        this.startTime = 0;
        this.endTime = 0;
    }
    public void start(){
        if(isRunning){
            System.out.println("Timer is Alredy running!");
            return;
        }
        this.startTime = System.currentTimeMillis();
        this.isRunning = true;
    }
public void stop(){
        if(!isRunning){
            System.out.println("Timer is Not running! ");
            return;
        }
        this.endTime = System.currentTimeMillis();
        this.isRunning = false;
}
}
