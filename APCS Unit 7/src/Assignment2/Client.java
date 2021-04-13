package Assignment2;

import java.util.ArrayList;

public class Client {

	public final static int SECONDS_TO_MILLISECONDS(double seconds) {
		return (int) seconds * 1000;
	}

	public static void main(String[] args) throws InterruptedException {
		HeavyKnight p1 = new HeavyKnight("Mrs. Richmond");
		Vampire p2 = new Vampire("Mr. Rubin");
		Troll p3 = new Troll("Mr. Selfridge");
		
		int atk;
		int count = 1;
		ArrayList<Warrior> players = new ArrayList<Warrior>();
		players.add(p1);
		players.add(p2);
		players.add(p3);

		for (boolean isP1Turn = true; p1.getHealth() > 0 && p2.getHealth() > 0; isP1Turn = !isP1Turn) {
			Thread.sleep(500);
			System.out.printf("<Turn %d>\n\n", count);
			Thread.sleep(1500);
			for (Warrior player: players) {
				statUpdate(player);
			}
			System.out.println();

			if (isP1Turn == true) {
				Thread.sleep(1500);
				if (p1.findPoisonApple() != 0) {
					int dmg = p1.getMaxHealth() / 20;
					Thread.sleep(1500);
					System.out.println("*Player 1 eats an apple*");
					Thread.sleep(1500);
					System.out.println("It's poisonous!");
					Thread.sleep(1500);
					System.out.printf("Player 1 took %d damage!\n\n", dmg);
				} else if (p1.findHealingApple() != 0) {
					int heal = p1.getMaxHealth() / 20;
					Thread.sleep(1500);
					System.out.println("*Player 1 eats an apple*");
					Thread.sleep(1500);
					System.out.println("It's edible!");
					Thread.sleep(1500);
					System.out.printf("Player 1 gained %d health points!\n\n", heal);
				}
				if (p1.attackUp() == true) {
					Thread.sleep(1500);
					System.out.println("Player 1 gains resolve!");
					Thread.sleep(1500);
					System.out.println("Player 1's strength increased by 1!\n");
				} else if (p1.attackDown() == true) {
					Thread.sleep(1500);
					System.out.println("Player 1 loses resolve!");
					Thread.sleep(1500);
					if (p1.getStrength() == 1) {
						System.out.println("Player 1's strength is at 1, and can't go any lower!\n");
					} else {
						System.out.println("Player 1's strength decreased by 1!\n");
					}
				}
				atk = p1.getAttackRoll(); // Attack
				Thread.sleep(1500);
				System.out.println("Player 1 attacks Player 2!");
				Thread.sleep(1500);
				System.out.printf("Player 1's attack did %d damage!\n\n", atk);
				p2.damageCalc(atk);
			} else {
				if (p2.findPoisonApple() != 0) {
					int dmg = p2.getMaxHealth() / 20;
					Thread.sleep(1500);
					System.out.println("*Player 2 eats an apple*");
					Thread.sleep(1500);
					System.out.println("It's poisonous!");
					Thread.sleep(1500);
					System.out.printf("Player 2 took %d damage!\n\n", dmg);
				} else if (p2.findHealingApple() != 0) {
					int heal = p2.getMaxHealth() / 20;
					Thread.sleep(1500);
					System.out.println("*Player 2 eats an apple*");
					Thread.sleep(1500);
					System.out.println("It's edible!");
					Thread.sleep(1500);
					System.out.printf("Player 2 gained %d health points!\n\n", heal);
				}
				if (p2.attackUp() == true) {
					Thread.sleep(1500);
					System.out.println("Player 2 gains resolve!");
					Thread.sleep(1500);
					System.out.println("Player 2's strength increased by 1!\n");
				} else if (p2.attackDown() == true) {
					Thread.sleep(1500);
					System.out.println("Player 2 loses resolve!");
					Thread.sleep(1500);
					if (p2.getStrength() == 1) {
						System.out.println("Player 2's strength is at 1, and can't go any lower!\n");
					} else {
						System.out.println("Player 2's strength decreased by 1!\n");
					}
				}
				atk = p2.getAttackRoll();
				Thread.sleep(1500);
				System.out.println("Player 2 attacks Player 1!");
				Thread.sleep(1500);
				System.out.printf("Player 2's attack did %d damage!\n\n", atk);
				p1.damageCalc(atk);
			}

			if (p1.getHealth() <= 0) {
				System.out.println("***Player 2 has beaten Player 1!***");
			} else if (p2.getHealth() <= 0) {
				System.out.println("***Player 1 has beaten Player 2!***");
			}

			atk = 0;
			count++;
		}
	}
	
	public static void statUpdate (Warrior player) {
		System.out.printf("%s (%s): Health = %d, Strength = %d", player.getName(), player.getType(), player.getHealth(),
				player.getStrength());
		if (player.getType() == "HeavyKnight") {
			System.out.printf(", Defense = %d", player.getDefense());
		}
		System.out.println();
	}
}
