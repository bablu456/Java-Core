package Java_Oops.interface_p;

public interface Notifer {
    void sendNotification(String msg);
}
class EmailNotifer implements Notifer{
   public void sendNotification(String msg){
        System.out.println("Welcome !! ");
    }
}
class SMSnotife implements Notifer{
  public void sendNotification(String msg){
      System.out.println("Welcome !! ");
  }
}
class PushNotifier implements Notifer{
    public void sendNotification(String msg){
        System.out.println("Welcome !! ");
    }
    public static void main(String[] args){
        EmailNotifer em = new EmailNotifer();
        em.sendNotification("Welcome");
    }
}
