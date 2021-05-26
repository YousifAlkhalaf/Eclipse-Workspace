package Items;

import Chao.Chao;

public class SmallBerry extends Item{
	
	public SmallBerry() {
		super("Small Berry", "Chao Item", "Gives a Chao 25 experience points", 50);
	}
	
	public void use(Chao chao) {
		chao.levelUp(25);
		chao.changeMood(2);
	}
	
	public int getPrice() {
		return super.getPrice();
	}
}
