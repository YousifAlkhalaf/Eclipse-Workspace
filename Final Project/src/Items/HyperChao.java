package Items;

import Chao.Chao;
import Player.Player;

public class HyperChao extends Item {
	public HyperChao() {
		super("Hyper Chao Egg", "Player Item", "A mythical Chao with spectacular stats", 1200);
	}
	
	public void use(Player p) {
		p.chaoList().add(new Chao("Hyper"));
	}
}
