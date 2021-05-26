package Items;

import Chao.Chao;

public class Cake extends Item {
	public Cake() {
		super("Cake ", "Chao Item", "Cheers up your Chao a lot", 450);
	}
	
	public void use(Chao chao) {
		chao.changeMood(80);
	}
}
