package Array;

public class BookArray {
	int bookId;
	String bookName;
	
	public BookArray(int bookId,String bookName) {
		super();
		this.bookId=bookId;
		this.bookName=bookName;
	}
   public void display() {
	   System .out.println("bookId :"+" "+bookId+" "+"bookName :"+" "+bookName);
	 }
   public static void main(String[] args) {
	   
	   BookArray[] bk=new BookArray[5];
	   bk[0]=new BookArray(1,"learnjobs");
	   bk[1]=new BookArray(2,"hindi");
	   bk[2]=new BookArray(3,"english");
	   bk[3]=new BookArray(4,"telugu");
	   bk[4]=new BookArray(5,"maths");
	   
	   for(BookArray ba:bk) {
		   
		 ba.display();
	   }
   }
}
