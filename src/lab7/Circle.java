package lab7;

import java.awt.Color;

public class Circle extends Shape {
	protected int radius;
	
	public Circle(Color colour, Position position, int radius) {
		super(colour, position);
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	
	
	protected double getArea() {
		return Math.PI * (this.radius * this.radius);
	}
	
	protected double getCircumference() {
		return 2 * Math.PI * this.radius;
	}
	
	protected int getDiameter() {
		return 2 * this.radius;
	}
	
	protected int getRadius() {
		return this.radius;
	}
	
	@Override
	protected String getCharacteristics() {
		return String.format("CIRCLE -\tX:%d, Y:%d, Radius:%d, Diameter:%d, Area:%g, Circumference:%g", 
				this.position.x,
				this.position.y,
				this.radius,
				this.getDiameter(),
				this.getArea(),
				this.getCircumference()
			);
	}
	
	protected void printCharacteristics() {
		System.out.printf("X:%d, Y:%d, Radius:%d, Diameter:%d, Area:%g, Circumference:%g\n", 
				this.position.x,
				this.position.y,
				this.radius,
				this.getDiameter(),
				this.getArea(),
				this.getCircumference()
			);
	}
	
	protected void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
