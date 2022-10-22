package Items;

import Chao.Chao;
import Garden.Client;
import Player.Player;

public class Item {
	
	private String name, type, desc;
	private int price;
	
	// Constructor
	public Item() {
		name = "Unknown";
		type = "Unknown";
		desc = "Unknown";
	}
	
	// Alt constructor
	public Item(String itemName, String itemType, String itemDesc, int price) {
		name = itemName;
		type = itemType;
		desc = itemDesc;
		this.price = price;
	}
	
	// Use to be defined by child classes
	public void use(Chao chao, Player player) {
	}
	
	public String toString() {
		String s = "";
		s += name;
		s += "\nType: " + type;
		s += "\n" + desc;
		return s;
	}
	
	// Getter for item name
	public String getName() {
		return name;
	}
	
	// Getter for item price
	public int getPrice() {
		return price;
	}
	
	// Menu for using an item. Returns boolean that determines action in Player class
	public boolean select(Chao chao, Player player) {
		System.out.println(this);
		System.out.println("\nWant to use this item?\n");
		System.out.println("1. Yes\n2. No");
		int n = Client.getInput(2);
		if (n == 1) {
			this.use(chao, player);
			Client.shiftClear(6);
			return true;
		}
		return false;
	}
	
	// Item select menu for shopping
	public boolean select(Player p) {
		System.out.println(this);
		System.out.println("\nWant to buy this item?\nCost: " + price + "\n");
		System.out.println("1. Yes\n2. No");
		int n = Client.getInput(2);
		Client.shiftClear(6);
		if (n == 1) {
			return true;
		}
		return false;
	}
}
