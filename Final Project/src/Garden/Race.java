package Garden;

import java.util.ArrayList;

import Chao.Chao;
import Player.Player;

public class Race {

	private int type;
	private ArrayList<Chao> competitors = new ArrayList<Chao>();

	// Stores race type and makes competitors according to difficulty
	public Race(int t, int difficulty) {
		type = t;
		for (int i = 0; i < 7; i++) {
			switch (difficulty) {
			case 1:
				competitors.add(new Chao(5, 20));
				break;
			case 2:
				competitors.add(new Chao(20, 40));
				break;
			case 3:
				competitors.add(new Chao(40, 75));
				break;
			case 4:
				competitors.add(new Chao(75, 100));
			}
		}
	}
	
	public int race(Chao chao) {
		int place = 1;
		for (Chao rival: competitors) {
			chao.calcRace(rival);
		}
	}

	public static void raceMenu(Player p) {
		System.out.println("Choose race type\n");
		System.out.println("\n0. Return to Main Menu\n");
		System.out.println("1. Aerial Race");
		System.out.println("2. Aquatic Race");
		System.out.println("3. Terrestrial Race");
		System.out.println("4. All-Around Race\n");
		int num1 = Client.getInput(4, 0);

		Client.shiftClear(6);
		if (num1 == 0) {
			Client.mainMenu(p);
		}

		System.out.println("Choose race difficulty\n");
		System.out.println("\n0. Return to Main Menu\n");
		System.out.println("1. Easy");
		System.out.println("2. Medium");
		System.out.println("3. Hard");
		System.out.println("4. Expert\n");
		int num2 = Client.getInput(4, 0);

		Client.shiftClear(6);
		if (num2 == 0) {
			Client.mainMenu(p);
		}

		Race r = new Race(num1, num2);
	}
}
