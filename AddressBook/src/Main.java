
import java.util.ArrayList;
public class Main{
public static void main(String[] args) {
Address b = new Address();
 b.setAuthor("Bill Waterson");
 b.setBookTitle("Calvin & Hobbes");
 //System.out.println(b.showBookInfo());
 ArrayList<Address> books = new ArrayList<Address>();
 books.add(b);
 
Address c = new Address();
 c.setAuthor("Charles Schultz");
 c.setBookTitle("Charlie Brown");
 books.add(c);
 
 for(Address book:books){
 System.out.println(book.showBookInfo());
 }
}
}
