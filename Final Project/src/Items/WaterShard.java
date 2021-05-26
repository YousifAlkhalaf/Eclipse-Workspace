package Items;

import Chao.Chao;

public class WaterShard extends Item {
	public WaterShard() {
		super("Water Shard", "Chao Item", "Raises a Chao's Swim stat by 10 points", 150);
	}

	public void use(Chao chao) {
		chao.changeSwim(10);
	}
}
