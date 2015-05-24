package home.boris.homework.weekend1;

public class Task8 {

	public static void main(String[] args) {
		
		/* Calculate distance in 3D space given starting point x, y, z?
		 * Square root of x^2+y^2+z^2.
		 */
		
		int x = 2;
		int y = 4;
		int z = 6;
		double distance = Math.sqrt(x*x+y*y+z*z);
		System.out.printf("Distance from starting points is %.3f", distance);
	}

}
