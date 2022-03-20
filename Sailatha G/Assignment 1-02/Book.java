package assignment2;

public class Book {
 int bookId=12;
 String bookName="java";
 String bookAuthor="Arjun";
 
 void displayBookDetails()
 {
	 System.out.println(bookId+" "+bookName+" "+bookAuthor);
 }
 public static void main(String[] args) {
	 Book b1=new Book();
	 b1.displayBookDetails();
 }
}
