package lab4;
import lab4.Part1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//part_1();
		//part_2a();
		//part_2b();
		part_3();
		
		
	}
	
	
	public static void part_3() {
		multiplicationTable();
	}
	
	public static void multiplicationTable() {
		for (int i=1; i<11; i++) {
			for (int j=1; j<11; j++) {
				System.out.printf("%d\t", i*j);
			}
			System.out.printf("\n");
		}
	}
	
	public static void part_2b() {
		System.out.printf("It will take %d years to reach target", double_your_money(100.0, 0.05, 200.0));
	
	}
	
	public static int double_your_money(double initial, double interest, double target) {
		
		int years = 0;
		for (initial = initial; initial < target; initial = initial * (1 + interest)) {
			System.out.printf("Year %d = %g\n", years, initial);
			years++;
		}
		return years;

	}
	
	public static void part_2a() {
		String[] students =  {"Alpha", "Bravo", "Charlie", "Romeo", "Juliet"};
		int[] marks =  {22, 33, 55, 66, 88};
		
		System.out.println("Name, Mark, Grade");
		for (int i=0; i<students.length; i++) {
			System.out.printf("%s - %d - %s\n", students[i], marks[i], getGrade(marks[i]));
		}
	
	}
	
	public static String getGrade(int mark) {
		
		if (mark < 0 || mark > 100) {
			return "Error: marks must be between 1..100";
		}
		else if (mark < 50) {
			return "Fail";
		}
		else if (mark <= 60) {
			return "Pass";
		}
		else if (mark <= 70) {
			return "Merit";
		}
		else {
			return "Distinction";
		}
		
	}
	
	
	
	
	
	public static void part_1() {
		int[ ] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		
		Part1 part1 = new Part1();
		
		// Task 1: Write code to find the sum of every number in numbers
		System.out.printf("Total: %d\n", part1.get_sum(numbers));
		
		// Task 2: Find the average of these numbers
		System.out.printf("Average: %g\n", part1.get_average(numbers));
		
		// Task 3: Find the minimum number in numbers
		System.out.printf("Min: %d\n", part1.get_min(numbers));
		
		// Task 4: Find the maximum number in numbers
		System.out.printf("Max: %d\n", part1.get_max(numbers));
		
		// Task 5: Find the index of number zero in numbers
		System.out.printf("Index: %d\n", part1.get_index(numbers, 0));
	}
	
	
	
	
}
