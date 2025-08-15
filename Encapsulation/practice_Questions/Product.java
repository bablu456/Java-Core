package Encapsulation.practice_Questions;

public class Product {
    private  int productId;
    private String name;
    private int quantity;
    private double price;

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
void setPrice(double price){
        if(price >0){
            this.price = price;
        }else{
            throw new IllegalArgumentException("Please enter Positive Price !!");
        }
}
void addStock(int amount){
        quantity = quantity + amount;
}
void sellProduct(int amount){
        if(amount<=quantity){
            quantity -= amount;
        }else{
            System.out.println("Please Enter The Corect Amount  !1 ");
        }
}
double getTotalValue(){
        return price * quantity;
}
boolean islnStock(){
        return quantity > 0;
}
    Product(int product, String name, int quantity,double price){
        this.productId = product;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public static void main(String[] args){
        Product p = new Product(12,"Mango",5,100);
    p.addStock(5);
    p.sellProduct(2);
    System.out.print(p.getTotalValue());
    }
}
