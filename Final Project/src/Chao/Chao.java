package Chao;

import Garden.Client;
import java.util.Scanner;

public class Chao {

	private int lvl, xp, toNextLevel, happiness;
	private int fly, run, swim;
	private String name;
	private static int nextLvlBase = 100;

	private Scanner scan = new Scanner(System.in);

	// Default Chao the player starts with
	public Chao() {
		lvl = 1;
		xp = 0;
		toNextLevel = 100;
		happiness = 128;

		fly = 10;
		run = 10;
		swim = 10;

		name = "Chao";
	}

	// Computer Chao seen in races
	public Chao(int min, int max) {
		xp = 0;
		toNextLevel = 100;
		happiness = (int) (Math.random() * 246 + 5);

		int num = (int) (Math.random() * (max - min) + min);

		fly = num + (int) (Math.random() * max / 2 - (min - 1));
		run = num + (int) (Math.random() * max / 2 - (min - 1));
		swim = num + (int) (Math.random() * max / 2 - (min - 1));
		if (num / 10 > 0) {
			lvl = num;
		} else {
			lvl = 1;
		}

		name = "Rival Chao";
	}

	// Increases the XP of the Chao by xpGain, updating the Chao's level if
	// necessary. Increase in level increases other stats
	public void levelUp(int xpGain) {
		// Level up
		if (xp + xpGain >= toNextLevel) {
			while (xpGain >= nextLvlBase) {
				xpGain -= nextLvlBase;
				nextLvlBase = (int) (nextLvlBase * 1.15 + 1);
				lvl++;
				int statUp = (int) (3 * (lvl / 2));

				fly += statUp;
				swim += statUp;
				run += statUp;
				happiness += 5;
			}
			xp = xpGain;
			toNextLevel = nextLvlBase - xp;
		} else {
			xp += xpGain;
			toNextLevel -= xp;
			xpGain = 0;
		}
	}

	// Menu when you select a Chao. You can set the chao as active, get rid of it,
	// or return to the Chao menu
	// Number returned determines action within Player class
	public int select(Chao activeChao) {
		this.chaoStats();
		int n;

		System.out.println("\nWhat would you like to do with this Chao?\n");
		System.out.println("1. Set as Active Chao\n2. Return to Chao Menu");
		if (!this.equals(activeChao)) {
			System.out.println("3. Dismiss Chao\n");
			n = Client.getInput(3);
		} else {
			n = Client.getInput(2);
		}

		if (n == 1) {
			Client.shiftClear(6);
			return 1;
		} else if (n == 3) {
			System.out.println("Are you sure you want to get rid of your Chao? This action cannot be reversed.\n");
			System.out.println("1. Yes\n2. No\n");
			if (Client.getInput(2) == 1) {
				System.out.println("Goodbye " + this.name + "!");
				Client.shiftClear(6);
				return 3;
			} else {
				Client.shiftClear(6);
				return 2;
			}
		} else {
			Client.shiftClear(6);
			return 2;
		}
	}

	// Prints out a Chao's stats
	public void chaoStats() {
		System.out.println(name + "\n--------------------");
		System.out.println("Level " + lvl);
		System.out.println("XP: " + xp + "/" + nextLvlBase);
		System.out.println("XP until next level: " + toNextLevel + "\n");

		System.out.println("Fly: " + fly);
		System.out.println("Swim: " + swim);
		System.out.println("Run: " + run);

		if (happiness <= 20)
			System.out.println("Mood: Terrible");
		else if (happiness <= 70)
			System.out.println("Mood: Bad");
		else if (happiness <= 150)
			System.out.println("Mood: Okay");
		else if (happiness <= 200)
			System.out.println("Mood: Good");
		else if (happiness <= 240)
			System.out.println("Mood: Great");
		else
			System.out.println("Mood: Amazing");
	}

	// Getter for a Chao's name
	public String getName() {
		return name;
	}

	// Changes a Chao's name. Appears when using a Name Tag
	public void changeName() {
		System.out.println("\nWrite the name you want to give your Chao\n");
		String s = scan.nextLine();
		name = s;
		System.out.println("Name changed!\n");
	}

	// Changes a Chao's happiness by amt
	public void changeMood(int amt) {
		if (happiness + amt >= 0 && happiness + amt <= 255) {
			happiness += amt;
		} else if (happiness + amt < 0) {
			happiness = 0;
		} else {
			happiness = 255;
		}
	}

	// Calculates a win or a loss for the Chao using the method. Used in races
	public boolean calcRace(int type, Chao otherChao) {
		double yourTotal, rivalTotal;
		int yourStats = 0, rivalStats = 0;
		
		switch (type) {
		case 1:
			yourStats = fly;
			rivalStats = otherChao.fly;
			break;
		case 2:
			yourStats = swim;
			rivalStats = otherChao.swim;
			break;
		case 3:
			yourStats = run;
			rivalStats = otherChao.run;
			break;
		case 4:
			yourStats = run * fly * swim;
			rivalStats = otherChao.run * otherChao.fly * otherChao.swim;
		}
		
		yourTotal = yourStats * lvl + happiness;
		rivalTotal = rivalStats * otherChao.lvl + otherChao.happiness;
		
		if (yourTotal >= rivalTotal) {
			return true;
		}
		return false;
	}

	// Changes a Chao's fly stat by amt
	public void changeFly(int amt) {
		fly += amt;
	}

	// Changes a Chao's swim stat by amt
	public void changeSwim(int amt) {
		swim += amt;
	}

	// Changes a Chao's run stat by amt
	public void changeRun(int amt) {
		run += amt;
	}
}
