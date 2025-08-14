package Java_Oops.interface_p;

public interface Logger {
    void log(String message);
}
class ConsoleLogger implements Logger{
   public void log(String message){
        System.out.println("Login Sucessful "+message);
    }
}
class FileLogger implements Logger{
   public void log(String message){
        System.out.println("Login Sucessful "+message);
    }
    public static void main(String[] args){
       ConsoleLogger cl = new ConsoleLogger();
       cl.log("Loging sucessful in the system ");
    }
}
