package Items;

import Chao.Chao;
import Player.Player;

public class SuperChao extends Item {
	public SuperChao() {
		super("Super Chao Egg", "Player Item", "An exotic Chao with phenomenal stats", 999);
	}
	
	public void use(Player p) {
		p.chaoList().add(new Chao("Super"));
	}
}

