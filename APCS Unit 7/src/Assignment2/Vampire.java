package Assignment2;

public class Vampire extends Warrior {

	// Gains 1/4 of the HP it takes away from the opponent plus one HP
	
	public Vampire(String name) {
		super(name);
		this.type = "Vampire";
	}

	public int getAttackRoll() {
		int die1 = (int) (Math.random() * 6 + 1);
		int die2 = (int) (Math.random() * 6 + 1);
		int atk = (die1 + die2) * strength;

		int gainedHP = atk/4 + 1;
		if (gainedHP + health > maxHealth) {
			health = maxHealth;
		} else {
			health += gainedHP;
		}
		return atk;
	}

	public int getDefense() {
		return -1;
	}

}
