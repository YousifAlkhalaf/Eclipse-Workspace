package Items;

import Chao.Chao;

public class BigBerry extends Item {
	public BigBerry() {
		super("Big Berry", "Chao Item", "Gives a Chao 225 experience points", 250);
	}

	public void use(Chao chao) {
		chao.levelUp(225);
		chao.changeMood(5);
	}
}
