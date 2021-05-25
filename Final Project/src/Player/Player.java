package Player;

import java.util.ArrayList;
import Garden.Client;
import Chao.Chao;
import Items.Item;

public class Player {

	private int coins;
	private ArrayList<Item> itemList = new ArrayList<Item>();
	private ArrayList<Chao> chaoList = new ArrayList<Chao>();
	private Chao activeChao;

	// Constructor
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

	// Menu for looking at and using items. Makes a numbered list of items, if possible, for you to pick
	public void itemMenu() {
		if (itemList.size() == 0) {
			System.out.println("No items.");
			System.out.println("\n1. Return to Main Menu\n");
			Client.getInput(1);
			Client.shiftClear(6);
		} else {
			System.out.println("Select an item\n");
			System.out.println("\n0. Return to Main Menu\n");
			int i = 0;

			for (i = 0; i < itemList.size(); i++) {
				System.out.printf("%d. %s\n", i + 1, itemList.get(i).getName());
			}
			System.out.println();

			int n = Client.getInput(i + 1, 0);

			if (n == 0) {
				Client.shiftClear(6);
			} else {
				System.out.println();
				if (itemList.get(n - 1).select(this.chao())) {
					itemList.remove(n - 1);
				}
			}
			Client.mainMenu(this);
		}
	}

	// Menu for looking at and interacting with your Chao.
	public void chaoMenu() {
		if (chaoList.size() == 0) {
			System.out.println("No Chao.");
			System.out.println("\n1. Return to Main Menu\n");
			Client.getInput(1);
			Client.shiftClear(6);
		} else {
			System.out.println("Select a Chao from your inventory\n");
			System.out.println("\n0. Return to Main Menu\n");
			int i = 0;

			for (i = 0; i < chaoList.size(); i++) {
				System.out.printf("%d. %s", i + 1, chaoList.get(i).getName());
				if (chaoList.get(i).equals(activeChao))
					System.out.println(" (Active)");
			}
			System.out.println();

			int n = Client.getInput(i + 1, 0);

			if (n == 0) {
				Client.shiftClear(6);
			} else {
				System.out.println();
				int action = chaoList.get(n - 1).select();
				if (action == 1) {
					activeChao = chaoList.get(n - 1);
				} else if (action == 2) {
					chaoList.remove(n - 1);
				} else {
					chaoMenu();
				}
			}
			Client.mainMenu(this);
		}
	}
}
