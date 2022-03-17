package pratice1;

public class BankTest {
	public static void main(String args[]) {
		
//		BankAccount First = new BankAccount(14562,"bikesh",40000);
//		BankAccount Second = new BankAccount(4569,"amar",50000);
//		BankAccount third = new BankAccount(4589,"niki",45000);
		
		BankAccount[] accounts = { new BankAccount(14562,"bikesh",40000),
				new BankAccount(15680,"biswa",50000),
				new BankAccount(14525,"satya",60000)};
		
		
		for(BankAccount account:accounts) {
			account.displayBankAccount();
		}
			

			

   }
}
