package Assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TheResistance {
	public static String writeResistance(int count, int circuitCount) throws FileNotFoundException {

		Scanner inFile = new Scanner(new File("C:/Users/yousi/Resistance.txt"));

		for (; count > 1; count--) {
			double dummy = inFile.nextDouble();
		}

		double r1 = inFile.nextDouble();
		double r2 = inFile.nextDouble();
		double r3 = inFile.nextDouble();
		double parallelTotal = 1 / ((1 / r1) + (1 / r2));
		double resistance = parallelTotal + r3;

		return String.format("Circuit %d: Total resistance is %.2f ohms\n", circuitCount, resistance);
	}

	public static void main(String[] args) throws IOException {
		int cycleCount = 1;
		int circuitCount = 1;
		while (cycleCount <= 18) {
			System.out.print(writeResistance(cycleCount, circuitCount));
			cycleCount+= 3;
			circuitCount++;
		}
		System.out.print("End of file");

	}
}
