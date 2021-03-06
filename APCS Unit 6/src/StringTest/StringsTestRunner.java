package StringTest;

import java.util.Scanner;

public class StringsTestRunner {

	public static void main(String[] args) {

		// Add your name to the first print statement.
//  Do not change any other lines in this method.

		System.out.println("Yousif Alkhalaf");

		question1();

		question2();

		question3();

		question4();

		question5();

	}

	// -----------------------------------------------------------------------

	public static void question1() {
		Scanner in = new Scanner(System.in);
		System.out.print("What is String 1? ");
		String input = in.nextLine();

		while (input.charAt(0) == ' ') {
			input = input.substring(1);
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				input = input.substring(0, i) + input.substring(i + 1, input.length());
			}
		}
		System.out.println(input);
		// in.close();
	}

	// -----------------------------------------------------------

	public static void question2() {
		int differentChars = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("What is String 2a? ");
		String word1 = in.nextLine();
		System.out.print("What is String 2b? ");
		String word2 = in.nextLine();

		if (word1.equalsIgnoreCase(word2)) {
		} else {
			String one = word1.toUpperCase();
			String two = word2.toUpperCase();
			for (int i = 0; i < word1.length() && i < word2.length(); i++) {
				if (one.charAt(i) != two.charAt(i)) {
					differentChars++;
				}
			}
		}

		if (differentChars == 0) {
			System.out.println("The words are the same.");
		} else if (differentChars == 1) {
			System.out.println("The words are close.");
		} else {
			System.out.println("The words are different.");
		}

		// in.close();
	}

	// -------------------------------------------------------

	public static void question3() {
		Scanner in = new Scanner(System.in);
		System.out.print("What is String 3a? ");
		String word1 = in.nextLine();
		System.out.print("What is String 3b? ");
		String word2 = in.nextLine();

		int wordInstances = 0;
		for (int i = 0; i < word2.length() - word1.length(); i++) {
			if (word1.equalsIgnoreCase(word2.substring(i, i + word1.length()))) {
				wordInstances++;
			}
		}

		System.out.println(wordInstances);
		// in.close();

	}

	// -----------------------------------------------------

	public static void question4() {
		Scanner in = new Scanner(System.in);

		System.out.print("What is String 4? ");
		String word = in.nextLine();

		if (word.length() < 5) {
			System.out.println(word);
		} else {
			word = word.substring(0, 3) + word.substring(word.length() - 2, word.length());
			System.out.println(word);
		}
		// in.close();

	}
//--------------------------------------------------------------

	public static void question5() {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the first word? ");
		String word1 = in.nextLine();
		System.out.print("What is the second word? ");
		String word2 = in.nextLine();
		System.out.print("What is the third word? ");
		String word3 = in.nextLine();

		int totalLength = word1.length() + word2.length() + word3.length();
		int spacesNeeded = 20 - totalLength;
		String newWord = "";

		newWord += word1;
		if (spacesNeeded % 2 == 0) {
			for (int i = 0; i < spacesNeeded/2; i++) {
				newWord += ' ';
			}
		} else {
			for (int i = 0; i < spacesNeeded/2 + 1; i++) {
				newWord += ' ';
			}
		}
		newWord += word2;
		for (int i = 0; i < spacesNeeded/2; i++) {
			newWord += ' ';
		}
		newWord += word3;
		System.out.println(newWord);

		in.close();

	}

}
