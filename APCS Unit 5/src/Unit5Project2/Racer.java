package Unit5Project2;

import java.util.ArrayList;

public class Racer {

	private int bibNum, minutes, seconds, schoolID;

	// Constructor
	public Racer(int bibNum, int minutes, int seconds, int schoolID) {
		this.bibNum = bibNum;
		this.minutes = minutes;
		this.seconds = seconds;
		this.schoolID = schoolID;
		// SchoolID is 1 for students, 2 for teachers
		// All other variables are read directly from the text file
	}

	// Getters
	public int getBibNum() {
		return bibNum;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public int getSchoolID() {
		return schoolID;
	}

	// Finding best overall
	public static Racer findBestOverall(ArrayList<Racer> list) {
		int fastestTime = -1; // -1 is invalid time, and will be replaced by a Racer's time
		Racer fastestRacer = null;

		for (Racer r : list) {
			int totalTime = (60 * r.getMinutes()) + r.getSeconds(); // Total seconds value
			if (fastestTime > totalTime || fastestTime == -1) {
				fastestTime = totalTime;
				fastestRacer = r;
			}
		}
		return fastestRacer;
	}

	// Finding best student, excluding the first place winner
	// Adds ID and 1st place checks to bestOverall code
	public static Racer findBestStudent(ArrayList<Racer> list, Racer best) {
		int fastestTime = -1;
		Racer fastestRacer = null;

		for (Racer r : list) {
			if (r.getSchoolID() == 1) { // Checks that the racer is a student
				if (r != best) { // Checks that the racer isn't 1st place
					
					// Same as best overall
					int totalTime = (60 * r.getMinutes()) + r.getSeconds();
					if (fastestTime > totalTime || fastestTime == -1) {
						fastestTime = totalTime;
						fastestRacer = r;
					}
				}
			}
		}
		return fastestRacer;
	}
	
	// Finds best teacher excluding 1st place
	// Carbon copy of best student code besides the ID check
	public static Racer findBestTeacher(ArrayList<Racer> list, Racer best) {
		int fastestTime = -1;
		Racer fastestRacer = null;

		for (Racer r : list) {
			if (r.getSchoolID() == 2) { // Checks that the racer is a teacher
				if (r != best) { // Checks that the racer isn't 1st place
					
					// Same as best overall
					int totalTime = (60 * r.getMinutes()) + r.getSeconds();
					if (fastestTime > totalTime || fastestTime == -1) {
						fastestTime = totalTime;
						fastestRacer = r;
					}
				}
			}
		}
		return fastestRacer;
	}
}
