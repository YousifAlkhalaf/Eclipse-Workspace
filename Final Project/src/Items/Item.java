package Items;

import Chao.Chao;
import Garden.Client;

public class Item {
	
	private String name, type, desc;
	private int price;
	
	// Constructor
	public Item() {
		name = "Unknown";
		type = "Unknown";
		desc = "Unknown";
		price = 0;
	}
	
	// Alt constructor
	public Item(String itemName, String itemType, String itemDesc, int price) {
		name = itemName;
		type = itemType;
		desc = itemDesc;
	}
	
	// Use to be defined by child classes
	public void use(Chao chao) {
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
	public boolean select(Chao chao) {
		System.out.println(this);
		System.out.println("\nWant to use this item?\n");
		System.out.println("1. Yes\n2. No");
		int n = Client.getInput(2);
		if (n == 1) {
			this.use(chao);
			Client.shiftClear(6);
			return true;
		}
		return false;
	}
}
