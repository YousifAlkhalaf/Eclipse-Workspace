package Assignment2;

import Assignment2.Warrior;

public class Client {

	public final static int SECONDS_TO_MILLISECONDS(double seconds) {
		return (int) seconds * 1000;
	}

	public static void main(String[] args) throws InterruptedException {
		HeavyKnight p1 = new HeavyKnight("Mrs. Richmond");
		Vampire p2 = new Vampire("Mr. Rubin");
		int atk;
		int count = 1;

		for (boolean isP1Turn = true; p1.getHealth() > 0 && p2.getHealth() > 0; isP1Turn = !isP1Turn) {
			Thread.sleep(500);
			System.out.printf("<Turn %d>\n\n", count);
			Thread.sleep(1500);
			System.out.printf("%s (%s): Health = %d, Strength = %d", p1.getName(), p1.getType(), p1.getHealth(),
					p1.getStrength());
			if (p1.getClass() == HeavyKnight.class) {
				System.out.printf(", Defense = %d", p1.getDefense());
			}
			System.out.println();

			System.out.printf("%s (%s): Health = %d, Strength = %d", p2.getName(), p2.getType(), p2.getHealth(),
					p2.getStrength());
			if (p2.getType() == "HeavyKnight") {
				System.out.printf(", Defense = %d", p2.getDefense());
			}
			System.out.println("\n");

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
}
