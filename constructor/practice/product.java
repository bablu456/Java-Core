package constructor.practice;

public class product {
    int id;
    String name;
    double price;
    product(int id,String name,double price){
        this.id = id;
        this.price = price;
        this.name = name;
    }
    void applyDiscount(double discountpercentage){
        this.price = this.price - (this.price * discountpercentage )/100;
    }
    void show(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Discountant Price : "+price);
    }

    public static void main(String[] args) {
        product p = new product(123,"Bablu",1000);
        p.applyDiscount(10);
        p.show();
    }
}
