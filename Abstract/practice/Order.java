package Abstract.practice;

interface Order {
    abstract void processOrder();
}
class Online implements Order{
    String orderId;
    Online(String id){
        this.orderId = id;
    }
  public   void processOrder(){
        System.out.println("Your Food Is in under process this is the id : "+orderId);
    }
    public static void main(String[] args){
        Online o = new Online("HX123");
        o.processOrder();
    }
}
