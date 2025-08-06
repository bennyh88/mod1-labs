package lab02;
import lab02.Account;
import lab02.Bank;

public class Program {

	public static void main(String[] args) {
		//part1();
		//part2();
		//part3();
		part4();
	}
	
	public static void part4() {
		Bank bank = new Bank();
		bank.addAccount("Me", 101);
		bank.addAccount("Myself", 102);
		bank.addAccount("eye", 103);
		
		Account located = bank.getAccount("Me");
		if (located == null) {
			System.out.println("Account Not Found!");
		} else {
			System.out.println(located.getDetails());
		}
		
		Account located2 = bank.getAccount("cheese");
		if (located2 == null) {
			System.out.println("Account Not Found!");
		} else {
			System.out.println(located2.getDetails());
		}
	}
	
	public static void part3() {
		Account myAccount = new Account(1, "Me", 100.00);
		myAccount.addInterest();
		System.out.println(myAccount.getDetails());
		
		Account partnerAccount = myAccount;
		partnerAccount.addInterest();
		System.out.println(myAccount.getDetails());
		
		processAccount(myAccount);
		System.out.println(myAccount.getDetails());
		
		int k=100;
		incInt(k);
		System.out.println(k);
	}
	
	private static void incInt(int x) {
		x++;
	}

	
	static void processAccount(Account acc){ 
		acc.addInterest();
	}

	
	public static void part2() {
		Account[] accounts = {
				new Account(1, "The King", 99.99), 
				new Account(2, "The Queen", 9999.99),
				new Account(3, "The Prince", 109.99)
		};
		
		for (Account account : accounts) {
			System.out.println(account.getDetails());
		}
	
	}
	
	public static void part1() {
		Account account1 = new Account(1, "The King", 99.99);
		
		account1.deposit(100.00);
		account1.withdraw(105.00);
		
		System.out.println(account1.getDetails());
	}

}
