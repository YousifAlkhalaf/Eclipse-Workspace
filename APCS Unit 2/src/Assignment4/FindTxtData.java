package Assignment4;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class FindTxtData {

	public static void main(String[] args) throws IOException {

		Scanner inFile = new Scanner(new File("DataFile.txt"));

		double mean = 0;
		double number = 0;
		int dataPoints = 0;
		double maxValue = inFile.nextDouble();
		double minValue = inFile.nextDouble();

		while (inFile.hasNext()) {

			number = inFile.nextDouble();
			mean = number + mean;
			dataPoints++;

			if (minValue > number) {
				minValue = number;
			}
			else if (maxValue < number) {
				maxValue = number;
			}	
		}
		mean = mean/dataPoints;
		System.out.printf("Mean = %.2f\n", mean);
		System.out.printf("Minimum = %.2f\n", minValue);
		System.out.printf("Maximum = %.2f", maxValue);
	}
}
