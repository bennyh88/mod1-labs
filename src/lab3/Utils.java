package lab3;

import java.util.Scanner;

public class Utils {
	
	public int getInt(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextInt();
	}
	
	public Double getDouble(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextDouble();
	}
	
	public String getString(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextLine();
	}
}
