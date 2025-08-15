package Encapsulation.practice_Questions;

public class ShoppingItem {
    private String itemName;
    private double price;
    private int quantity;
    private String category;
    ShoppingItem(String itemName,double price,int quantity,String category){
        this.itemName = itemName;
        this.price  = price;
        this.quantity = quantity;
        this.category = category;

    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }
    void setQuantity(int quantity){
        if(quantity>0){
            this.quantity = quantity;
        }
    }
    void updatePrice(double newPrice){
        if(newPrice>0){
            this.price = newPrice;
        }
    }
    double getTotalCost(){
        return price * quantity;
    }
    void applyDiscount(double percentage){
        if(percentage>=0 && percentage<=100){
            price = price * (percentage/100);
        }
    }
    String getitemSummary(){
        return "item Name : "+itemName+"\nprice : "+price+"\nquantity : "+quantity+"\ncategory : "+category;
    }
    public static void main(String[] args){
        ShoppingItem s = new ShoppingItem("Apple",120,10,"fruits");
        s.setQuantity(10);
        s.updatePrice(100);
        System.out.println(s.getTotalCost());
        s.applyDiscount(15);
        System.out.print(s.getTotalCost());

    }
}