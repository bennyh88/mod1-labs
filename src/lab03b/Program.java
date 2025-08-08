package lab03b;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		//readLog("nonexistentfile");
		
		try {
			log("INitialising Log File");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		// TODO Auto-generated method stub
		
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		try {
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));
			vehicles.add(new Vehicle(0, 0));

		} catch (Exception e) {
			//System.out.println(e.getMessage());
			//System.out.println("Failed to Init vehicle");
		}
		
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
			System.out.println("");
		}
		
	}
	
	private static void log(String msg) throws IOException {
		File file = new File("log.txt");
		FileWriter fr;
		fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(msg + "\r\n");
		br.close();
		fr.close();

	}
	
	
	private static void readLog(String filename) throws IOException {
		File file = new File(filename);
		FileReader fr = new FileReader(file);
		fr.close();
	}
}


