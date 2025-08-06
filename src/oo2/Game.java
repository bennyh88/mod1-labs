package oo2;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import lab02.Account;

class Ball {
	public static int worldW;
	public static int worldH;
	
	public int x,y,w,h,dirX, dirY;
	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x; this.y = y; this.w = w; this.h = h; this.dirX = dirX; this.dirY = dirY;
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
		}
		
		if( y < 0 || y > (worldH-this.h)) {
			//y=0;
			dirY = -dirY;
		}
	}
}


public class Game extends Canvas {
	// create an array of 3 balls 
	// call this array balls
	Ball[] balls = new Ball[3];
	

	Game() {
		balls[0] = new Ball(12,11,50,50,1,1);
		balls[1] = new Ball(40,100,30,30,2,1);
		balls[2] = new Ball(40,100,80,30,2,2);
		
		Ball.worldH = 300;
		Ball.worldW = 200;
		
		JFrame frame = new JFrame();
		this.setSize(Ball.worldW, Ball.worldH);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);

		//
//		for (Ball ball : balls) {
//			ball.setWorld(300, 300);  
//		}
		
		
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
// call the move() method of each balls
// Tip: use an enhanced for loop to pick 
//	  each ball in the balls array.
		for (Ball ball : balls) {
			ball.move();
		}
		this.repaint();
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, Ball.worldW, Ball.worldH);
// move and draw each ball in balls array
// Tip: use an enhanced for loop to pick 
//	  each ball in the balls array.
		for (Ball ball : balls) {
			ball.move();
			g.drawOval(ball.x, ball.y, ball.w, ball.h);   
		}

	}
}
