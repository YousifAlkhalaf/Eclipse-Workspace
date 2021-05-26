package Items;

import Chao.Chao;

public class WaterCrystal extends Item {
	public WaterCrystal() {
		super("Water Crystal", "Chao Item", "Raises a Chao's Swim stat by 35 points", 275);
	}

	public void use(Chao chao) {
		chao.changeSwim(35);
	}
}
