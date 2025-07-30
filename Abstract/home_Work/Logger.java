package Abstract.home_Work;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
abstract class Logger {
    protected String getCurrentTimestamp(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    abstract void log(String message);
}
class ConsoleLogger extends Logger{
    void log(String message){
        System.out.println("["+getCurrentTimestamp()+"] console Log : "+message);
    }
}
class FileLogger extends Logger{
    void log(String message){
        System.out.println("[" +getCurrentTimestamp()+ "] File Log : "+message);
    }
}
class DatabaseLogger extends Logger{
    void log(String message){
        System.out.println("["+getCurrentTimestamp()+"] Database Log: "+message);
    }
}
 class mainTest{
    public static void main(String[] args){
     Logger console = new ConsoleLogger();
     Logger file = new FileLogger();
     Logger data = new DatabaseLogger();
     console.log("User logged in.");
     file.log("User data saved to File.");
     data.log("User Record inserted into database.");
    }
}
