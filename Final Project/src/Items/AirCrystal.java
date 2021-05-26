package Items;

import Chao.Chao;

public class AirCrystal extends Item {
	public AirCrystal() {
		super("Air Crystal", "Chao Item", "Raises a Chao's Fly stat by 35 points", 275);
	}
	
	public void use(Chao chao) {
		chao.changeFly(35);
	}
}
