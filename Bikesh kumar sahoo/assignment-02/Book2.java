package com.cloning;

public class Book2 implements Cloneable{
	int bookPrice;
	String bookName;
	public Book2(int bookPrice, String bookName) {
		super();
		this.bookPrice = bookPrice;
		this.bookName = bookName;
	}
	public void displayBook() {
		System.out.println(bookPrice +" "+ bookName);
	}
	
	public static void main(String args[]) {
		
		Book2 book = new Book2(150,"Ramayana");
		Book2 book1 = new Book2(200,"Mahabharat");
		Book2 book3 = null;
		
		try {
			 book3 =(Book2)book1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		
		book1.displayBook();
		book3.displayBook();//200,mohabharat
		book1.bookName="Arjun the warrior";
		book1.displayBook();//arjun the warrior
		book3.displayBook();
		
		//by using equals()
		if (book.equals(book1))
			System.out.println("both are equal");
		else
			System.out.println("both are unequal");
		
	}
	

}
