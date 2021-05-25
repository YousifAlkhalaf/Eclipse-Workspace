package Items;

import Chao.Chao;

public class NameTag extends Item{

	public NameTag() {
		super("Name Tag", "Misc.", "Allows you to change a Chao's name", 25);
	}
	
	public void use(Chao chao) {
		chao.changeName();
	}
}
