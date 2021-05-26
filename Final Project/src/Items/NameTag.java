package Items;

import Chao.Chao;

public class NameTag extends Item{

	public NameTag() {
		super("Name Tag", "Chao Item", "Allows you to change a Chao's name", 25);
	}
	
	// Changes Chao name
	// Happiness changes by a small amount (liking/disliking the name)
	public void use(Chao chao) {
		chao.changeName();
		chao.changeMood((int)(Math.random() * 11 - 5));
	}
}
