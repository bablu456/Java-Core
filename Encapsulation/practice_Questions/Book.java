package Encapsulation.practice_Questions;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private boolean isAvailable;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    Book(String title, String author, String isbn, int page){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = page;
    }
    void boorrowBook(){
        isAvailable = false;
    }
    void returnBook(){
        if(isAvailable == false){
            isAvailable = true;
        }
    }
    void getBookInfo(){
        System.out.println("Name : "+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN : "+isbn);
        System.out.println("Pages : "+pages);
        System.out.println("Isavailable : "+isAvailable);
    }
    public static void main(String[] args){
    Book b = new Book("Ram","Tulsi Das","y",1200);
    b.getBookInfo();

    }
}
