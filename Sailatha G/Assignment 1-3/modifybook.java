package parameters;

public class modifybook {

	int bookId;
	String bookName;
	String bookAuthor;
	
	modifybook(int bookId,String bookName,String bookAuthor){
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		}
	public void printBook() {
		System.out.println(bookId+","+bookName+" ,"+bookAuthor);
     }
	public static void main(String[] args) {
		modifybook book1=new modifybook(001,"the world","sai");
		modifybook book2=new modifybook(002,"the Environment","rasi");
		modifybook book3=new modifybook(003,"the nation","sukku");
		book1.printBook();
		book2.printBook();
		book3.printBook();
	}
}
 