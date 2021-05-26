package Items;

import Chao.Chao;

public class FireCrystal extends Item{
	public FireCrystal() {
		super("Fire Crystal", "Chao Item", "Raises a Chao's Fly, Run, and Swim stats by 35 points", 700);
	}
	
	public void use(Chao chao) {
		chao.changeFly(35);
		chao.changeSwim(35);
		chao.changeRun(35);
	}
}
