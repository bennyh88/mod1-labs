package lab7;

import java.awt.Color;

public class Sphere extends Circle {

	public Sphere(Color colour, Position position, int radius) {
		super(colour, position, radius);
		// TODO Auto-generated constructor stub
	}

	protected double getVolume() {
		return (4/3) * Math.PI * Math.pow(this.radius, 3);
	}
	
	@Override
	protected String getCharacteristics() {
		return String.format("SPHERE - \tX:%d, Y:%d, Radius:%d, Diameter:%d Area:%g, Circumference:%g, Volume:%g", 
				this.position.x,
				this.position.y,
				this.radius,
				this.getDiameter(),
				this.getArea(),
				this.getCircumference(),
				this.getVolume()
			);
	}
	
	@Override
	protected void printCharacteristics() {
		System.out.printf("X:%d, Y:%d, Radius:%d, Diameter:%d Area:%g, Circumference:%g, Volume:%g\n", 
				this.position.x,
				this.position.y,
				this.radius,
				this.getDiameter(),
				this.getArea(),
				this.getCircumference(),
				this.getVolume()
			);
	}
	
	
	
}
