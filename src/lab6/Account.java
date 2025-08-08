package lab6;

public class Account {
	int id; 
	double balance; 
	String owner;

	Account (int id, double balance, String owner) {
		this.id = id; 
		this.balance = balance; 
		this.owner = owner;
	}
	
	void withdraw(double amount) throws IllegalArgumentException{
		if (amount > this.balance) {
			throw new IllegalArgumentException();
		} else {
			this.balance -= amount;
		}
	}
	
	void deposit(double amount) {
		this.balance += amount;
	}
	
	void close() {
		System.out.printf("Account ID:%d is closed\n", this.id);
	}
	
	String getDetails() {
		return String.format("ID:%d, Owner:%s, Balance:%g", this.id, this.owner, this.balance);
	}
	
}

//class BadIDException extends Exception { }
