package home.boris.homework.weekend1;

public class Task12 {

	public static void main(String[] args) {
		/* Given radius, check if ball is good quality.
		 * Volume 6.014 with deviation +- 0.05% is considered good.
		*/
		
		double ballRadius = 1.1281;
		double ballVolume = (4 * ballRadius * ballRadius * ballRadius * Math.PI) / 3;
		double volume = 6.014;
		double qualityCheck1 = volume + 0.05 / 100;
		double qualityCheck2 = volume - 0.05 / 100;
		
		if (qualityCheck1 >= ballVolume && ballVolume >= qualityCheck2) {
			System.out.println("Quality checks!");
		} else {
			System.out.println("Poor quality!");
		}
		
				
	}

}
