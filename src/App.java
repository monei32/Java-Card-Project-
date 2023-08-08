
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * a. Instantiate a Deck and two Players, call the shuffle method on the deck.
		 * 
		 * b. Using a traditional for loop, iterate 52 times calling the Draw method on
		 * the other player each iteration using the Deck you instantiated.
		 * 
		 * c. Using a traditional for loop, iterate 26 times and call the flip method
		 * for each player.
		 * 
		 * d. Compare the value of each card returned by the two player’s flip methods.
		 * Call the incrementScore method on the player whose card has the higher value.
		 * 
		 * e. After the loop, compare the final score from each player.
		 * 
		 * f. Print the final score of each player and either “Player 1”, “Player 2”, or
		 * “Draw” depending on which score is higher or if they are both the same.
		 */

		// make a method within the app to compare cards.
		// remember that a two of hearts is equal to a two of clubs

		

	

		Deck deck = new Deck();
		deck.shuffle();
		Player player1 = new Player();
		Player player2 = new Player();
		deck.describe();
		System.out.println("This is the Start of the Game!");
		
		System.out.println("================================");
		
		while (deck.hasMoreCards()) {
			player1.draw(deck);
			player2.draw(deck);
			Card p1Card = player1.flipCard();
			//p1Card.describe();
			Card p2Card = player2.flipCard();
			//p2Card.describe();
			int comparison = compareCards(p1Card, p2Card);
			System.out.println("Player 1 Rank:" + " " + p1Card.getRank()+  "Player 2 Rank:" + " " + p2Card.getRank() + "Comparison:" + " " + comparison);
			if (comparison == 0) {
			//	System.out.println("Cards are the same" + "" + p1Card.getCardName() + p2Card.getCardName());
			} else if (comparison < 0) {
				System.out.println("Player 2 Wins Draw!");
			//	System.out.println("Card One" + " " + p1Card.getCardName() + " is < Card Two" + " " +  " " + p2Card.getCardName());
				player2.incrementScore();
			} else if (comparison > 0) {
				System.out.println("Player 1 Wins Draw!");
			//	System.out.println("Card one" + " " + p1Card.getCardName()+ " " + "is > Card Two"+ " " + p2Card.getCardName() + "" + " Player ONE Wins this Hand!");
				player1.incrementScore();
				
			}
			
			
			
		}
		   if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player 1 wins!"+ " " + player1.getScore());
	        } else if (player2.getScore() > player1.getScore()) {
	            System.out.println("Player 2 wins!" + " " + "Score" +  " " + " " + player2.getScore());
	        } else {
	            System.out.println("The game is a tie! LAME!!!!");
	        }
	    
		    System.out.println("Final Score:" + "Player 1 Score:" + " " + player1.getScore() + " " + "Player 2 Score:" + " " + player2.getScore());
		    
	}
	

		
		
		private static int compareCards(Card p1Card, Card p2Card) {
			Rank p1Rank = p1Card.getRank();
			Rank p2Rank = p2Card.getRank();
			
			return p1Rank.compareTo(p2Rank);
			
			
			
			
		}
	   
}
	
        
	       
	
	


