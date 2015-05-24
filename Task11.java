package home.boris.homework.weekend1;

public class Task11 {
	public static void main(String[] args) {

		/* With plane take of hours and minutes and flight minutes calculate plane touch down hours and minutes.
		 * Works until end of 24 hrs, after that shows illegal time.   
		*/
		int hrsTakeOff = 0;
		int minTakeOff = 0;

		int minFlight = 1440; // 1400 flight minutes max for 00:00 take off time.							

		int minAll = minTakeOff + minFlight;

		int hrsTouchDown = 0;
		int minTouchDown = 0;

		boolean b = hrsTakeOff >= 0 && hrsTakeOff <= 23 && minTakeOff >= 0 && minTakeOff <= 59;

		if (b) {
			hrsTouchDown = minAll / 60;
			minTouchDown = minAll % 60;
			hrsTouchDown = hrsTakeOff + hrsTouchDown;
			System.out.printf("Plane lands at %02d:%02d", hrsTouchDown, minTouchDown);
		} else {
			System.out.println("Please enter time correctly.");
		}

	}
}
