package Items;

import Chao.Chao;

public class Cookie extends Item {
	public Cookie() {
		super("Cookie", "Chao Item", "Cheers up your Chao a decent amount", 285);
	}
	
	public void use(Chao chao) {
		chao.changeMood(40);
	}
}
