// Yousif Alkhalaf

package Unit5Project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RoadRace {
	
	public static void main (String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File("RoadRace.txt"));
		
		ArrayList<Racer> contestants = new ArrayList<Racer>();
		
		while (inFile.hasNext()) {
			int bib = inFile.nextInt();
			int minutes = inFile.nextInt();
			int seconds = inFile.nextInt();
			String s = inFile.nextLine();
			int ID = 0;
			// Turns T or S into an int value
			if (s.contains("S")) {
				ID = 1;
			} else if (s.contains("T")) {
				ID = 2;
			}
			contestants.add(new Racer(bib, minutes, seconds, ID));
		}
		
		// Calls finding best functions
		
		Racer overallFirst = Racer.findBestOverall(contestants);
		Racer bestStudent = Racer.findBestStudent(contestants, overallFirst);
		Racer bestTeacher = Racer.findBestTeacher(contestants, overallFirst);
		
		System.out.println("First Place Overall: " + overallFirst.getBibNum());
		System.out.println("First Place Student: " + bestStudent.getBibNum());
		System.out.println("First Place Teacher: " + bestTeacher.getBibNum());
	}
}
