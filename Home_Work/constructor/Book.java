package Home_Work.constructor;

public class Book {
    String title;
    String author;
    int Price;

    Book(String title,String author,int Price){
        this.title = title;
        this.author = author;
        this.Price = Price;
    }
    Book(String title,String author){
        this.title = title;
        this.author = author;
        this.Price = 250;
    }
    void diplay(){
        System.out.println("Title : "+title);
        System.out.println("Author name : "+author);
        System.out.println("Price : "+Price);
    }
    public static void main(String [] args){
        Book b1 = new Book("Java","Gosling",240);
        Book b2 = new Book("Java c","Babalu");
        b1.diplay();
        b2.diplay();
    }
}
