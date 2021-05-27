package Items;

import Chao.Chao;
import Player.Player;

public class RareChao extends Item {
	public RareChao() {
		super("Rare Chao Egg", "Player Item", "A rare Chao, with exceptional stats", 700);
	}
	
	public void use(Player p) {
		p.chaoList().add(new Chao("Rare"));
	}
}

