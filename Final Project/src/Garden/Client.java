package Garden;

import java.util.Scanner;

import Items.CommonBerry;
import Items.SmallBerry;
import Player.Player;
import java.io.IOException;

public class Client {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Player p = new Player(1);
		p.item().add(new SmallBerry());
		p.item().add(new CommonBerry());
		//asciiChao();
		
		mainMenu(p);
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

	// Main menu
	public static void mainMenu(Player p) {
		asciiChao();
		System.out.println("Coins: " + p.coins());
		System.out.println("\n1. Active Chao");
		System.out.println("2. Items");
		System.out.println("3. Reserve Chao");
		System.out.println("4. Shop");
		System.out.println("5. Race\n");
		int n = getInput(5);
		shiftClear(6);

		if (n == 1) {
			p.chao().chaoStats();
			System.out.println("\n1. Return to Main Menu\n");
			getInput(1);
			shiftClear(6);
			mainMenu(p);
		} else if (n == 2) {
			p.itemMenu();
		} else if (n == 3) {
			p.chaoMenu();
		} else if (n == 4){
			new Shop().shopMenu(p);
		} else {
			Race.raceMenu(p);
		}
	}

	// Makes n new lines
	public static void shiftClear(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println();
		}

	}
	
	// Below is an ASCII title screen for the project
	
	public static void asciiChao() {
		System.out.println("      _                                          _");
		System.out.println("     | |                                        | |");
		System.out.println("  ___| |__   __ _  ___        __ _  __ _ _ __ __| | ___ _ __");
		System.out.println(" / __| '_ \\ / _` |/ _ \\      / _` |/ _` | '__/ _` |/ _ \\ '_ \\");
		System.out.println("| (__| | | | (_| | (_) |    | (_| | (_| | | | (_| |  __/ | | |");
		System.out.println(" \\___|_| |_|\\__,_|\\___/      \\__, |\\__,_|_|  \\__,_|\\___|_| |_|");
		System.out.println("                              __/ |");
		System.out.println("                             |___/ ");
	}
}
