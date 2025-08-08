package lab7;

import java.awt.Color;

public class Rectangle extends Shape {
	protected int sideA;
	protected int sideB;
	
	public Rectangle(Color colour, Position position, int sideA, int sideB) {
		super(colour, position);
		this.sideA = sideA;
		this.sideB = sideB;
		// TODO Auto-generated constructor stub
	}

	protected int getArea() {
		return this.sideA * this.sideB;
	}
	
	protected int getCircumference() {
		return this.sideA + this.sideA + this.sideB + this.sideB;
	}
	
	@Override
	protected String getCharacteristics() {
		return String.format("RECTANGLE -\tX:%d, Y:%d, sideA:%d, sideB:%d, Area:%d, Circumference:%d", 
					this.position.x,
					this.position.y,
					this.sideA,
					this.sideB,
					this.getArea(),
					this.getCircumference()
				);
	}
	
	protected void printCharacteristics() {
		System.out.printf("X:%d, Y:%d, sideA:%d, sideB:%d, Area:%d, Circumference:%d", 
					this.position.x,
					this.position.y,
					this.sideA,
					this.sideB,
					this.getArea(),
					this.getCircumference()
				);
	}
	

}
