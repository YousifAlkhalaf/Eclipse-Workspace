package Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Card {

	private int suit, faceValue;

	public Card(int suit, int faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}

	public String toString() { // Overriding toString
		String suitName = null, faceName = null;

		if (suit == 1)
			suitName = "Spades";
		if (suit == 2)
			suitName = "Hearts";
		if (suit == 3)
			suitName = "Diamonds";
		if (suit == 4)
			suitName = "Clubs";

		if (faceValue == 1)
			faceName = "Ace";
		else if (faceValue == 11)
			faceName = "Jack";
		else if (faceValue == 12)
			faceName = "Queen";
		else if (faceValue == 13)
			faceName = "King";
		else
			faceName = String.valueOf(faceValue);

		return String.format(faceName + " of " + suitName);
	}

	public static void main(String[] args) {
		ArrayList<Card> deckOfCards = new ArrayList<Card>();

		// Creates the deck
		for (int s = 1; s <= 4; s++)
			for (int n = 1; n <= 13; n++)
				deckOfCards.add(new Card(s, n));

		// Shuffles the deck
		shuffle(deckOfCards);

		System.out.println("Shuffled deck\n");
		for (Card c: deckOfCards)
			System.out.println("- " + c);
		System.out.println("\n");

		ArrayList<Card> hand1 = new ArrayList<Card>();
		ArrayList<Card> hand2 = new ArrayList<Card>();

		for (boolean giveToP1 = true; (hand1.size() != 5) || (hand2.size() != 5); giveToP1 = !giveToP1) {
			if (giveToP1 == true)
				hand1.add(deckOfCards.get(0));
			else
				hand2.add(deckOfCards.get(0));
			
			deckOfCards.remove(0);
		}
		System.out.println("Player 1 has");
		
		for (Card c: hand1) {
			System.out.println("- " + c);
		}
		System.out.println();
		System.out.println("Player 2 has");
		
		for (Card c: hand2) {
			System.out.println("- " + c);
		}
		
	}
	
	public int getFaceValue() {
		return this.faceValue;
	}
	public int getSuit() {
		return this.suit;
	}

	public static Card findMin(ArrayList<Card> hand) {
		Card min = new Card (0, 13);
		for (Card c: hand) {
			if (c.getFaceValue() < min.getFaceValue()) {
				min = c;
			}
		}
		return min;
	}
	
	public static Card findMax(ArrayList<Card> hand) {
		Card max = new Card (0, 0);
		for (Card c: hand) {
			if (c.getFaceValue() > max.getFaceValue()) {
				max = c;
			}
		}
		return max;
	}
	
	public Card chooseCard(ArrayList<Card> hand, Card lastPlayer) {
		Card choice = new Card(0, 0);
		for (Card c: hand) {
			if (c.getSuit() == lastPlayer.getSuit())
				if (choice.getFaceValue() < c.getFaceValue())
					choice = c;
		}
		return choice;
	}
	
	public static void shuffle(ArrayList<Card> deck) {
		int size = deck.size();
		for (int i = 0; i < size; i++) {
			int change = (int)(Math.random() * size);
			Card temp = deck.get(i);
			deck.set(i, deck.get(change));
			deck.set(change, temp);
		}
	}
}
