package Items;

import Chao.Chao;

public class BitterMedicine extends Item {
	public BitterMedicine() {
		super("Bitter Medicine", "Chao Item", "Raises many of your Chao's stats, but your Chao wont like it one bit!",
				200);
	}
	
	public void use(Chao chao) {
		chao.changeFly(20);
		chao.changeSwim(20);
		chao.changeFly(20);
		chao.levelUp(50);
		chao.changeMood(-75);
	}
}
