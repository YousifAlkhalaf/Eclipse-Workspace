package Items;

import Chao.Chao;
import Player.Player;

public class BabyChao extends Item {
	public BabyChao() {
		super("Baby Chao Egg", "Player Item", "A regular baby Chao you can buy", 300);
	}
	
	public void use(Player p) {
		p.chaoList().add(new Chao("Baby"));
	}
}
