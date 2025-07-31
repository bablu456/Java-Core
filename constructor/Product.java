package constructor;
import java.util.Scanner;
public class Product {
    int id ;
    String name;
    int price;
    void applyDiscount(double discountPercentage){
        this.price = price;
    }
    Product(int price){
        this.price = price;
        applyDiscount(price);
    }
    public static void main(String[] args) {
        Product p = new Product(1200);


    }
}
