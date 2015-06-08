package ba.home.boris.homework.weekend3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GUIProgramming {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		// Draw rectangles and lines with color black.
		g.setColor(Color.BLACK);
		// Main rectangle.
		g.drawRect(10, 10, 800, 550);
		g.drawLine(11, 10, 11, 560); // Bold left line.
		g.drawLine(12, 10, 12, 560); // Another bold left line.
		
		// Inside main rectangle.
		g.drawRect(80, 50, 220, 470); // "lang" rectangle.
		g.drawLine(81, 50, 81, 520); // Bold left line.
		g.drawLine(82, 50, 82, 520); // Bold left line.

		// Inside "lang" rectangle.
		g.drawRect(100, 95, 180, 130); // "math" rectangle.
		g.drawLine(100, 96, 280, 96); // Bold top line.
		g.drawLine(100, 97, 280, 97); // Bold top line.
		g.drawLine(281, 95, 281, 225); // Bold right line.
		g.drawLine(282, 95, 282, 225); // Bold right line.
		// Inside "math" rectangle.
		g.drawRect(130, 125, 140, 40); // "sqrt" rectangle.
		g.drawLine(130, 124, 270, 124); // Bold top line.
		g.drawLine(130, 123, 270, 123); // Bold top line.
		g.drawLine(130, 166, 270, 166); // Bold bottom line.
		g.drawLine(130, 167, 270, 167); // Bold bottom line.
		// Inside "math" rectangle.
		g.drawRect(130, 175, 140, 40); // "random" rectangle.
		
		// Inside "lang" rectangle.
		g.drawRect(100, 260, 180, 80); // "string" rectangle.
		g.drawLine(100, 341, 280, 341); // Bold bottom line.
		g.drawLine(100, 342, 280, 342);	// Bold bottom line.
		g.drawLine(281, 260, 281, 342); // Bold right line.
		g.drawLine(282, 260, 282, 342); // Bold right line.
		
		// Inside "lang" rectangle.
		g.drawRect(100, 380, 180, 80); // "integer" rectangle.
		g.drawLine(100, 461, 280, 461); // Bold top line.
		g.drawLine(100, 462, 280, 462);	// Bold top line.
		g.drawLine(281, 380, 281, 462); // Bold right line.
		g.drawLine(282, 380, 282, 462); // Bold right line.
		
		// Inside main rectangle.
		g.drawRect(350, 50, 220, 470); // "awt" rectangle.
		// Inside "awt" rectangle.
		g.drawRect(370, 95, 180, 130); // "graphics" rectangle.
		g.drawLine(370, 96, 550, 96); // Bold top line.
		g.drawLine(370, 97, 550, 97); // Bold top line.
		g.drawLine(551, 95, 551, 225); // Bold right line.
		g.drawLine(552, 95, 552, 225); // Bold right line.
		// Inside "graphics" rectangle.
		g.drawRect(400, 125, 140, 40); // "draw" rectangle.
		g.drawLine(400, 124, 540, 124); // Bold top line.
		g.drawLine(400, 123, 540, 123); // Bold top line.
		g.drawLine(400, 166, 540, 166); // Bold bottom line.
		g.drawLine(400, 167, 540, 167); // Bold bottom line.
		// Inside "graphics" rectangle.
		g.drawRect(400, 175, 140, 40); // "setcolor" rectangle.
		
		// Inside "awt" rectangle.
		g.drawRect(370, 260, 180, 80); // "color" rectangle.
		g.drawLine(370, 341, 550, 341); // Bold bottom line.
		g.drawLine(370, 342, 550, 342);	// Bold bottom line.
		g.drawLine(551, 260, 551, 342); // Bold right line.
		g.drawLine(552, 260, 552, 342); // Bold right line.
				
		// Inside "awt" rectangle.
		g.drawRect(370, 380, 180, 80); // "font" rectangle.
		g.drawLine(370, 461, 550, 461); // Bold top line.
		g.drawLine(370, 462, 550, 462);	// Bold top line.
		g.drawLine(551, 380, 551, 462); // Bold right line.
		g.drawLine(552, 380, 552, 462); // Bold right line.
		
		// Inside main rectangle.
		g.drawRect(625, 50, 160, 470); // "util" rectangle.
		g.drawLine(786, 50, 786, 520); // Bold right line.
		g.drawLine(787, 50, 787, 520); // Bold right line.
		
		
		// Write here.
		g.setColor(Color.BLUE);
		g.setFont(new Font("Cambria", Font.BOLD, 20));
		g.drawString("java", 20, 30); // Java string top left corner.
		g.drawString("lang", 85, 70); // Lang string top left corner of "lang" rectangle.
		g.drawString("awt", 355, 70); // Awt string top left corner of "awt" rectangle.
		g.drawString("util", 630, 70); // Util string top left corner of "util" rectangle.
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("Cambria", Font.BOLD, 17));
		g.drawString("Math", 105, 115); // Math string top left corner of "math" rectangle.
		g.drawString("Graphics", 375, 115); // Graphics string top left corner of "graphics" rectangle.
		g.drawString("String", 120, 300);
		g.drawString("Integer", 120, 420);
		g.drawString("Color", 380, 300);
		g.drawString("Font", 390, 420);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 14));
		g.drawString("sqrt ()", 150, 145);
		g.drawString("random ()", 150, 195);
		g.drawString("drawRect ()", 420, 145);
		g.drawString("setColor()", 420, 195);
		
		

		// *******************
		w.setImage(img);

	}
}
