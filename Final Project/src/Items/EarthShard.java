package Items;

import Chao.Chao;

public class EarthShard extends Item {
	public EarthShard() {
		super("Earth Shard", "Chao Item", "Raises a Chao's Fly stat by 10 points", 150);
	}
	
	public void use(Chao chao) {
		chao.changeRun(10);
	}
}
