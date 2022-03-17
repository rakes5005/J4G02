package pratice1;

public class ArraryPricessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] numbers = { 10, 20, 30, 40, 50 };
//		findMaximumNumber(numbers);
//		findMinimumNumber(numbers);

		Book[] books = { new Book("javabasics1", "biki", 150), new Book("learn javascript", "satya", 200),
				new Book("learn Python", "amar", 550), new Book("learn Angular", "venky", 600),
				new Book("learn BigData", "narayana", 800) };

		findMaximumPriceOfBooks(books);
//		findMaximumPricedOfBooks(books);

	}

//	private static void findMaximumPricedOfBooks(Book[] books) {
//		// TODO Auto-generated method stub
//		Book b = null;
//		double max = 0;
//		for (Book book : books)
//			if (book.bookId > max) {
//				max = book.bookId;
//				b = book;
//			}
////		System.out.println("Precious book is:"+b.displaybookInformation());
//
//	}

	private static void findMaximumPriceOfBooks(Book[] books) {
		// TODO Auto-generated method stub
		double max = 0;
		for (Book book : books)
			if (book.bookId > max)
				max = book.bookId;
		System.out.println("Maximum priced book is:" + max);
	}

//	private static void findMinimumNumber(int[] numbers) {
//		// TODO Auto-generated method stub
//		int min = numbers[0];
//		for (int number : numbers)
//			if (number <= min)
//				min = number;
//		System.out.println("minimum no is:" + min);
//	}

//	private static void findMaximumNumber(int[] numbers) {
//		// TODO Auto-generated method stub
//		int max = 0;
//		for (int number : numbers)
//			if (number > max)
//				max = number;
//
//		System.out.println("maximum no is:" + max);
//	}

}
