package Items;

import Chao.Chao;

public class Injection extends Item {
	public Injection() {
		super("Injection", "Chao Item", "Supercharges your Chao's stats, but your Chao will despise you",
				500);
	}
	
	public void use(Chao chao) {
		chao.changeFly(50);
		chao.changeSwim(50);
		chao.changeFly(50);
		chao.levelUp(100);
		chao.changeMood(-150);
	}
}
