package module1;

public class Book {
	String bookName;
	String bookAuthor;
	int bookId;
	public Book(String bookName, String bookAuthor, int bookId) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
	}
	
	public void displaybookInformation() {
		System.out.println( bookName+" "+bookAuthor+" "+bookId);
	}

}
