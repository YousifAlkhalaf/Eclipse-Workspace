package Garden;

import java.util.ArrayList;
import Items.*;
import Player.Player;

public class Shop {

	private ArrayList<Item> catalog = new ArrayList<Item>();

	public Shop() {
		catalog.add(new CommonBerry());
		catalog.add(new SmallBerry());
		catalog.add(new BigBerry());
		
		catalog.add(new NameTag());
		
		catalog.add(new FireCrystal());
		catalog.add(new AirCrystal());
		catalog.add(new WaterCrystal());
		catalog.add(new EarthCrystal());
		
		catalog.add(new AirShard());
		catalog.add(new WaterShard());
		catalog.add(new EarthShard());
		
		catalog.add(new Chocolate());
		catalog.add(new Cookie());
		catalog.add(new Cake());
		
		catalog.add(new BitterMedicine());
		catalog.add(new Injection());
		
		catalog.add(new BabyChao());
		catalog.add(new RareChao());
		catalog.add(new SuperChao());
		catalog.add(new HyperChao());
		catalog.add(new MysteryChao());
	}

	// Sorts items in catalog
	public void sortItems() {
		for (int i = 0; i < catalog.size(); i++) {
			int min = i;
			for (int j = i + 1; j < catalog.size(); j++) {
				int compare = catalog.get(j).getName().compareToIgnoreCase(catalog.get(min).getName());
				if (compare < 0) {
					min = j;
				}
			}
			if (min != i) {
				Item temp = catalog.get(min);
				catalog.add(min, catalog.get(i));
				catalog.remove(min + 1);
				catalog.add(i, temp);
				catalog.remove(i + 1);
			}
		}
	}
// Shop UI
	public void shopMenu(Player p) {
		this.sortItems();
		int money = p.coins();

		System.out.println("Coins: " + money);
		System.out.println("Select an item to buy");
		System.out.println("\n0. Return to Main Menu\n");
		int i = 0;
		int num = 1;
		ArrayList<Integer> indexes = new ArrayList<Integer>();
// Shop Logic
		for (i = 0; i < catalog.size(); i++) {
			if (catalog.get(i).getPrice() <= money) {
				System.out.printf("%d. %s [Cost: %d]\n", num, catalog.get(i).getName(), catalog.get(i).getPrice());
				num++;
				indexes.add(i);
			}
		}
		System.out.println();

		int n = Client.getInput(num, 0);

		if (n == 0) {
			Client.shiftClear(6);
			Client.mainMenu(p);
		} else {
			System.out.println();
			if (catalog.get(indexes.get(n - 1)).select(p)) {
				p.item().add(catalog.get(indexes.get(n - 1)));
				p.addCoins(-1 * catalog.get(indexes.get(n - 1)).getPrice());
			}
			this.shopMenu(p);
		}
		
	}
}
