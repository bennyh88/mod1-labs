package lab3;

import java.util.Scanner;
import lab3.Utils;

public class Program {
	

	public static void main(String[] args) {
		//theLunchQueue();
		Utils utils = new Utils();
		
		int kg = utils.getInt("Input weight in kg");
		convertKgsToStonesPounds(kg);
		
		theLunchQueue();
		
	}

	public static void theLunchQueue () {
		
		Utils utils = new Utils();
		
		String mainCourse = utils.getString("What main dish would you like? (Fish, Burgers or veg)");
		int num_potatoes = utils.getInt("How many roast potatoes would you like?");
		int num_brussels = utils.getInt("How many brussel sprouts would you like?");
		
		String meal_summary = "You have chosen %s, with %d roast potatoes and %d brussels sprouts.";
		System.out.printf(meal_summary, mainCourse, num_potatoes, num_brussels);
	}
	
	
	public static void convertInputToStonesPounds(int pounds) {
		int stone = pounds / 14;
		pounds = pounds % 14;
		
		String weight_conversion = "%d Stone and %d Pounds";
		System.out.printf(weight_conversion, stone, pounds);
	}
	
	public static void convertKgsToStonesPounds(int kg) {
		
		double pounds = kg * 2.20462;
		convertInputToStonesPounds((int)pounds);
		
	}
	
}


