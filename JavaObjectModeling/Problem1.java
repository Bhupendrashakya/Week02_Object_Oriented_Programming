import java.util.ArrayList;

class Book{
    private String title;
    private String author;

     public Book(String title, String author) {
         this.title = title;
         this.author = author;
     }

     public String getTitle() {
         return title;
     }

     public String getAuthor() {
         return author;
     }
     public void BookDisplay(){
         System.out.println("Title :"+title+" Author :"+author);
     }
 }
 class Library{
    ArrayList<Book> books;
    private String name;

     public Library(String name) {
         this.name=name;
         this.books = new ArrayList<>();
     }
     public void addBook(Book book){
         books.add(book);
     }
     public void DisplayBooks(){
         for(Book book:books){
             book.BookDisplay();
         }
     }
     public void LibraryName(){
         System.out.println("Library name :"+ name);
     }
 }
public class Problem1 {
    public static void main(String[] args) {
        Book b1=new Book("Ramayan","Tulsidas");
        Book b2=new Book("Bhagvat Gita","Shree Krishna");
        Book b3 =new Book("Jan gan man ","RavindraNath taigore");
        Book b4=new Book("Vande matram","Vamkin chandra chattopadhyaay");
        Library l1=new Library("city library");
        Library l2 =new Library("trisha library");
        l1.LibraryName();
        l1.addBook(b1);
        l1.addBook(b3);
        l1.DisplayBooks();
        l2.LibraryName();
        l2.addBook(b2);
        l2.addBook(b4);
        l2.DisplayBooks();
    }
}

