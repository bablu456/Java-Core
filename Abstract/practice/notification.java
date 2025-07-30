package Abstract.practice;

public interface notification {
    void notifyUser(String message);
}
class EmailNotification implements notification{
    String recient;
    EmailNotification(String recient) {
        this.recient = recient;
    }
 public  void notifyUser(String message){
        if(recient.contains("@")){
            System.out.println("Email sent to : "+recient+" "+message);
        }else{
            throw new IllegalArgumentException("Please Enter The Correct Emails Id ::::");
        }
    }
}
class SMSnotification implements notification{
    String phone;
    SMSnotification(String recient){
        this.phone = recient;
    }
    public void notifyUser(String message){
        if(phone.matches("\\d{10}")){
            System.out.println("SMS sent to this number : "+phone+" "+message);
        }else{
            System.out.println("plese enter the ocrrect number ");
        }
    }
    public static void main(String[] args){
        EmailNotification em = new EmailNotification("Bablu@gmail.com");
        em.notifyUser("yes");
    }
}