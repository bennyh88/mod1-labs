package oo2;

import java.awt.Color;
import java.util.Random;

class Shape {
	
	private ShapeType shapeType;
	
	public static int worldW;
	public static int worldH;
	
	
	public int x,y,w,h,dirX, dirY;
	private Color shapeColor = Color.black;
	
	public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType shapeType) {
		this.x = x; this.y = y; this.w = w; this.h = h; this.dirX = dirX; this.dirY = dirY;
		this.shapeType = shapeType;
	}
	
	public ShapeType getShapeType() {
		return this.shapeType;
	}
	
	public Color getColor() {
		return this.shapeColor;
	}
	
	public void setColor(Color color) {
		this.shapeColor = color;
	}
	
	public Color getRandColor() {
		Random rand = new Random();
		
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		
		return new Color(r, g, b);
	}

	public static void setWorld(int w, int h) {
		worldW = w;
		worldH = h;
	}
	
	public void move() {
		x += dirX;
		y += dirY;
		
		if( x < 0 || x > (worldW-this.w)) {
			//x=0;
			dirX = -dirX;
			this.setColor(this.getRandColor());
		}
		
		if( y < 0 || y > (worldH-this.h)) {
			//y=0;
			dirY = -dirY;
			this.setColor(this.getRandColor());
		}
	}
}
