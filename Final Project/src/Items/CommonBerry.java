package Items;

import Chao.Chao;

public class CommonBerry extends Item{
	
	public CommonBerry() {
		super("Common Berry", "Chao Item", "Gives a Chao 75 experience points", 100);
	}
	
	public void use(Chao chao) {
		chao.levelUp(75);
		chao.changeMood(5);
	}
}
