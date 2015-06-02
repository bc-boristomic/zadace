package ba.home.boris.week3.day2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task3 {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		// Set color for strings, and draw them.
		g.setColor(Color.BLACK);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("An Array of numbers", 190, 20);
		g.setFont(new Font("Cambria", Font.PLAIN, 12));
		g.drawString("Type int", 250, 85);
		
		// Create 10 squares.
		for (int i = 0; i < 10; i++) {
			int x = i * 50;
			g.drawRect(40+ x, 30, 35, 35);
		}
		
		// Fill squares with random numbers.
		for (int i = 0; i < 10; i++) {
			int x = i * 50;
			int num = (int)(10 * (Math.random()));
			g.setFont(new Font("Cambria", Font.BOLD, 14));
			String s = String.valueOf(num);
			g.drawString(s, 55 + x, 55);
		}
		
		

		// *******************
		w.setImage(img);

	}

}
