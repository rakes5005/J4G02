package Student;
import java.util.Scanner;
	import java.util.*; 
	import java.io.*; 
	class Bank {  
	  
	    String accno;  
	     String name;  
	    String acc_type;  
	    private long balance;  
	    Scanner sc = new Scanner(System.in);  
	    //method to open new account  
	    public void openAccount() {  
	        System.out.print("Enter Account No: ");  
	        accno = sc.next();  
	        System.out.print("Enter Account type: ");  
	        acc_type = sc.next();  
	        System.out.print("Enter Name: ");  
	        name = sc.next();  
	        System.out.print("Enter Balance: ");  
	        balance = sc.nextLong();  
	    }  
	    //method to display account details  
	    public void showAccount() {  
	        System.out.println("Name of account holder: " + name);  
	        System.out.println("Account no.: " + accno);  
	        System.out.println("Account type: " + acc_type);  
	        System.out.println("Balance: " + balance);  
	    }  
	    //method to deposit money  
	    public void deposit() {  
	        long amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextLong();  
	        balance = balance + amt;  
	    }  
	    //method to withdraw money  
	    public void withdrawal() {  
	        long amt;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amt = sc.nextLong();  
	        if (balance >= amt) {  
	            balance = balance - amt;  
	            System.out.println("Balance after withdrawal: " + balance);  
	        } else {  
	            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
	        }  
	    } 
		public class Main
		{
		//	public static void main(String args[])
	{ 
				System.out.println("bank");
				
Bank ob2=new Bank();

ob2.showAccount();
ob2.deposit();
ob2.withdrawal();		
	}

	}
	}

		    


