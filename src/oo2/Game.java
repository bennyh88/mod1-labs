package oo2;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import lab02.Account;
import oo2.ShapeType;
import oo2.Shape;

public class Game extends Canvas {

	Shape[] shape = new Shape[5];
	
	Game() {
		shape[0] = new Shape(12,11,50,50,1,1, ShapeType.Rectangle);
		shape[1] = new Shape(40,100,80,30,2,2, ShapeType.ThreeDRectangle);
		shape[2] = new Shape(40,100,30,20,1,2, ShapeType.RoundRectangle);
		shape[3] = new Shape(40,50,80,35,2,1, ShapeType.Oval);
		shape[4] = new Shape(40,100,30,60,-2,1, ShapeType.Arc);

		
		Shape.worldH = 300;
		Shape.worldW = 200;
		
		JFrame frame = new JFrame();
		this.setSize(Shape.worldW, Shape.worldH);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);

		
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};
	
		t.schedule(tt, 0, 50);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}

	public void draw() {

		for (Shape shape : shape) {
			shape.move();
		}
		this.repaint();
	}

	
	public void paint(Graphics g) {
		g.drawRect(0, 0, Shape.worldW, Shape.worldH);

		for (Shape shape : shape) {
			shape.move();
			switch(shape.getShapeType()) {
				case ShapeType.Rectangle:
					g.setColor(shape.getColor());
					g.fillRect(shape.x, shape.y, shape.w, shape.h);
					break;
				case ShapeType.ThreeDRectangle:
					g.setColor(shape.getColor());
					g.fillOval(shape.x, shape.y, shape.w, shape.h);
					break;
				case ShapeType.RoundRectangle:
					g.setColor(shape.getColor());
					g.fillRoundRect(shape.x, shape.y, shape.w, shape.h, 5, 5);
					break;
				case ShapeType.Oval:
					g.setColor(shape.getColor());
					g.fillOval(shape.x, shape.y, shape.w, shape.h);
					break;
				case ShapeType.Arc:
					g.setColor(shape.getColor());
					g.fillArc(shape.x, shape.y, shape.w, shape.h, 120, 240);
					break;
				default:
					// shape not yet implemented, draw an oval
					g.drawOval(shape.x, shape.y, shape.w, shape.h);
			}
			   
		}

	}
}
