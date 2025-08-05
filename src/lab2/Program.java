package lab2;

public class Program {

	public static void main(String[] args) {
		
		for (int i=-1; i<110; i++) {
			String grade = check_grade(i);
			System.out.println(i + " = " + grade);
		}
		
	}

	
	public static String check_grade(int mark) {
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
}



