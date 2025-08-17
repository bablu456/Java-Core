package Home_Work.inheritance;

public class Device {
    String deviceName = "Samasung Galaxy";
    void showInfo(){
        System.out.println("Info : "+deviceName);
    }
}
class Mobile extends Device{
    String os = "Android";
    void showInfo(){
        System.out.println("Device Name : "+deviceName);
        System.out.println("Operating System : "+os);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.showInfo();
    }
}
