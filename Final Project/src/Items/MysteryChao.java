package Items;

import Chao.Chao;
import Player.Player;

public class MysteryChao extends Item{
	public MysteryChao() {
		super("Mystery Chao Egg", "Player Item", "A Chao with unknown potential. Good? Bad? No one knows!", 1000);
	}
	
	public void use (Player p) {
		int num = (int) (Math.random() * 250 + 1);
		p.chaoList().add(new Chao(num, num));
	}
}
