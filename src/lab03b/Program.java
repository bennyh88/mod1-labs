package lab03b;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = {
				new Vehicle(0, 0),
				new Vehicle(0, 1),
				new Vehicle(0, 2)
		};
		
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getDetails());
		}
		
		System.out.println(Vehicle.getCount());
		
		boolean race = true;
		while (race) {
			for (Vehicle vehicle : vehicles) {
				Random rand = new Random();
				int n = rand.nextInt(10)+1;
				if (n>5) {
					vehicle.accelerate(n);
				} else {
					vehicle.brake(n);
				}
				System.out.println(vehicle.getDetails());
				if (vehicle.getDistance() > 1000) {
					System.out.println(vehicle.getDetails() + " wins!!!!!");
					race = false;
					break;
				}
			}
		}
		
	}

}
