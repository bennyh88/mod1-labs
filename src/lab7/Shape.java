package lab7;

import java.awt.Color;

import lab7.Position;


public class Shape {
	protected Color colour;
	protected Position position = null;
	
	public Shape(Color colour, Position position) {
		this.colour = colour;
		this.position = position;
	}
	
	protected Color getColour() {
		return this.colour;
	}
	
	protected Position getPosition() {
		return this.position;
	}
	
	protected void setColour(Color colour) {
		this.colour = colour;
	}
	
	protected void setPosition(int x, int y) {
		this.position.x = x;
		this.position.y = y;
	}

	protected String getCharacteristics() {
		// TODO Auto-generated method stub
		return String.format("SHAPE -\tX:%d, Y:%d", 
				this.position.x,
				this.position.y
			);
	}
	
}
