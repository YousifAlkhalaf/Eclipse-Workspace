package Chao;

public class Chao {

	private int lvl, xp, toNextLevel, happiness;
	private int fly, run, swim;
	private String name;

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

		fly = num;
		run = num;
		swim = num;
		if (num / 10 > 0) {
			lvl = num;
		} else {
			lvl = 1;
		}

		name = "Rival Chao";
	}

	public void levelUp(int xpGain) {
		while (xpGain > 0) {
			if (xp + xpGain > toNextLevel) {
				xp = (xpGain - toNextLevel);
				xpGain -= (toNextLevel + xp);
				toNextLevel = (int) (toNextLevel * 1.15 - xp);
			} else {
				xp += xpGain;
				toNextLevel -= xp;
				xpGain = 0;
			}
		}
	}
	
	public void chaoStats() {
		System.out.println(name + "\n--------------------");
		System.out.println("Level " + lvl);
		System.out.println("XP: " + xp);
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
	
	public String getName() {
		return name;
	}
}
