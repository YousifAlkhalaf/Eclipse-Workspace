package Assignment2;

public class HeavyKnight extends Warrior{

	private int defense;
	
	// When defense > 0, the knight takes half damage. Otherwise, it deals 1.75x damage and takes double damage.
	
	public HeavyKnight(String name, int n) {
		super(name, n);
		this.defense = (int) (Math.random() * 3 + 2);
		this.type = "HeavyKnight";
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
			atk *= 1.75;
		}
		return atk;
	}

}
