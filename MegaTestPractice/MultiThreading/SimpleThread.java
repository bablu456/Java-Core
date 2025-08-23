package MegaTestPractice.MultiThreading;

public class SimpleThread extends Thread {
    public void run() {
        System.out.println("Running " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SimpleThread st = new SimpleThread();
        st.setName("Worker -1");
        st.start();
    }
}
