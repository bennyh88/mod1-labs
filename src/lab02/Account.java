package lab02;

public class Account {
	int id; 
	String owner; 
	double balance;
	
	public Account (int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double amount) { 
		if (amount < 0) {
			System.out.println("Cannot deposit negative amount!");
		} else {
			this.balance += amount;
		}
		
	}
	
	public void withdraw(double amount) { 
		if (this.balance-amount < 0) {
			System.out.println("Insufficient Funds!");
		} else {
			this.balance -= amount;
		}
	}
	
	public String getDetails() {
		return String.format("id: %d,\nowner: %s,\nbalance: %g\n", this.id, this.owner, this.balance);
	}
	
	public void addInterest() {
		this.balance += this.balance * 0.025;
	}

}
