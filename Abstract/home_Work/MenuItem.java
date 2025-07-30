package Abstract.home_Work;

abstract class MenuItem {
    String name;
    int price;
    MenuItem(String name,int price){
        this.name = name;
        this.price = price;
    }
    abstract void prepare();
}
class VegBurger extends MenuItem{
    VegBurger(String name,int price){
        super(name,price);
    }
    void prepare(){
        System.out.println("Veg Burger Cooking The Price is : "+price);
    }
}
class chickenBurger extends MenuItem{
    chickenBurger(String name,int price){
        super(name,price);
    }
    void prepare(){
        System.out.println("Chicken is Preparing Price is : "+price);
    }
}
class m{
    public static void main(String[] args){
        VegBurger v = new VegBurger("Bablu",120);
    }

}
