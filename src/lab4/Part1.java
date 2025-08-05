package lab4;
	
public class Part1 {
	
	public int get_sum(int[] x) {
		int total = 0;
		for (int i=0; i<x.length; i++) {
			total += x[i];
		}
		return total;
	}
	
	public float get_average(int[] x) {
		int total = 0;
		for (int i=0; i<x.length; i++) {
			total += x[i];
		}
		return total / x.length;
	}
	
	public int get_min(int[] x) {
		int min = x[0];
		for (int i=1; i<x.length; i++) {
			if (x[i] < min) {
				min = x[i];
			}
		}
		return min;
	}
	
	public int get_max(int[] x) {
		int max = x[0];
		for (int i=1; i<x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}
	
	public int get_index(int[] x, int a) {
		for (int i=0; i<x.length; i++) {
			if (x[i] == a) {
				return i;
			}
		}
		System.out.printf("Error: %d not found\n", a);
		return 0;
	}
}
