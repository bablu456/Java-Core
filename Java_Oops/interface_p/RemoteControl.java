package Java_Oops.interface_p;

public interface RemoteControl {
    void pressButtons(int code);
}
class TvRemote implements RemoteControl{
    void channelNext(){
        System.out.println("Next Channel");
    }
    void favouriteChannel(){
        System.out.println("Favourite Channel List ");
    }
    public void pressButtons(int code){
        switch (code){
            case 1:
                channelNext();
                break;
            case 2:
                favouriteChannel();
                break;
            default:
                System.out.println("Please Choose correct Butons");
        }
    }
}
class AcRemote implements RemoteControl{
    void tempup(){
        System.out.println("Tempreture Increased ");
    }
    void tempdown(){
        System.out.println("Tempreture Decreased ");
    }
    public void pressButtons(int code){
        switch (code){
            case 1:
                tempup();
                break;
            case 2:
                tempdown();
                break;
            default:
                System.out.println("Please Choose Correct Buttons !! ");
        }
    }
    public static void main(String[] args){
        TvRemote t = new TvRemote();
        t.pressButtons(1);
        AcRemote a = new AcRemote();
        a.pressButtons(2);
    }
}
