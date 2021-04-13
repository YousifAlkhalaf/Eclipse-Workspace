package Assignment2;

public class Vampire extends Warrior {

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

	public void damageCalc(int attack) {
		if (health - attack > 0) {
			this.health -= attack;
		} else {
			this.health = 0;
		}
	}

	public int getDefense() {
		return -1;
	}

}
