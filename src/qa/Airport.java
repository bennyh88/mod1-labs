package qa;

import qa.Utils;


public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utils utils = new Utils();
		
		double input_amount = utils.getDouble("Input Amount");;
		
		// 1 = USD, 2 = EUR, 3 = JPY
		int currency = utils.getInt("Input Currency (1 = USD, 2 = EUR, 3 = JPY):");
		
		// R = Regular, V = VIP
		char customer_type = utils.getChar("Input Cutomer type (R = Regular, V = VIP):");
		
		System.out.printf("Input amount: %g\n", input_amount);
		
		double minus_service_fee = input_amount - calculate_service_fee(input_amount);
		System.out.printf("Minus service fee: %g\n", minus_service_fee );
		
		double minus_tax = minus_service_fee - calculate_airport_tax(input_amount, customer_type);
		System.out.printf("Minus tax: %g\n", minus_tax);
		
		double foreign_currency = convert_currency(minus_tax, currency);
		System.out.printf("Foreign Currency: %d\n", (int)foreign_currency);
		
	}
	
	
	public static double convert_currency(double input_amount, int currency) {
		
		switch(currency) {
		  case 1:
		    // USD
			return input_amount * 1.25;
		  case 2:
		    // EUR
			return input_amount * 1.15;
		  case 3:
		    // JPY
			return input_amount * 180.50;
		  default:
		    // ERROR
			System.out.println("ERROR: Invalid Currency Selection");
			return 0;
					  
		}
		
	}

	public static double calculate_service_fee(double amount) {
		
		if (amount < 100) {
			return amount * 0.05;
		}
		return amount * 0.025;
		
	}
	
	public static double calculate_airport_tax(double amount, char customer_type) {
		
		switch(customer_type) {
		  case 'V':
		    // USD
			return amount * 0.05;
		  case 'R':
		    // EUR
			return amount * 0.1;
		  default:
		    // ERROR
			System.out.println("ERROR: Invalid Customer Type, treating as R");
			return amount * 0.1;
					  
		}
		
	}

}

