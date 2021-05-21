package Garden;

import java.util.Scanner;
import Player.Player;
import java.io.Console;
import java.io.IOException;

public class Client {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Player p = new Player();
		System.out.println("Hello World!\n");
		while (true) {
			mainMenu(p);
			System.out.println("\nInput a number to continue");
			scan.nextInt();
			shiftClear(1000);
		}
	}

	/*
	 * Method that takes int input and returns an int. Checks to see if the input is
	 * between 1 and max, requiring new input if invalid
	 */
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

	/*
	 * Same as above but between min and max instead of 1 and max
	 */
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

	public static void mainMenu(Player p) {
		System.out.println("1. Active Chao");
		System.out.println("2. Items");
		System.out.println("3. My Chao\n");
		int n = getInput(3);
		shiftClear(6);

		if (n == 1) {
			p.chao().chaoStats();
		} else if (n == 2) {
			p.itemPrint();
		} else {
			p.chaoPrint();
		}
	}

	public static void shiftClear(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println();
		}
		
	}
}
