package Garden;

import java.util.ArrayList;

import Chao.Chao;
import Items.Cookie;
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
				competitors.add(new Chao(5, 10));
				break;
			case 2:
				competitors.add(new Chao(15, 85));
				break;
			case 3:
				competitors.add(new Chao(100, 150));
				break;
			case 4:
				competitors.add(new Chao(160, 220));
			}
		}
	}

	public int race(Chao chao) {
		int place = 1;
		for (Chao rival : competitors) {
			boolean win = chao.calcRace(type, rival);
			if (!win) {
				place++;
			}
		}
		return place;
	}
// Calculate rewards
	public static void calcRewards(int place, int difficulty, int type, Player p) {

		double multiplier = 0;

		// Difficulty multiplier calc
		switch (difficulty) {
		case 1:
			multiplier = 1;
			break;
		case 2:
			multiplier = 1.25;
			break;
		case 3:
			multiplier = 1.5;
			break;
		case 4:
			multiplier = 2;
			break;
		}
		
		if (type == 4) {
			multiplier *= 1.10;
		}

		// Reward calculation
		switch (place) {
		case 1:
			p.addCoins((int) (80 * multiplier));
			p.chao().levelUp((int) (160 * multiplier));
			p.item().add(new Cookie());
			break;
		case 2:
			p.addCoins((int) (70 * multiplier));
			p.chao().levelUp((int) (140 * multiplier));
			break;
		case 3:
			p.addCoins((int) (60 * multiplier));
			p.chao().levelUp((int) (120 * multiplier));
			break;
		case 4:
			p.addCoins((int) (50 * multiplier));
			p.chao().levelUp((int) (100 * multiplier));
			break;
		case 5:
			p.addCoins((int) (40 * multiplier));
			p.chao().levelUp((int) (80 * multiplier));
			break;
		case 6:
			p.addCoins((int) (30 * multiplier));
			p.chao().levelUp((int) (60 * multiplier));
			break;
		case 7:
			p.addCoins(-10);
			p.chao().levelUp((int) (20 * multiplier));
			break;
		case 8:
			p.addCoins(-20);
			p.chao().levelUp((int) (10 * multiplier));
			break;
		}
	}
// Select race type and difficulty
	public static void raceMenu(Player p) {
		System.out.println("Choose race type\n");
		System.out.println("0. Return to Main Menu\n");
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
		System.out.println("0. Return to Main Menu\n");
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
		int place = r.race(p.chao());
// Display rewards
		calcRewards(place, num2, num1, p);
		if (place == 1) {
			System.out.println("Your Chao got 1st place and is very happy!\nYou earned lots of coins and a prize!");
		} else if (place == 2) {
			System.out.println("Your Chao got 2nd place and is quite happy!\nYou earned lots of coins!");
		} else if (place == 3) {
			System.out.println("Your Chao got 3rd place and is pretty happy!\nYou earned some coins!");
		} else if (place > 3 && place < 7) {
			System.out.println("Your Chao got " + place + "th place and is feeling okay.\nYou earned a few coins!");
		} else {
			System.out.println("Your Chao got " + place + "th place and is bummed out.\nYou also lost some coins...");
		}

		System.out.println("\n1. Return to Race Menu\n2. Return to Main Menu\n");
		int n = Client.getInput(2);
		Client.shiftClear(6);
		if (n == 1)
			raceMenu(p);
		if (n == 2)
			Client.mainMenu(p);
	}
}
