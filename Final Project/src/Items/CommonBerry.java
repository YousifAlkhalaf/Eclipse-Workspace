package Items;

import Chao.Chao;

public class CommonBerry extends Item{
	
	public CommonBerry() {
		super("Common Berry", "Berry", "Gives a Chao 75 experience points", 100);
	}
	
	public void use(Chao chao) {
		chao.levelUp(75);
	}
}
