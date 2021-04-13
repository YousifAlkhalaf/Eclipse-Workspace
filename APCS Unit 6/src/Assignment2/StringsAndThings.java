package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class StringsAndThings {
	public static void main(String[] args) {
		// Reverse String
		System.out.println("Hermione");
		String backwards = reverseString("Hermione");
		System.out.println(backwards);

		// Abecadarian
		System.out.println();
		System.out.println(isAbecadarian("cat"));
		System.out.println(isAbecadarian("aat"));

		// Doubloon
		System.out.println();
		System.out.println(isDoubloon("coco"));
		System.out.println(isDoubloon("nut"));

		// Can Spell
		System.out.println();
		System.out.println(canSpell("bot", "boot"));
		System.out.println(canSpell("cratt", "cat"));

	}

	public static String reverseString(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}

	public static boolean isAbecadarian(String s) {
		if (s.length() > 1) {
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) > s.charAt(i + 1)) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isDoubloon(String s) {
		int instanceNum = 0;
		boolean isDoubloon = true;

		for (int j = 0; j < s.length(); j++) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(j) == s.charAt(i)) {
					instanceNum++;
				}
			}
			if (instanceNum != 2) {
				isDoubloon = false;
			} else {
				instanceNum = 0;
			}
		}
		return isDoubloon;
	}

	public static boolean canSpell(String tiles, String word) {
		String wordBuild = "";
		boolean isUsed = false;

		ArrayList<Integer> usedTiles = new ArrayList<Integer>();
		for (int j = 0; j < word.length(); j++) {
			for (int i = 0; i < tiles.length(); i++) {
				for (int k : usedTiles) {
					if (tiles.charAt(k) == tiles.charAt(i))
						isUsed = true;
				}
				if ((tiles.charAt(i) == word.charAt(j)) && (isUsed == false)) {
					wordBuild += word.charAt(j);
					usedTiles.add(i);
				}
				isUsed = false;
			}
		}
		if (wordBuild.equals(word)) {
			return true;
		} else {
			return false;
		}
	}
}
