package Items;

import Chao.Chao;

public class SmallBerry extends Item{
	
	public SmallBerry() {
		super("Small Berry", "Berry", "Gives a Chao 25 experience points.");
	}
	
	public void use(Chao chao) {
		chao.levelUp(25);
	}
}
