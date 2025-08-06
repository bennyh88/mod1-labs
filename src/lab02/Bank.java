package lab02;
import lab02.Account;

public class Bank {
	Account[] storage = new Account[3];
	int id_counter = 1;
	
	public Account addAccount(String owner, double balance) {
		if (this.id_counter <= this.storage.length) {
			Account acc = new Account(this.id_counter, owner, balance);
			this.storage[this.id_counter-1] = acc;
			this.id_counter++;
			return acc;
		}
		return null;
	}
	
	public Account getAccount(String owner) {
		for (Account account : this.storage) {
			if (account.owner == owner) {
				return account;
			}
		}
		return null;
	}
}
