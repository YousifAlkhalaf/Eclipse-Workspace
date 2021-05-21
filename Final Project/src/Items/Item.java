package Items;

public class Item {
	
	private String name, type, desc;
	
	public Item() {
		name = "Unknown";
		type = "Unknown";
		desc = "Unknown";
	}
	
	public Item(String itemName, String itemType, String itemDesc) {
		name = itemName;
		type = itemType;
		desc = itemDesc;
	}
	
	public String toString() {
		String s = "";
		s += name;
		s += "\nType: " + type;
		s += "\n" + desc;
		return s;
	}
}
