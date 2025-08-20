package Practice_Questions.polymorpshism_practice;

public class Transport {
    void travelMode(){
        System.out.println("Traveling ");
    }
}
class bus extends Transport{
        void travelMode(){
            System.out.println("Traveling by bus ");
        }
}
class bike extends Transport{
    void travelMode(){
        System.out.println("Traveling by bike ");
    }
    public static void main(String[] args){
        Transport t = new Transport();
        t.travelMode();
        bus b = new bus();
        b.travelMode();
        bike g = new bike();
        g.travelMode();
    }
}
