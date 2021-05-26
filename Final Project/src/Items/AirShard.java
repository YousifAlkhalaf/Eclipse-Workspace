package Items;

import Chao.Chao;

public class AirShard extends Item {
	public AirShard() {
		super("Air Shard", "Chao Item", "Raises a Chao's Fly stat by 10 points", 150);
	}
	
	public void use(Chao chao) {
		chao.changeFly(10);
	}
}
