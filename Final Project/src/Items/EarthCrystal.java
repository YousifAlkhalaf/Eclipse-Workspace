package Items;

import Chao.Chao;

public class EarthCrystal extends Item{
	public EarthCrystal() {
		super("Earth Crystal", "Chao Item", "Raises a Chao's Run stat by 35 points", 275);
	}
	
	public void use(Chao chao) {
		chao.changeRun(35);
	}
}
