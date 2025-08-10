package Polymorphism.home_work;

public class Transport {
    void travelMode(){
        System.out.println("Traveling");
    }
}
class Bus extends Transport{
    void travelMode(){
        System.out.println("Traveling By bus ");
    }
}
class Train extends Transport{
    void travelMode(){
        System.out.println("Traveling by Train");
    }
}
class Flight extends Transport{
    void travelMode(){
        System.out.println("Traveling by Flight ");
    }
    public static void main(String[] args){
        Transport t = new Flight();
        t.travelMode();
        Transport tt = new Bus();
        tt.travelMode();
        Transport c = new Transport();
        c.travelMode();
    }
}