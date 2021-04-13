package Assignment1A;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FindTheFailures {
	public static int findGrade(double[] grades, double min, double max) throws FileNotFoundException {
		int inGrade = 0;
		for (double grade : grades) {
			if (grade >= min && grade <= max) {
				inGrade++;
			}
		}
		return inGrade;
	}

	public static void main(String[] args) throws IOException {

		double[] arr = new double[25];
		Scanner inFile = new Scanner(new File("Grades.txt"));
		for (int i = 0; i < 25; i++) {
			arr[i] = inFile.nextDouble();
		}

		System.out.print(" A | B | C | D | F \n");
		System.out.print("---+---+---+---+---\n");
		System.out.printf(" %d |", findGrade(arr, 90, 100));
		System.out.printf(" %d |", findGrade(arr, 80, 89.99));
		System.out.printf(" %d |", findGrade(arr, 70, 79.99));
		System.out.printf(" %d |", findGrade(arr, 60, 69.99));
		System.out.printf(" %d ", findGrade(arr, 50, 59.99));

	}
}
