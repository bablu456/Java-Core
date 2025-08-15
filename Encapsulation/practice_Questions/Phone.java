package Encapsulation.practice_Questions;

public class Phone {
    private String brand;
    private String model;
    private int batteryLevel;
    private boolean isOn;
    private int volume;
    Phone(String brand,String model){
        this.brand = brand;
        this.model = model;
        this.batteryLevel = 100;
        this.volume = 5;
    }
    void turnOn(){
        isOn = true;
    }
    void turnOff(){
        if(batteryLevel == 0){
            isOn = false;
        }
        isOn = false;
    }
    void useBattery(int amount){
        if(amount>=0 && amount<=100){
            batteryLevel -= amount;
            if(batteryLevel == 0){
                isOn = false;
            }
        }
    }
    void setVolume(int volume){
        if(volume>=0 && volume<=10){
            this.volume = volume;
        }
    }
    String getPhoneStatus(){
        return "Brand : "+brand+"\nModel : "+model+"\nBattery Level : "+batteryLevel+"\nIs Phone On : "+isOn;
    }
    public static void main(String[] args){
        Phone p = new Phone("Apple","Iphone 16 Pro Max ");
        System.out.println(p.getPhoneStatus());
        p.turnOn();
        System.out.println(p.getPhoneStatus());
        p.useBattery(100);
        System.out.println(p.getPhoneStatus());
    }
}
