package Assignment1B;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IM1Runner {

	public static void main (String[] args) throws FileNotFoundException {
		
		Scanner inFile = new Scanner(new File("IM1 Retake.txt"));
		int[] id = new int[10], firstScore = new int[10], retakeScore = new int[10];
		
		for (int i = 0; inFile.hasNextInt(); i++) {
			id[i] = inFile.nextInt();
			firstScore[i] = inFile.nextInt();
			retakeScore[i] = inFile.nextInt();
		}
		IM1Student x = new IM1Student(id, firstScore, retakeScore);
		System.out.println("# of students retaking the test: " + x.retakerAmount());
		System.out.println("# of students improving: " + x.amountImproving());
		System.out.printf("Average increase in scores: %.2f points", x.boostAverage());
	}
}
