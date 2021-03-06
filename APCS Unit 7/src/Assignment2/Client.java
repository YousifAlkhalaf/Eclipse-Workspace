package Assignment2;

import java.util.ArrayList;

public class Client {

	static int x = 0;

	public static void main(String[] args) throws InterruptedException {
		HeavyKnight p1 = new HeavyKnight("Mrs. Richmond", 1);
		Vampire p2 = new Vampire("Mr. Rubin", 2);
		Troll p3 = new Troll("Mr. Selfridge", 3);

		int count = 1;
		int whoseTurn = 0;
		ArrayList<Warrior> players = new ArrayList<Warrior>();
		players.add(p1);
		players.add(p2);
		players.add(p3);

		while (players.size() > 1) {
			int target = -1;
			Thread.sleep(x);
			System.out.printf("<Turn %d>\n\n", count);
			Thread.sleep(x);
			for (Warrior player : players) {
				statUpdate(player);
			}
			System.out.println();

			do {
				target = (int) (Math.random() * players.size());
			} while (target == whoseTurn);

			turnCycle(players, whoseTurn, target);

			if (players.size() == 1) {
				System.out.printf("***Player %d won!***", players.get(0).getPlayerNum());
			}

			count++;

			if (whoseTurn + 1 >= players.size())
				whoseTurn = 0;
			else
				whoseTurn++;
		}
	}

	public static void statUpdate(Warrior player) {
		System.out.printf("P%d - %s (%s): Health = %d, Strength = %d", player.getPlayerNum(), player.getName(),
				player.getType(), player.getHealth(), player.getStrength());
		if (player.getType() == "HeavyKnight") {
			System.out.printf(", Defense = %d", player.getDefense());
		}
		System.out.println();
	}

	public static void turnCycle(ArrayList<Warrior> players, int playerIndex, int targetIndex)
			throws InterruptedException {
		int atk;
		int playerNum = players.get(playerIndex).getPlayerNum();
		int targetNum = players.get(targetIndex).getPlayerNum();
		Thread.sleep(x);
		System.out.printf("Player %d's turn!\n\n", playerNum);
		if (players.get(playerIndex).getHealth() == 0) {
			System.out.printf("Player %d is out!\n\n", playerNum);
			players.remove(playerIndex);
		} else {
			if (players.get(playerIndex).findPoisonApple() != 0) {
				int dmg = players.get(playerIndex).getMaxHealth() / 20;
				Thread.sleep(x);
				System.out.printf("*Player %d eats an apple*\n", playerNum);
				Thread.sleep(x);
				System.out.println("It's poisonous!");
				Thread.sleep(x);
				System.out.printf("Player %d took %d damage!\n\n", playerNum, dmg);
			} else if (players.get(playerIndex).findHealingApple() != 0) {
				int heal = players.get(playerIndex).getMaxHealth() / 20;
				Thread.sleep(x);
				System.out.printf("*Player %d eats an apple*\n", playerNum);
				Thread.sleep(x);
				System.out.println("It's edible!");
				Thread.sleep(x);
				System.out.printf("Player %d gained %d health points!\n\n", playerNum, heal);
			}
			if (players.get(playerIndex).attackUp() == true) {
				Thread.sleep(x);
				System.out.printf("Player %d gains resolve!\n", playerNum);
				Thread.sleep(x);
				System.out.printf("Player %d's strength increased by 1!\n\n", playerNum);
			} else if (players.get(playerIndex).attackDown() == true) {
				Thread.sleep(x);
				System.out.printf("Player %d loses resolve!\n", playerNum);
				Thread.sleep(x);
				if (players.get(playerIndex).getStrength() == 1) {
					System.out.printf("Player %d's strength is at 1, and can't go any lower!\n\n", playerNum);
				} else {
					System.out.printf("Player %d's strength decreased by 1!\n\n", playerNum);
				}
			}
			atk = players.get(playerIndex).getAttackRoll(); // Attack
			Thread.sleep(x);
			System.out.printf("Player %d attacks Player %d!\n", playerNum, targetNum);
			Thread.sleep(x);
			if (atk == 0) {
				System.out.printf("Player %d missed!\n\n", playerNum);
			} else {
				System.out.printf("Player %d's attack did %d damage!\n\n", playerNum, atk);
			}
			players.get(targetIndex).damageCalc(atk);

			if (players.get(playerIndex).getType() == "Vampire") {
				System.out.printf("Player %d gained %d health points!\n\n", playerNum, atk / 3 + 1);
			}

			if (players.get(targetIndex).getDefense() == 0) {
				System.out.printf("Player %d's armor broke! Player %d will now do more damage!\n\n", targetNum,
						targetNum);
			}
		}
	}
}
