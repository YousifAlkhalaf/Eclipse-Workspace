package Assignment2;

public class HeavyKnight extends Warrior{

	private int defense;
	
	public HeavyKnight(String name) {
		super(name);
		this.defense = (int) (Math.random() * 3 + 2);
		this.type = "Heavy Knight";
	}
	
	public int getDefense() {
		return defense;
	}
	
	public void damageCalc(int attack) {
		if (defense > 0) {
			attack /= 2;
			defense--;
		} else {
			attack *= 2;
		}
		if (health - attack > 0) {
			health -= attack;
		} else {
			health = 0;
		}
	}
	
	public int getAttackRoll() {
		int die1 = (int) (Math.random() * 6 + 1);
		int die2 = (int) (Math.random() * 6 + 1);
		int atk = (die1+die2) * strength;
		
		if (defense <= 0) {
			atk *= 2;
		}
		return atk;
	}

}