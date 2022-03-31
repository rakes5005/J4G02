package Collection;

public class BookClass1 {
	int bookId;
	String bookName;
	String authorName;
	double bookPrice;

	public BookClass1(int bookId, String bookName, String authorName, double bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName() {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName() {
		this.authorName = authorName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice() {
		this.bookPrice = bookPrice;
	}

}
