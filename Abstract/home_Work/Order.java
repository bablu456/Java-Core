package Abstract.home_Work;

public interface Order {
    void processOrder();
}
class OnlineOrder implements Order{
    String order_id;
    String order_message;
    OnlineOrder(String order_id){
        this.order_id = order_id;
    }
    public void processOrder(){
        order_message = "Food Order By Online Method This is Order id : "+order_id+" Fodd Order Sucessfully";
        System.out.println(order_message);
    }
}
class OfflineOrder implements Order{
    String order_id;
    String order_message;
    OfflineOrder(String id){
        this.order_id = id;
    }
  public  void processOrder(){
        order_message ="This Food is Order  by Offline Method This is id : "+order_id+" Food is Under The Process ";
      System.out.println(order_message);
    }
    public static void main(String[] args){
        OnlineOrder oo = new OnlineOrder("HH304");
        OfflineOrder of = new OfflineOrder("HQE308");
        oo.processOrder();
        of.processOrder();
    }
}