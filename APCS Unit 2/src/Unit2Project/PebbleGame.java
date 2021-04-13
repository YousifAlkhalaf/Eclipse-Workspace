//Yousif Alkhalaf

package Unit2Project;

import java.util.Scanner;

public class PebbleGame {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int pebbles = 0;
		boolean isPlayerTurn = false;
		int playerMove = 0;
		int opponentMove = 0;
		int turnNumber = 1;

		System.out.println("Pebble Game!\n");
		System.out.println(
				"In this game, you and a bot take turns removing 1 or 2 pebbles from a pile. Whoever is the last to take the remaining pebbles loses!");
		System.out.print("Select a starting number of pebbles. The minimum amount is 2 pebbles. ");
		while (pebbles < 2) {
			pebbles = scan.nextInt();
		}
		System.out.println("\nPebbleBot will choose who goes first.");

		// PebbleBot chooses to go first or second
		if (pebbles % 3 == 1) {
			System.out.println("\nYou will go first.\n");
			isPlayerTurn = true;
		} else {
			System.out.println("\nPebbleBot will go first.\n");
			isPlayerTurn = false;
		}

		// Turn cycle
		for (; pebbles > 0; opponentMove = 0, playerMove = 0, turnNumber++, isPlayerTurn = !isPlayerTurn) { // Lines to show game status
			System.out.println("<Turn " + turnNumber + ">");
			System.out.println("--There are " + pebbles + " pebbles remaining--\n");

			if (isPlayerTurn == true) { // Human player
				System.out.println("#Human player's turn!#\n");
				if (pebbles == 1) { // force chooses 1 if that's the only option
					playerMove = 1;
				} else {
					System.out.print("How many pebbles will you take away? 1 or 2? ");
					while (playerMove < 1 || playerMove > 2) {
						playerMove = scan.nextInt();
					}
				}
				pebbles = pebbles - playerMove;
				System.out.println("***You take away " + playerMove + " pebbles.***\n");
			} else { // Opponent AI
				System.out.println("#PebbleBot's turn!#\n");
				if (pebbles == 1) { // force chooses 1 if that's the only option
					opponentMove = 1;
				} else if ((pebbles - 2) % 3 == 1) { // defaulting to 2
					opponentMove = 2;
				} else {
					opponentMove = 1;
				}
				pebbles = pebbles - opponentMove; // remove pebble function
				System.out.println("***PebbleBot takes away " + opponentMove + " pebbles.***\n");
			}

			if (pebbles == 0) { //Game end check
				if (isPlayerTurn == true) {
					System.out.println("Human player loses! PebbleBot wins!");
				} else {
					System.out.println("PebbleBot loses! Human player wins!");
				}
			}
		}

		scan.close();
	}
}
