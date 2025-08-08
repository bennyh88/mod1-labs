package lab6;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1, 100.00, "me");
		
		System.out.println(account.getDetails());
		
		account.withdraw(50);
		
		System.out.println(account.getDetails());
		
		try {
			account.withdraw(60);
		} 
		catch (IllegalArgumentException e) {
			System.out.println("Withdrawl amount exceeds account balance");
		}
		finally {
			account.close();
		}
		
		System.out.println(account.getDetails());
		
		
	}

}
