package constructor.practice;

public class Book {
    String title;
    String author;
    int price;
    Book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(String title,String author){
        this.title = title;
        this.price = 250;
        this.author = author;
    }
    void displayBookInfo(){
        System.out.println("Title :"+title);
        System.out.println("Author Name :"+author);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java","John Doe",120);
        Book b2 = new Book("Mega","Bable");
        b1.displayBookInfo();
        b2.displayBookInfo();
    }
}
