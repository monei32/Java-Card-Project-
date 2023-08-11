
// enum can have attributes and methods. Enum constants are public, static and final.  they are unchangeable - cannot be overridden) 
// An enumeration is a complete listing of something in java
// An enum type is a special data type that enable for variable to be a set of predefined constants
// examples would be the day of the week or months of the year. They Don't Change. 
// the value or the suit is not going to change. 

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
                                                                 // enhanced for loop used to create the deck from the enum classes Rank and Suit 
	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(rank.name(), suit, rank));
			}
		}
	}

	private List<Card> cards = new ArrayList<>(); // creates a list of cards 

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	// this is adding a card to the deck.
	public void addCard(Card card) {
		cards.add(card);
	}

	public void shuffle() {
		// The while loop is saying get me a new card any place in the deck.
		// Next add it to a new temp stack.
		// Once this is completed change cards to be the randomized stack.
		List<Card> shuffled = new ArrayList<>();
		Random rn = new Random();
		while (cards.size() > 0) {
			// randomize each card that i grab from the deck.
			int getCardIdx = rn.nextInt(cards.size());
			Card aCard = cards.remove(getCardIdx);
			shuffled.add(aCard);

		}
		cards = shuffled;
	}

	public Card drawCard() {
		Card dealt = cards.remove(0); // removing the card placed a index 0. Which is the first card on the list.
		return dealt;
	}

	public void describe() {     // method created to describe the card.
		for (Card card : cards) {
			card.describe();
		}
	}

	public boolean hasMoreCards() {          // method used to start the while loop to deal out the deck. this will continue to deal the cards unitl it hits 0. 
		return cards.size() >0; 
	}
		
	
}
