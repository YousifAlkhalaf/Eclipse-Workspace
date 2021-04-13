package Unit3Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Golf_Alkhalaf {

	public static String whoWon() throws FileNotFoundException { // Finds out who won the game

		int aTotal = 0, bTotal = 0, a = 0, b = 0;
		Scanner inFile = new Scanner(new File("data.txt")); 
		while (inFile.hasNext()) {
			inFile.nextInt(); // Skips par value
			a = inFile.nextInt();
			b = inFile.nextInt();
			aTotal += a; // Adds hole score to total scores
			bTotal += b;
		}
		inFile.close(); // Determines winner by finding lower score
		if (aTotal < bTotal) {
			return String.format("Player A won %d to %d", aTotal, bTotal);
		} else if (bTotal < aTotal) {
			return String.format("Player B won %d to %d", bTotal, aTotal);
		} else {
			return String.format("Both players tied, each with a score of %d", aTotal);
		}
	}

	public static String parA() throws FileNotFoundException { // Finds player A's score relative to par

		int parTotal = 0, scoreTotal = 0, par = 0, score = 0;
		Scanner inFile = new Scanner(new File("data.txt"));
		while (inFile.hasNext()) {
			par = inFile.nextInt();
			score = inFile.nextInt();
			inFile.nextInt(); // Skips score for Player B
			parTotal += par; // Adds par to a total value, same with score
			scoreTotal += score;
		}
		inFile.close();
		// Chooses which string to return based on score relative to par
		if (parTotal < scoreTotal) {
			return String.format("Player A: %d over par", scoreTotal - parTotal);
		} else if (parTotal > scoreTotal) {
			return String.format("Player A: %d under par", parTotal - scoreTotal);
		} else {
			return String.format("Player A: At par");
		}
	}

	public static String parB() throws FileNotFoundException { // Finds player B's score relative to par

		int parTotal = 0, scoreTotal = 0, par = 0, score = 0;
		Scanner inFile = new Scanner(new File("data.txt"));
		while (inFile.hasNext()) {
			par = inFile.nextInt();
			inFile.nextInt(); // Skips Player A score
			score = inFile.nextInt();
			parTotal += par; // Adds par to a total value, same with score
			scoreTotal += score;
		}
		inFile.close();
		if (parTotal < scoreTotal) {
			// Chooses which string to return based on score relative to par
			return String.format("Player B: %d over par", scoreTotal - parTotal);
		} else if (parTotal > scoreTotal) {
			return String.format("Player B: %d under par", parTotal - scoreTotal);
		} else {
			return String.format("Player B: At par");
		}
	}

	public static String holeWins() throws FileNotFoundException { // Finds out how many holes the winning player won

		int winsA = 0, winsB = 0, scoreA = 0, scoreB = 0, aTotal = 0, bTotal = 0;
		Scanner inFile = new Scanner(new File("data.txt"));
		while (inFile.hasNext()) {
			inFile.nextInt(); // Skips par
			scoreA = inFile.nextInt();
			scoreB = inFile.nextInt();
			aTotal += scoreA;
			bTotal += scoreB;
			// Calculates who won the hole
			if (scoreA > scoreB) {
				winsB++;
			} else if (scoreB > scoreA) {
				winsA++;
			}
		}
		// Decides who's amount of won holes should be displayed based on lower total score
		if (bTotal > aTotal) {
			return String.format("Player A won %d holes", winsA);
		} else if (aTotal > bTotal) {
			return String.format("Player B won %d holes", winsB);
		} else {
			return String.format("Both players tied at %d holes each", winsA);
		}
	}

	public static String toughestHole() throws FileNotFoundException { // Finds out how many holes the winning player
																		// won

		int toughestHole = 0, toughestShots = 0, scoreA = 0, scoreB = 0, holeCount = 1;
		Scanner inFile = new Scanner(new File("data.txt"));
		while (inFile.hasNext()) {
			inFile.nextInt(); // Skips par
			scoreA = inFile.nextInt();
			scoreB = inFile.nextInt();
			// Calculates whether or not the hole is the toughest one yet, 
			// > sign makes sure that the default toughest hole is the first listed hole
			if (scoreA + scoreB > toughestShots) {
				toughestShots = scoreA + scoreB;
				toughestHole = holeCount;
			}
			holeCount++;
		}
		return String.format("The toughest hole was #%d (%d shots)", toughestHole, toughestShots);
	}

	public static void main(String[] args) throws FileNotFoundException { // Calls all the methods and prints them out
		System.out.println(whoWon());
		System.out.println(parA());
		System.out.println(parB());
		System.out.println(holeWins());
		System.out.println(toughestHole());
	}

}
