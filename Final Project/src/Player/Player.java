package Player;

import java.util.ArrayList;

import Chao.Chao;
import Items.Item;

public class Player {

	private int coins;
	private ArrayList<Item> itemList = new ArrayList<Item>();
	private ArrayList<Chao> chaoList = new ArrayList<Chao>();
	private Chao activeChao;

	public Player() {
		coins = 200;
		chaoList.add(new Chao());
		activeChao = chaoList.get(0);
	}
}
