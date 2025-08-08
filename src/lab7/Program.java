package lab7;

import java.awt.Color;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		Color c = Color.yellow;
		Position position = new Position(10, 20);
		
		
		Circle circle = new Circle(c, position, 10);
		shapes.add(circle);
		
		Sphere sphere = new Sphere(c, position, 10);
		shapes.add(sphere);

		Rectangle rectangle = new Rectangle(c, position, 50, 25);
		shapes.add(rectangle);
		
		for (Shape shape : shapes) {
			System.out.println(shape.getCharacteristics());
		}
		
	}
}

