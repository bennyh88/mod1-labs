package lab03b;

import lab03b.RegistrationPlate;

public class Vehicle {
	public int speed;
	public int lane;
	public int distanceTravelled;
	
	public static int vehicleCounter = 0;
	
	public RegistrationPlate registrationPlate;
	
	public Vehicle(int speed, int lane) {
		this.speed = speed;
		this.lane = lane;
		try {
			this.registrationPlate = RegistrationPlateFactory.getNextRegistrationPlate();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			//System.out.println("Cannot Initialise new Vehicle");
			throw e;
		}
		vehicleCounter++;
	}
	
	public static int getCount() {
		return vehicleCounter;
	}
	
	public void accelerate(int amount) {
		this.speed = this.speed += amount;
		if (this.speed > 200) {
			this.speed = 200;
		}
		this.distanceTravelled += this.speed;
	}
	
	public void brake(int amount) {
		this.speed = this.speed -= amount;
		if (this.speed < 0) {
			this.speed = 0;
		}
		this.distanceTravelled += this.speed;
	}
	
	public int getDistance() {
		return this.distanceTravelled;
	}
	
	public String getDetails() {
		return String.format(
					"Speed:%d, Lane:%d, Distance Travelled:%d, Plate:%s", 
					this.speed,
					this.lane,
					this.distanceTravelled,
					this.registrationPlate.getNumber()
				);
	}
}
