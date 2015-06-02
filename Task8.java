package ba.home.boris.homewoork.weekend2;

public class Task8 {

	public static void main(String[] args) {
		String site = "www.nekastranica.com?name=Jon&surname=Stark";
		int l = site.length(); // Get the length of website name.

		String captureSurname = ""; // String for surname.
		String captureName = ""; // String for name.

		/**
		 * Goes down the length of website name and when finds first '=' stops,
		 * and prints characters after it.
		 */
		for (int i = l - 1; i > 0; i--) {
			char c = site.charAt(i);
			if (site.charAt(i) == '=') {
				break;
			} else {
				captureSurname = c + captureSurname;
			}
		}
		/**
		 * Start from 26 character and prints name before '&' sign. Limitation
		 * but works.
		 */
		for (int i = 26; i < l; i++) {
			char c = site.charAt(i);
			if (site.charAt(i) == '&') {
				break;
			} else {
				captureName += c;
			}
		}

		System.out.printf("Name: %s \n", captureName);
		System.out.printf("Surname: %s ", captureSurname);

	}

}
