package Assignment2;

public class Troll extends Warrior {

	// Hits for 1.5x normal damage, but misses 15% of the time.

	public Troll(String name, int n) {
		super(name, n);
		this.type = "Troll";
	}

	public int getAttackRoll() {
		int die1 = (int) (Math.random() * 6 + 1);
		int die2 = (int) (Math.random() * 6 + 1);
		int atk = 0;
		int hitChance = (int) (Math.random() * 100 + 1);

		if (hitChance <= 85) {
			atk = (int) ((die1 + die2) * strength * 1.5);
		}

		return atk;
	}
}
