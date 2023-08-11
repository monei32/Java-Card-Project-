
// Card has a value 2- Ace or in our case 2-14
// Card will have a suit

// faceName Ace
// Suit 
// We know that an Ace beats all other cards 
// Ace Face Value is = 14
// make the instance value private we don't want anything outside of the class to modify it. 
// 

// How do we assign a value to the card? 
// how to we want to list out our cards?

// card class

public class Card {

	private String cardName;
	private Suit suit;
	private Rank rank;

	// below is the constructor for the card class.
	// the suit = "Spades", "Clubs, "Diamonds" heart"

	public Card(String name, Suit suit, Rank rank) {
		this.setSuit(suit);
		this.setCardName(name);
		this.setRank(rank);

	}

// getters and setters are used to protect data when creating class. For each instance variable a getter method returns its value while a setter method sets or updates its value. 

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
                                             // describe method that is taking in the cardName and the suit. You will see this print out when the game runs. 
	public void describe() {
		System.out.println("Card is " + cardName + " of " + suit );
	}
}
