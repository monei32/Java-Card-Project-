
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * a.      Instantiate a Deck and two Players, call the shuffle method on the deck.

b.     Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.

c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.

d.     Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.

e.      After the loop, compare the final score from each player.

f.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		 */
		
		
		Deck deck = new Deck(); 
		deck.shuffle();
		Player player1 = new Player(); 
		Player player2 = new Player(); 
		
		//deck.describe();
		player1.draw(deck); 
		player2.draw(deck);
		Card p1Card = player1.flipCard(); 
		p1Card.describe();
		Card p2Card = player2.flipCard(); 
		p2Card.describe();
		
		
	}

}
