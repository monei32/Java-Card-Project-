
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

		

	

		Deck deck = new Deck();       // Instantiating a new deck. 
		deck.shuffle();              // shuffling the deck of cards using the shuffle method that was created using the while loop. 
		Player player1 = new Player();
		Player player2 = new Player();
		deck.describe();               // describing the card from the the describe method. 
		System.out.println("This is the Start of the Game!");
		
		System.out.println("================================");
		
		while (deck.hasMoreCards()) {                   // dealing out the cards
			player1.draw(deck);                         // drawing the cards
			player2.draw(deck);
			Card p1Card = player1.flipCard();             // playerOne flip card pulling from the flip card method
			Card p2Card = player2.flipCard();               // PlayerTwo flipping the card from the flip card method. 
			int comparison = compareCards(p1Card, p2Card);   // setting int comparison that takes in the compareCards method that is comparing the ranks of Player 1 card and Player 2 Card
			System.out.println("Player 1 Rank:" + " " + p1Card.getRank()+ " " + " Vs " + " " + "Player 2 Rank:" + " " + p2Card.getRank() + " " + "Comparison:" + " " + comparison);
			if (comparison == 0) {              // if both cards are equal then it will print Both Cards are the Sam!
			  System.out.println("Both Cards are the Same!");
			} else if (comparison < 0) {                   // Player 2 Wins Draw!
				System.out.println("Player 2 Wins Draw!");  
			
				player2.incrementScore();       // incrementing
			} else if (comparison > 0) {
				System.out.println("Player 1 Wins Draw!");
			
				player1.incrementScore();
				
			}
			
			
			
		}
		   if (player1.getScore() > player2.getScore()) {                             // comparing the score of each 
	            System.out.println("Player 1 wins!"+ " " + player1.getScore());
	        } else if (player2.getScore() > player1.getScore()) {
	            System.out.println("Player 2 wins!" + " " + "Score" +  " " + " " + player2.getScore());
	        } else {
	            System.out.println("The game is a tie! LAME!!!!");
	        }
	    
		    System.out.println("Final Score:" + "Player 1 Score:" + " " + player1.getScore() + " " + ":" + " " + "Player 2 Score:" + " " + player2.getScore());
		    
	}
	

		// this method was created to compare the players cards . We are only comparing the rank because the suit doesn't matter. 
		
		private static int compareCards(Card p1Card, Card p2Card) {
			Rank p1Rank = p1Card.getRank();
			Rank p2Rank = p2Card.getRank();
			
			return p1Rank.compareTo(p2Rank);
			
			
			
			
		}
	   
}
	
        
	       
	
	


