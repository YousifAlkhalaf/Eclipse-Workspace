package Assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import Assignment6.Card; // I can use Cards

public class ExtraCard {

	private int suit, faceValue;
	
	public int getFaceValue() {
		return this.faceValue;
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
		
		for (int s = 1; s <= 4; s++)
			for (int n = 1; n <= 13; n++)
				deckOfCards.add(new Card(s, n));
		
		Card.shuffle(deckOfCards);
		
		ArrayList<Card> hand1 = new ArrayList<Card>();
		ArrayList<Card> hand2 = new ArrayList<Card>();
		ArrayList<Card> hand3 = new ArrayList<Card>();
		ArrayList<Card> hand4 = new ArrayList<Card>();
		
		for (int receivingPlayer = 1; hand4.size() != 5; ) {
			if (receivingPlayer == 1) {
				hand1.add(deckOfCards.get(0));
				receivingPlayer++;
			} else if (receivingPlayer == 2) {
				hand2.add(deckOfCards.get(0));
				receivingPlayer++;
			} else if (receivingPlayer == 3) {
				hand3.add(deckOfCards.get(0));
				receivingPlayer++;
			} else {
				hand4.add(deckOfCards.get(0));
				receivingPlayer = 1;
			}
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
		System.out.println();
		
		System.out.println("Player 3 has");
		for (Card c: hand3) {
			System.out.println("- " + c);
		}
		System.out.println();
		
		System.out.println("Player 4 has");
		for (Card c: hand4) {
			System.out.println("- " + c);
		}
		System.out.println();
		
		Card play1 = new Card (0, 0);
		Card play2 = new Card (0, 0);
		Card play3 = new Card (0, 0);
		Card play4 = new Card (0, 0);
		
		play1 = Card.findMax(hand1);
		
		System.out.println("Player 1 plays " + play1);

		play2 = play2.chooseCard(hand2, play1);
		if (play2.getFaceValue() == 0) {
			play2 = Card.findMin(hand2);
		}
		System.out.println("Player 2 plays " + play2);
			
		play3 = play3.chooseCard(hand3, play2);
		if (play3.getFaceValue() == 0) {
			play3 = Card.findMin(hand3);
		}
		System.out.println("Player 3 plays " + play3);
		
		play4 = play4.chooseCard(hand4, play3);
		if (play4.getFaceValue() == 0) {
			play4 = Card.findMin(hand4);
		}
		System.out.println("Player 4 plays " + play4);
		
		ArrayList<Card> playedCards = new ArrayList<Card>();
		playedCards.add(play1);
		playedCards.add(play2);
		playedCards.add(play3);
		playedCards.add(play4);
		
		if (Card.findMax(playedCards) == play1)
			System.out.println("The winner is Player 1");
		else if (Card.findMax(playedCards) == play2)
			System.out.println("The winner is Player 2");
		else if (Card.findMax(playedCards) == play3)
			System.out.println("The winner is Player 3");
		else
			System.out.println("The winner is Player 4");
		
	}
}
