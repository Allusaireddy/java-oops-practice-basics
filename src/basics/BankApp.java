package basics;

public class BankApp {
	
	public static void main(String[] args) {
		
		// Create account object for customer 1
		BankAccount acc1 = new BankAccount();
		acc1.createAccount("Alice", "ACC12345", 1000.0);
		
		// Create account object for customer 2
		BankAccount acc2 = new BankAccount();
		acc2.createAccount("Bob", "ACC67890", 500.0);
		
		// Perform operations on account1
		acc1.deposit(500.0);
		acc1.withdraw(200.0);
		acc1.displayAccountInfo();
		System.out.println();
		
		// Perform operations on account2
		acc2.deposit(100.0);
		acc2.withdraw(700.0); // Should show insufficient balance
		acc2.displayAccountInfo();
		
	}

}
