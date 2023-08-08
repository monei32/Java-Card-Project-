import java.util.ArrayList;
import java.util.List;

public class Player {

	// Methods created FLip - created
	//draw - created 
	// set score - created 
	
	
	private String name;
	private int score; 
	private List<Card> hand = new ArrayList<>(); 
	
	public Player () {
		score = 0; 
	}
	
	public Card flipCard() {
		Card dealt = hand.remove(0);      
		return dealt; 
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	} 
	
	public void draw(Deck deck) {    
	 Card card =  deck.drawCard(); 
	 	hand.add(card);
	}
	
	 public int incrementScore() {
		 score++; 
		 return score; 
	 }
			
	

}
	
	

