package Assignment6;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("What is your minumum value? ");
		int minValue = scan.nextInt();
		System.out.print("What is your maximum value? ");
		int maxValue = scan.nextInt();

		int rowUp = 0;
		int columnUp = 0;
		int nextNum = 0;

		for (System.out.print("\n   "); (minValue + rowUp) <= maxValue; rowUp++) {
			System.out.print((minValue + rowUp) + "  ");
		}
		rowUp = 0;

		for (; (minValue + columnUp) <= maxValue; columnUp++) {
			System.out.println("");
			System.out.print((minValue + columnUp) + "  ");

			for (; (minValue + rowUp) <= maxValue; rowUp++) {
				nextNum = (minValue + rowUp) * (minValue + columnUp);
				if (nextNum < 10)
					System.out.print(nextNum + "  ");
				else
					System.out.print(nextNum + " ");
			}
			rowUp = 0;
		}
		System.out.println("\n\nMultiplication table produced!");
		scan.close();
	}
}
