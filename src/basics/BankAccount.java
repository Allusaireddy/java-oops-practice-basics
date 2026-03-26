package basics;

public class BankAccount {
	
	//Instance variables
	String accountHolder;
	String accountNumber;
	double balance;
	
	//Method to intialize account details
	void createAccount(String name,String accNumber,double initialBalance) {
		accountHolder = name;
		accountNumber = accNumber;
		balance = initialBalance;
	}
	
	//Method to deposit money
	void deposit(double amount) {
		balance += amount;
		System.out.println(amount + "deposited successfully.");
	}
	
	//Method to withdraw money
	void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println(amount + "withdrawn successfully.");
		}else {
				System.out.println("Insufficient balance.");	
		}
	}
	
	//Method to display account details
	void displayAccountInfo() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance:" + balance);
	}
	

}
