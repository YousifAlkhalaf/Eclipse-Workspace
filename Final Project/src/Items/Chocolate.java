package Items;

import Chao.Chao;

public class Chocolate extends Item {
	public Chocolate() {
		super("Chocolate", "Chao Item", "Cheers up your Chao a little", 120);
	}
	
	public void use(Chao chao) {
		chao.changeMood(15);
	}
}
