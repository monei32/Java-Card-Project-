

// enum can have attributes and methods. Enum constants are public, static and final.  they are unchangeable - cannot be overridden) 
// An enumeration is a complete listing of something in java
// An enum type is a special data type that enable for variable to be a set of predefined constants
// examples would be the day of the week or months of the year. They Don't Change. 
// the value or the suit is not going to change. 

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck  {
       
	public Deck() {
		Card twoClub = new Card("Two", Suit.CLUBS, Rank.TWO); 
		cards.add(twoClub); 
		Card threeClub = new Card("Three", Suit.CLUBS, Rank.THREE); 
		cards.add(threeClub); 
		Card fourClub = new Card("Four", Suit.CLUBS, Rank.FOUR); 
		cards.add(fourClub); 
		Card fiveClub = new Card("Five", Suit.CLUBS, Rank.FIVE); 
		cards.add(fiveClub); 
		Card sixClub = new Card("Six", Suit.CLUBS, Rank.SIX); 
		cards.add(sixClub); 
	}
		
	private List <Card> cards = new ArrayList<>();

	public List <Card> getCards() {
		return cards;
	}

	public void setCards(List <Card> cards) {
		this.cards = cards;
	} 
	   
	public void shuffle() {      
		// The for loop is saying get me a new card any place in the deck. 
		// Next add it to a new tempory stack.
		// Once this is completed change cards to be the randomized stack. 
		List <Card> shuffled = new ArrayList<>(); 
		     Random rn = new Random();
		while(cards.size()>0) {
			//randomize each card that i grab from the deck. 
			int getCardIdx = rn.nextInt(cards.size()); 
			Card aCard = cards.remove(getCardIdx); 
			shuffled.add(aCard); 
			
		}
		cards = shuffled; 
	}
	
	public Card drawCard() {
		Card dealt = cards.remove(0);      // removing the card placed a index 0. Which is the first card on the list. 
		return dealt; 
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
		

  }




