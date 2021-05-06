package AP_GuessingGame;

import java.io.*;
import java.util.*;

public class HiddenWordRunner {

	public static void main(String[] args) throws IOException  {

		String guess = "";
		String hint  = "";
		String word  = "HARPS";
		HiddenWord puzzle = new HiddenWord(word);
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type in your guess and hit enter.  Keep going until your guess is correct!");
		System.out.println("The word has five letters.");
		
		while (!hint.equals(word))  {
			guess = in.nextLine();
			guess = guess.toUpperCase();
			hint = puzzle.getHint(guess);
			System.out.println(hint);
		}
		
		System.out.println("Good Job!");
		
	}

}

