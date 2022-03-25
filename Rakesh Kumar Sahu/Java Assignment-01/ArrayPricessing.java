package module1;

public class ArrayPricessing {
	public static void main(String[] args) {

		Book[] books = { new Book("javabasics1", "biki", 150), new Book("learn javascript", "satya", 200),
				new Book("learn Python", "amar", 550), new Book("learn Angular", "venky", 600),
				new Book("learn BigData", "narayana", 800) };

		findMaximumPriceOfBooks(books);

	}

	private static void findMaximumPriceOfBooks(Book[] books) {
		double max = 0;
		for (Book book : books)
			if (book.bookId > max)
				max = book.bookId;
		System.out.println("Maximum priced book is:" + max);
	}



}
