package Garden;

import java.util.Scanner;

public class Client {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
	}

	/* Method that takes int input and
	 * returns an int.
	 * Checks to see if the input is
	 * between 1 and max, requiring new
	 * input if invalid
	 * */
	public static int getInput(int max) {
		while (true) {
			System.out.print("Enter input: ");
			int n = scan.nextInt();
			if (n < 1 || n > max) {
				System.out.println("Invalid input. Try again.");
			} else {
				return n;
			}
		}
	}
	
	/* Same as above but between min and max
	 * instead of 1 and max
	 * */
	public static int getInput(int max, int min) {
		while (true) {
			System.out.print("Enter input: ");
			int n = scan.nextInt();
			if (n < min || n > max) {
				System.out.println("Invalid input. Try again.");
			} else {
				return n;
			}
		}
	}
}
