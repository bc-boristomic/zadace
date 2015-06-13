package ba.home.boris.homework.weekend4.part3;

public class Main {

	public static void main(String[] args) {

		Director d1 = new Director("Mujo Mujic", 1955);
		Director d2 = new Director("Suljo Suljic", 1960);
		Director d3 = new Director("Haso Hasic", 1965);

		Classes[] c1 = new Classes[4];
		c1[0] = new Classes("Prvi A", 31); // Change this number to 30 to check if schools s1 and s3 have same number of students
		c1[1] = new Classes("Drugi B", 28);
		c1[2] = new Classes("Treci C", 25);
		c1[3] = new Classes("Cetvrti D", 24);

		Classes[] c2 = new Classes[8];
		c2[0] = new Classes("Prvi I", 30);
		c2[1] = new Classes("Drugi II", 28);
		c2[2] = new Classes("Treci III", 25);
		c2[3] = new Classes("Cetvrti IV", 24);
		c2[4] = new Classes("Peti V", 31);
		c2[5] = new Classes("Sesti VI", 28);
		c2[6] = new Classes("Sedmi VII", 25);
		c2[7] = new Classes("Osmi VIII", 24);

		Classes[] c3 = new Classes[4];
		c3[0] = new Classes("Prvacici", 30);
		c3[1] = new Classes("Drugi razred", 28);
		c3[2] = new Classes("Treci razred", 25);
		c3[3] = new Classes("Cetvrti razred", 24);

		School s1 = new School("Prva Gimnazija", d1, c1);
		School s2 = new School("Prva Osnovna skola", d2, c2);
		School s3 = new School("Osnovna skola 2", d3, c3);
		
		School[] all = new School[3];
		all[0] = new School("Prva Gimnazija", d1, c1);
		all[1] = new School("Prva Osnovna skola", d2, c2);
		all[2] = new School("Osnovna skola 2", d3, c3);
		
		// Printing results of methods, hover mouse over method name to see what to input
		System.out.println("School " + s3.name + " class " + getNameOfClassWithTheMostStudents(s3) + " have most students.");
		
		System.out.println(getSchoolWithYoungestDirector(all) + "have youngest director.");
		
		System.out.println("School with more students is: " + getNameOfSchoolWithMoreStudents(s1, s3));

	}

	/**
	 * Calculates which class in given school have most students and returns name of that class.
	 * 
	 * @param s Input is School Object
	 * @return <code>String</code> type name of Class with most students
	 */
	public static String getNameOfClassWithTheMostStudents(School s) {
		int max = 0; // Variable for calculating maximum number of students
		String name = ""; // Variable for name of class with max students
		for (int i = 0; i < s.classes.length; i++) { // Goes thru length of all classes in school
			if (s.classes[i].numberOfStudents > max) { // Check for highest number of student in each class
				max = s.classes[i].numberOfStudents; // Highest is this one
				name = s.classes[i].className; // So take it's name
			}
		}
		return name; // Return that name
	}
	
	/**
	 * Calculates which school have youngest director, and returns name of that school.
	 * 
	 * @param schools Input is School Object array
	 * @return Name of school with youngest director
	 */
	public static School getSchoolWithYoungestDirector(School[] schools) {
		int min = 0; // Minimum years to compare to
		School s = schools[0]; // Start at first school
		for (int i = 0; i < schools.length; i++) { // Goes thru all the schools
			if (schools[i].director.yearOfBirth > min) { // Checks which director is youngest
				min = schools[i].director.yearOfBirth; // For youngest director
				s = schools[i]; // Take name of school
			}
		}
		return s; // Return name of that school
	}
	
	/**
	 * Calculates which of two inputed schools have more students 
	 * enrolled and return the name of that school.
	 * 
	 * @param s1 Input is School Object
	 * @param s2 Input is School Object
	 * @return Name of school with more students
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2) {
		int sum1 = 0; // Sum of students in first school
		int sum2 = 0; // Sum of students in second school
		for (int i = 0; i < s1.classes.length; i++) { // Goes thru all the classes in first school
			sum1 += s1.classes[i].numberOfStudents;	// Sums all the students
		}
		for (int i = 0; i < s2.classes.length; i++) { // Goes thru all the classes in second school
			sum2 += s2.classes[i].numberOfStudents;	// Sums all the students	
		}
		if (sum1 > sum2) { // Compare sums, if first is larger 
			return s1.name; // Return name of first school
		} else if (sum1 < sum2) {
			return s2.name; // Or if second have more students return name of second school
		} // Otherwise both schools have same number of students, so return that string 
		return s1.name + " and " + s2.name + " have same number of students";
		
	}
}
