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
	
	public Chao chao() {
		return activeChao;
	}
	
	public ArrayList<Item> item() {
		return itemList;
	}
	
	public void itemPrint() {
		if (itemList.size() == 0) {
			System.out.println("No items.");
		} else {
			for (Item i: itemList)
				System.out.println(i);
		}
	}
	
	public void chaoPrint() {
		if (chaoList.size() == 0) {
			System.out.println("No Chao.");
		} else {
			for (Chao i: chaoList)
				i.chaoStats();
		}
	}
}
