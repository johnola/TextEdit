public class Address{
 private String bookTitle;
 private String author;
 private String SKU;
public String getSKU() {
 return SKU;
 }
public void setSKU(String sKU) {
 SKU = sKU;
 }
public String getBookTitle() {
 return bookTitle;
 }
public void setBookTitle(String bookTitle) {
 this.bookTitle = bookTitle;
 }
public String getAuthor() {
 return author;
 }
public void setAuthor(String author) {
 this.author = author;
 }
 public String showBookInfo(){
 return this.getBookTitle() + " " + this.getAuthor();
 }
 
}
